<?php
session_start();
?>

<?php
	$inData = getRequestInfo();
	
	$userId = $_SESSION["USERR"];
	$name = $inData["namne"];
	$race = $inData["race"];
	$career = $inData["career"];
	$sessionId = $inData["sessionId"];
	$hpCurrent = $inData["hpCurrent"];
	$hpMax = $inData["hpMax"];
	$WS = $inData["WS"];
	$BS = $inData["BS"];
	$S = $inData["S"];
	$T = $inData["T"];
	$AG = $inData["AG"];
	$INTE = $inData["INTE"];
	$WP = $inData["WP"];
	$FEL = $inData["FEL"];
	$A = $inData["A"];
	$W = $inData["W"];
	$SB = $inData["SB"];
	$TB = $inData["TB"];
	$MAG = $inData["MAG"];
	$IP = $inData["IP"];
	$FPP = $inData["FPP"];
	
	$conn = new mysqli("localhost", "username", "password", "warhammer");
	if ($conn->connect_error) 
	{
		returnWithError( $conn->connect_error );
	} 
	else
	{
		$sql = "delete from characters (name, race, career, userId, sessionId, hpCurrent, hpMax, WS, BS, S, T, AG, INTE, WP, FEL, A, W, SB, TB, MAG, IP, FPP) 
				VALUES ('" . $name . "','" . $race . "','" . $career . "','" . $userId . "','" . $sessionId . "','" . $hpCurrent . "','" . $hpMax . "','" . $WS . "','" . $BS . "','" . $S . "','" . $T . "','" . $AG . "',
				'" . $INTE . "','" . $WP . "','" . $FEL . "','" . $A . "','" . $W . "','" . $SB . "','" . $TB . "','" . $MAG . "','" . $IP . "','" . $FP . "') ";
		if( $result = $conn->query($sql) != TRUE )
		{
			returnWithError( $conn->error );
		}
		$conn->close();
	}
	
	returnWithError("");
	
	function getRequestInfo()
	{
		return json_decode(file_get_contents('php://input'), true);
	}
	function sendResultInfoAsJson( $obj )
	{
		header('Content-type: application/json');
		echo $obj;
	}
	
	function returnWithError( $err )
	{
		$retValue = '{"error":"' . $err . '"}';
		sendResultInfoAsJson( $retValue );
	}
	
?>
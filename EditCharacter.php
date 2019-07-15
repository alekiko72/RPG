<?php
	$inData = getRequestInfo();
	
	$ID = $inData["ID"];
	$name = $inData["name"];
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
		$sql = "UPDATE characters SET name = '$name', race = '$race', career = '$career', userId = '$userId', sessionId = '$sessionId', hpCurrent = '$hpCureent', hpMax = '$hpMax', WS = '$WS', BS = '$BS', S = '$S', T = '$T', 
				AG = '$AG', INTE = '$INTE', WP = '$INTE', FEL = '$FEL', A = '$A', W = '$W', SB = '$SB', TB = '$TB', MAG = '$MAG', IP = '$IP', FPP = '$FPP' WHERE ID = '$ID'";
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
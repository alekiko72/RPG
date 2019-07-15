<?php
	$inData = getRequestInfo();
	
	$ID = $inData["ID"];
	$name = $inData["name"];
	$characterId = $inData["characterId"];
	
	$conn = new mysqli("localhost", "username", "password", "warhammer");
	if ($conn->connect_error) 
	{
		returnWithError( $conn->connect_error );
	} 
	else
	{
		$sql = "UPDATE items SET name = '$name', characterId = '$characterId' WHERE ID = $ID";
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
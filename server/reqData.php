<?php
if($_SERVER["REQUEST_METHOD"] == "GET")
{
	//$file = $_FILES["fileUpload"]["tmp_name"];
	//$fp = fopen($file, "wb+");
	//$result = move_uploaded_file($_FILES["fileUpload"]["tmp_name"], "/Users/diego/Desktop/school/senioryear/CS499/semProject/ParkingImage/foo.png");
	//echo $result;
	//file_put_contents("/Users/diego/Desktop/school/senioryear/CS499/semProject/ParkingImage/foo.png", );

	$command = escapeshellcmd("/Users/diego/Desktop/school/seniorYear/CS499/semProject/server.py");
	$output = shell_exec($command);
	echo "<p>". $output ."</p>";

}
else
{
	echo "failed to capture request";
}

 ?>

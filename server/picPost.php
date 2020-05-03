<?php
if($_SERVER["REQUEST_METHOD"] == "POST")
{
	$file = $_FILES["fileUpload"]["tmp_name"];
	$result = move_uploaded_file($file, "./RawPicture/input.jpg");
	$command = escapeshellcmd("python /Users/diego/Documents/GitHub/models/research/object_detection/detect_occupied_spaces.py");
	$output = shell_exec($command);
	echo $result;
}
else
{
	echo "failed to capture request";
}

 ?>

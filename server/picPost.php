<?php
if($_SERVER["REQUEST_METHOD"] == "POST")
{
	$file = $_FILES["fileUpload"]["tmp_name"];
	$result = move_uploaded_file($file, "./RawPicture/foo.png");
	echo $result;
}
else
{
	echo "failed to capture request";
}

 ?>

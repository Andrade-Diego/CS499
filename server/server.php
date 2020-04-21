	<?php
	class CustomResponse{
		public $picture_uri;
		public $foo_txt_uri;
	}
	if($_SERVER["REQUEST_METHOD"] == "GET")
	{
		$command = escapeshellcmd("/Users/diego/Documents/GitHub/CS499/server/server.py");
		$output = shell_exec($command);
		#echo $output;
		if($output == True)
		{
			$response = new CustomResponse();
			$response->foo_txt_uri = "http://127.0.0.1:8080/EditedPicture/output.txt";
			$response->picture_uri = "http://127.0.0.1:8080/EditedPicture/foo.png";
			$json = json_encode($response);
			echo $json;
		}
	}
	else
	{
		echo "failed to capture request";
	}
	?>

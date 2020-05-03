	<?php
	class CustomResponse{
		public $picture_uri;
		public $foo_txt_uri;
	}
	if($_SERVER["REQUEST_METHOD"] == "GET")
	{

		if(file_exists("./EditedPicture/output.jpg"))
		{
			$response = new CustomResponse();

            #These URLS will change once the server opens to connections from outside localhost
			$response->foo_txt_uri = "http://127.0.0.1:8080/EditedPicture/output.txt";
			$response->picture_uri = "http://127.0.0.1:8080/EditedPicture/output.jpg";
			$json = json_encode($response);
			echo $json;
		}
		else
		{
			#could send error message here or send a default picture
		}
	}
	else
	{
		echo "failed to capture request";
	}
	?>

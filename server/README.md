# server


## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. These instructions also serve as a jumping off point for continued work on the project.


### Installing

A list of things that should be installed before continuing to the rest of the instructions.
```
* Python 3
* PHP
```
As well as those two programs, the Machine Learning algorithm and app should already be available and functioning locally.


### Run
The steps to make it run with current functionality.

First, the following command should be run. This starts the PHP webserver and makes it listen for connections to all of its available IP addresses. This should make the root directory for the server be whichever directory the command is ran in. This does not always actually occur, and the admin should ensure that the correct root directory is active for the server by inspecting the output of the command.
```
/usr/bin/php -S 0.0.0.0:8080
```
Once the server is up and running, it will begin listening to connections from the app and from the Raspberry Pi. 
The connection from the Raspberry Pi code will make a POST request and is handled by picPost.php. This program allows the Raspberry Pi to post a picture to the following directory with the name "input.jpg."
```
./RawPicture/input.jpg
```
After the picture is recieved by the server, the picPost.php will run the machine learning algorithm (depending on the machine this process can last several minutes). The machine learning algorithm will then write its output in the form of a text file and an edited picture into the following files in the directory "EditedPicture."
```
./EditedPicture/output.jpg
./EditedPicture/output.txt
```
This then sends a successful response to the Raspberry Pi.

The app app then makes a GET request that is handled by server.php. This program returns a custom JSON encoded object that holds a URL for each the output.jpg and output.txt, then these are accessed directly on the app.


## Maintenance Information
Functionality currently limited since the server was set up on a machine to only run on localhost. Moving past this will require port forwarding to be set up to a specific IP address and port on the machine, then calls to the PHP programs will work remotely. 
```
SERVER_IP and SERVER_PORT subject to change once not running on localhost.
```
Some paths in this directory will have to change since they are currently set up to work on a specific machine.
In picPost.php line 6, the program runs the machine learning algorithm, with an absolute path that will have to change to wherever the machine learning algorithm is.
The file server.py is currently a test file to make the server do something before the actual machine learning algorithm was integrated.
```
Suggestion:
  - Since we were unable to get everything on one GitHub repository due to the size of the project, this path is currently to what is effectively the repository that holds the machine learning code. If one were instead to move this code into the server directory, make a call to server.py from picPost.php, and have server.py reference the machine learning algorithm, the project would be more cohesive and modular. Replacing the machine learning model would be as easy as creating a new one and changing the path listed in server.py
```
In server.php lines 14 and 15, once port forwarding is set up, instead of the current link the following "...127.0.0.1:8080..." IP address and port combination will have to change to whichever combination is being used for port forwarding.



## Future Work
When hangups occur in the program, some error messages are handled correctly, but some are not. This should be improved in the case that, for example, the server is unable to receive a picure or the links being sent to the app are empty files or non-existent files.
Since the server waits to finish the machine learning algorithm to send a response to the Raspberry Pi, this could be the trigger that makes the Raspberry Pi take another picture and send it to the server. This way the server only has to do work on one picture at a time and the picture is always relatively up to date and would only be as old as the runtime of the machine learning algorithm.


## Built With

* Python 3
* PHP

## Authors

***Diego Andrade** 


## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc

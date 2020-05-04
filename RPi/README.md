# RPi driver


## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.


### Installing

Before attempting to run this program, ensure the following are all already installed. The libraries can be installed using pip.

```
* Python 3
* Requests Library
* PiCamera Library
* Time Library

```


### Run

```
python rpi.py
```

## Curent Functionality
Since this code was created without direct access to Raspberry Pi, functionality is currently limited.
Currently, in rpi.py, the driving function is picFromFile
```
RPi code using this function takes a given image in the ./rpiPicture directory and using the Python Requests library makes a POST request to the server which is handled by picPost.php
```
## Future Functionality
picFromRPI is a commented-out, outline for a function that would be able to send an image taken by the RPi's camera to the server. Ideas and problems to pursue in the future:
```
 - PiCamera() object has resolution feature, can find some optimal resolution where the picture is still practical but not so high-resolution that it takes a long time to send.
  - Similarly for preprocessing, some amount of work that can be done by the RPi that speeds up transmission without being hampered by its low computing power would improve functionality for end user.
 - Camera has warm-up time, requesting a new picture may be inefficient since warm-up time can contribute to lag experienced by user.
 - Currently has no way to process a request for a new picture, since the machine learning algorithm could take minutes to run, it was decided that the RPi would simply have a loop where it would send a picture about every minute.
```

## Maintenance Information
```
SERVER_IP and SERVER_PORT subject to change once not running on localhost. These variables change in rpi.py and the variables are on lines 9 and 10.
```

## Built With

* Python 3

## Authors

***Diego Andrade** 


## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc

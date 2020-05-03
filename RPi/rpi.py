#!/usr/bin/env python

#from time import sleep
import requests
#from picamera import PiCamera


#these will change when the code is no longer run locally on the server machine
SERVER_IP = "http://127.0.0.1"
SERVER_PORT = "8080"

#software on rpi is not installed on my local machine so I had to comment this out
#in order to run it, this should be the general idea for the code to put on the rpi
'''
def picFromRPI(pictureFile):
	camera = PiCamera()
	camera.resolution = (1024, 768)
	camera.start_preview()
	# Camera warm-up time
	sleep(2)
	camera.capture('foo.jpg')
	while (True):
		sleep(60)
		camera.capture('foo.jpg')
		url = SERVER_IP + ":" + SERVER_PORT + "/ParkingImage/foo.jpg"
		response = requests.post(url, data = )
'''

#sort of dummy code, works to send a given picture
#making sure we can update pictures since the rpi isn't set up
def picFromFile(pictureFile):
	url = SERVER_IP + ":" + SERVER_PORT + "/picPost.php"
	fp = open(pictureFile, "rb")
	r = requests.post(url, files={'fileUpload': fp})
	fp.close()
	if(r.ok):
		print("image transmitted successfully")
		return 0
	else:
		print("error: ", r.status_code, r.reason)
		return r.status_code

if __name__ == "__main__":
	picFromFile("./rpiPicture/input.jpg")

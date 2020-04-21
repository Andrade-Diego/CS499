#!/usr/bin/env python

from time import sleep
import requests
import base64
import json
from shutil import copyfile
#from picamera import PiCamera

SERVER_IP = "http://127.0.0.1"
SERVER_PORT = "8080"

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
	picFromFile("./rpiPicture/foo.png")

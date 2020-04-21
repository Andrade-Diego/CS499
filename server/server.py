#!/usr/bin/env python

RPI_IP = '127.0.0.1'
RPI_URL = RPI_IP + "/rpi.py"

def MachineLearning():
	#make sure we can get an uploaded file to go to the edited section
	picture = open(r"./RawPicture/foo.png", "rb")
	newPicture = open(r"./EditedPicture/foo.png", "wb+")
	newPicture.write(picture.read())
	picture.close()
	newPicture.close()
	#make sure we can produce a text file
	file = open(r"./EditedPicture/output.txt", "w+")
	file.write("we can add stuff to the file")
	file.close()

def Server():
	#print("hello")
	MachineLearning()
	return "True"

if __name__ == "__main__":
	print (Server())

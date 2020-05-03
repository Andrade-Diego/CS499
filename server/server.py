#!/usr/bin/env python


def MachineLearning():
    #this is currently not directly incorporated to the Server.py program
    #instead picPost.php calls code from Alex's machine learning repository

def Server():
	#this opens the file of the picture sent by the RPi
	picture = open(r"./RawPicture/foo.png", "rb")

    #this opens the file for the picture to be produced by the machine learning algorithm
    newPicture = open(r"./EditedPicture/foo.png", "wb+")

    #make sure we can produce a text file to describe output of machine learning algorithm
    txtFile = open(r"./EditedPicture/output.txt", "w+")

    MachineLearning(picture, newPicture, txtFile)

    #this writes an image to the output file and describes the output of machine learning algorithm
	newPicture.write(picture.read())
    txtFile.write("we can add stuff to the file")


	picture.close()
	newPicture.close()
    txtFile.close()

    retun True

if __name__ == "__main__":
	print (Server())

# TensorFlow API- Detecting Parking Lot Spaces Occupied/Empty
This README include directions on how to setup a working version of the tensorflow API for our specific parking lot detection project

Since the tensorflow API is too large to properly push to this directory, I have forked my modifications to the repository shown below.
* [Tensorflow Object Detection API(v1.13.0)](https://github.com/apschuster/models/tree/r1.13.0) - Object Detection API
* WARNING: At the moment, this will only work out of the box for windows users. The paths have not been made in a way that mac/linux users can run this without changing from '\\' to '/'


## Getting Started

Loose Instructions: https://www.geeksforgeeks.org/ml-training-image-classifier-using-tensorflow-object-detection-api/
* These are loose instructions that my own instructions will be slightly based on. They are only meant to give a reference point to how I initially setup/trained my system- DO NOT follow these instructions.

The instructions below will get you a copy of the project up and running on your local machine for development and testing purposes.

### System Requirements
* Windows 10, 64 bit

### Prerequisites

What things you need to install the software

```
Pip version 19.0.0 or newer
Python 3.x (3.7.4 in my case)
A clone of my modification of the object detection API at: Tensorflow Object Detection API(v1.13.0)(https://github.com/apschuster/models/tree/r1.13.0)
pip install tensorflow==1.15.0
pip install protobuf
pip install pillow
pip install lxml
pip install Cython
pip install matplotlib
pip install pandas
pip install opencv-python 

```

### Installing

A step by step series of examples that tell you how to get a development env running

If not already installed, install python 3 (3.7.4) and pip (19.0.0 or newer) on your system, links/instructions are provided below.
```
https://www.python.org/downloads/release/python-374/
https://pip.pypa.io/en/stable/installing/
```

Using pip, install the packages listed under prerequisites above.

```
pip install...
```

Clone my forked modified version of the object detection API linked below.

```
Tensorflow Object Detection API(v1.13.0): https://github.com/apschuster/models/tree/r1.13.0
```

Navigate to the models\research directory and run the commands shown below.

```
python setup.py build
python setup.py install
```

End with an example of getting some data out of the system or using it for a little demo


## Maintenance Information (Training new models..)

## Deployment

Will add when relevant.

## Built With

* [Tensorflow (v1.15.0)](https://www.tensorflow.org/versions/r1.15/api_docs/python/tf) - ML Library used
* [Tensorflow Object Detection API(v1.13.0)](https://github.com/apschuster/models/tree/r1.13.0) - Object Detection API


## Authors

* **Alex Schuster** 

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc

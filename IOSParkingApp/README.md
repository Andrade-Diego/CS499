# IOS Application


## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### System Requirements
* Visual Studio 16.5 (2019)
* Xcode for iOS simulator (Only Mac user)

### Prerequisites

What things you need to install the software

```
- Good internet connection to make the download faster
- Should have at least 15Gb free space on your machine

```

### Installing

A step by step series of examples that tell you how to get a development env running


```
After running xamarin visual studio
 Step 1. Download the 3 three files of the project UKSmartParking.iOS, UKSmartParking, and UKSmartParking.sln 
 Step 2. Open the UKSmartParking.sln with Xamarin Visual Studio
 Step 3. On the Solution section to the left, right click on UKSmartParking -> reload (To upload all the source code file)
 Step 4. Repeat step 3 for UKSmartParking.iOS
 Step 5. Install Newtonsoft.Json in order to handle JSON packages from the server
```


End with an example of getting some data out of the system or using it for a little demo

### Modifying to work in a new environment
A description of how the app interfaces with the server and how to make changes to StackPage.xaml.cs in the future when the project is finalized and moved to its permanent environment.

Communication with ther server functions with HTTP requests where the app recieves a custom JSON encoded response from the server. To do this, System.Net.Http was imported to use an instance of the HttpClient class in order to call the GetAsync function. GetAsync takes a URL as a parameter and makes a GET request. Currently this URL points to 127.0.0.1:8080 which is the localhost IP address that was used for testing. In line 33 of the files:
```
string runPHP = "http://127.0.0.1:8080/server.php";
          
```
should be changed to reflect the IP address and port reserved for the server in its new environment.

In this same file, a class was created named ServerResponse. This class is the prototype for the JSON encoded response that should be recieved from the server. In the future if more robust functionality is required, this class would have to change in tandem with its corresponding class in the server.PHP file in order to maintain functionality.

## Maintenance Information
```
You can add more features and get a better design on the application according to the users need.

Maintenance and Understanding of the UKSmartParking.Xamarin

Stackpage.xaml/StackPage.xaml.cs
 Main page of the app (Design and code)
    -Toolbar
    -Option buttom
    -Refresh button
    -Picture
Rules.xaml/Rules.xaml.cs
    Option page (mainly has four buttoms)
       -About the page 
       -Campus map
       -Parking regulation
       -Question
AboutApp.xaml/About.xaml.cs
     Short description of the app.
CampusMap.xaml/CampusMap.xaml.cs
     click buttom of the top of the page to show the web page of the university of Kentucky Map.
     the user can navigate to the page has he/she was on an actual webpage.
ParkingRegulations.xaml/ParkingRegulations.xaml.cs
     click buttom on the top of the page to take the user to the university of kentucky parking and permit regulations provided by the university of kentucky transportation service website
Question
      .
```

## Built With

* Xamarin 2019 

## Authors

* **Kay Guerschom** 
* **Diego Andrade**

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc

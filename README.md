# marisol
MariSol(Martians Sol) v0.6.43.7
-------------------------------------------
It is a project based on java to manage the images taken by a rover in time of MAR sol (Martian rotation or day). The project loads the data from some images taken by the rovers and executes some validations using the NASA API.

REQUIREMENTS
--------------------------
The project has been developed with IDE NetBeans 12.1 in Windows 10.
To execute this application is necessary JDK15.
The folder where it is executed needs a data folder, in this folder all data and activity log are collected from the rovers specified, review SETTING section for this.
A settings.json file is necessary to the basic configuration of the project.
The project uses the json-20210307.jar file, it is in the lib folder of the project.
It is necessary to use a NASA API KEY to consume the NASA REST SERVICE, https://api.nasa.gov/.
The project use JUnit4 to execute the unit test.


SETTINGS
-------------------
The project uses a settings.json file in the same folder of the execution file. this file has the following structure:


{
    "api_key":"<nasa_api_key>",
    "noe":1,
    "rovers":[
                    "curiosity",
                    "opportunity",
                    "spirit"
    ]
}

Where the 
     - api_key: It is the API KEY associated to you NASA account.
     - noe: It is the number of executions for the evaluation, at the moment it is under development.
     - rovers: It is the list of rovers to be evaluated

The structure of the project should be equal to:

--+ marisol/
         + data/
         + lib/
              + json-20210307.jar
         + marisol.jar
         + settings.json

EXECUTION
-----------------
It is possible to execute the project using the marisol.jar, or if you are using an IDE to open the project, the main class is marisol/Marisol.java.  Another option is execute unit tests in the test package: marisol.challenge.ChallengerTest.java


LOG Files
--------------
During the execution the application takes the settings in the settings file for the execution. As result of the execution the application shows the activity in the console, but additional to this, activities logs are generated to take record of the activity and result of the application.

--+ marisol/
         + activity_<execution_date>.log
         + data/
               + <rover>/
                        + challenge_<execution_date>.log




The objective of these files are:

         - activity_<execution_date>.log: It is a summary of the evaluation activity for the photos taken by the rovers.
          - challenge_<execution_date>.log: It contains detailed information about the evaluation activity of the rovers, in this file the result of each point of the challenge is described.


DATA files
----------------
These files are generated during the execution of the application in the respective rover folder (./data/<rover>) and contains the data for different purpose, these files are:

    - Photos_Earth_Date.json: It contains the data of all photos taken using Earth Date requests. 
    - Photos_Mars_Sol.json: It contains the data of all photos taken using 1000 Martian Sol request. 
    - Photos_10_Earth_Date.json: It contains the data of the first 10 photos taken using Earth Date requests. 
    - Photos_10_First_Mars_Sol.json: It contains the data of the first 10 photos taken using 1000 Martian Sol requests. 
    - photosNotExist_ED.json: It contains the data of the photos that exist in the first 10 photos of the 1000 Martian Sol requests but not in the Earth Date requests.  
    - photosNotExist_MS.json: It contains the data of the photos that exist in the first 10 photos of the Earth Date requests but not in the 1000 Martian Sol requests.  

NOTES
---------------

   - The java jar execution file is in the dist folder of the project.
   - If you r are executing the tool on Windows, I suggest BareTail to review the logs.



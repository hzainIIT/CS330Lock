# CS330Lock

This program was created using eclipse in the Java programming language. It was tested on Ubuntu 22.04.1 LTS and a Mac. please ensure that all Java packages are pre-installed. They can be found here: https://www.oracle.com/java/technologies/downloads/

## Building an Executable: 
Navigate to the directeroy where you would like to clone the project.

After running 
`git clone https://github.com/hzainIIT/CS330Lock.git`

You will have the program inside that directory.
From here you can open a commnad line and navigate to the directory which you cloned the repository. 

Verify through the `ls`Command 

Make sure the following files are in the directory
`main.jar     Manifest.txt      lockbreak.jar     MainifestLock.txt     README.md`

After validation run the following command:
`javac main.java`

Following that, run:
`jar cfm main.jar Manifest.txt main.class`

Upon the completion of these commands you can now run the code with the following command
`java -jar main.jar`

Or through double clicking the main.jar file in the directory. Clicking "ctrl C" will end the program.

# Memo
## The System
This program works in a very simple manner. It asks the user to input a 6 digit number in order to “lock” or “unlock” a keypad. In this case it is the 5 least significant of my ID 61488.
Following those numbers is one of two numbers, either 1 or 4. 1 is to Unlock the machine and 4 is to lock it. 
The moment any configuration of the above mentioned numbers is entered the system will detect it and in return enter the respective state. Any other characters other than digits 0-9 are silently ignored by the system.

## The Theory
This program works by taking in a string of characters. Initially creating six character length phrases from the input string. Following that the system removes anything that is not a digit 0-9. From there it does a comparison to the lock and unlock codes. If either is a match the system will enter that state. 

## Lockbreak Guess
Systematically for someone to guess six digits randomly it would have over 2 billion combinations, this may sound large but is not accounting for the 10^6 chance of getting the correct code. Assuming that there is one second between each attempt, and that we would only need 1 million of the 2 billion attempts we can calculate between a 7-10 day window for the amount of time it would take to solve the code. 

## Lockbreak Test
Now looking at the lockbreak.java you can follow the steps bellow to create an executable. We see that we get about 500,000 seconds which equates to about 6 days, very close to my estimation. 

Run the following command:
`javac lockbreak.java`

Following that, run:
`jar cfm lockbreak.jar ManifestLock.txt lockbreak.class`

Upon the completion of these commands you can now run the code with the following command
`java -jar lockbreak.jar`

Or through double clicking the lockbreak.jar file in the directory. Clicking "ctrl C" will end the program.


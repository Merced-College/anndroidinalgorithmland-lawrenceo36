[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=23133561)
# AnnDroidInAlgotihmLand
Lawrence Oro

a sample project to practice sorting and searching

🎵 Download Required Audio File

This project uses an audio file that is too large to store directly in the GitHub repository.
Please download the file from Google Drive before running the program.

Download the audio file here:

➡️ Download the required audio file from Google Drive

Instructions

Open the Google Drive folder using the link above.

Download the ZIP file that contains the audio file.

Extract (unzip) the file on your computer.

Place the extracted audio file into the project folder named content.

Download all of the whole content folder, and put this in your project

Project setup completed successfully

## Code Exploration 

EXAMINING PROJECT STRUCTURE

1. The files that are located in the src file are the different class files that run the program (the backend)
all the logic that is used to make this program run is stored in the src file.

2. All of the audio and visual graphics for this program seem to be stored inside of the content folder.

3.The purpose of the uml is to give you (the developer) a visual of the relationships between each one of your classes and files in your program.

4.The purpose for why most software projects will have a separation between the code and the content/assets is due to easy navigation, as a developer, as you're adding and implementing so many things it can get messy and confusing to navigate your project. Keeping a clear separation between the two gives for easy, maintenance, future scaling, update, and overall cooperate on.
 
 LOCATING THE MAIN PROGRAM
 
 1. The main class is the class in which the main method is sitting inside of.
 
 2.As soon as the program starts running the main does a method call to run the code on the UI thread as soon as the Swing is ready.
 In turn when running the program the program spits out a UI box where it displays the graphics to the program allowing for UserInteraction. 
 
 3.The objects that are created when you first run the program are the JFrame and AppRouter. JFrame is the main programs game window, and the AppRouter is what will help your program with screen transitions. 
 
 FOLLOWING THE PROGRAM EXECUTION 
 
 1.The AppRouter class seems to be responsible for the drawing of graphics.
 
 2. The asset class is the class responsible for loading the files and contents of the program
 
 3. The game seems to be updating based off of java's swing event-driven model only calling to repaint() when the state of the game actually changes such as timer ticks, and user clicks.
 
 EXAMINING THE UML DIAGRAM
 
 1.The UML diagram helps in understanding the structure of the program such that you are able to see what objects get created from what classes and what classes own what methods.
 
 2. The AppRouter class appears to be the central calls in the entire system 
 
 3. The MainMenuPanel, RabbitGamePanel, and LeaderboardPanel classes all depend on the AppRouter class and each of these individual classes own further classes/methods
 
 IDENTIFYING THE SCORE SYSTEM
 
 1. Scores seem to be stored inside of the ScoreEntry class
 
 2. The int data type is used to store scores
 
 3. It would most make sense for a sorting of scores to be done inside of a leaderboard system as each user is completing the game.
 
 # Sorting
 
 1. I added the sorting code inside of the LeaderboardAlgorithms class
 
 2. I chose this location because all scores will be added to the leaderboard once the game is completed, this is where sorting matters. It will make for easy lookup of the highest scores.
 
 3. The data structure that is being sorted is an ArrayList
 
 TESTING THE SORTING 
 
 1. The sorting algo that I chose to use was a selection sort
 
 2. The selection sort work by holding a max position(typically the start of the list)  where if any value lower than the max gets left in place while the value greater than the current max position will be swapped to the front and your max position now moves to the value next in the list. In turn this gives you a sorted list in descending order from highest -> lowest.
 
 3.I verified that my sort was correct by loading the csv leaderboard in the game window where I was able to see that the scores were sorted from highest -> lowest.
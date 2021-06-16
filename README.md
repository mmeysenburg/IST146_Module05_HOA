# IST146_Module05_HOA

By now, you have read about Java exception handling, file I/O, streams, and accessing data from the Internet, watched some lecture videos on these topics, and have taken an assessment quiz to test your understanding. Now it is time to get your hands on with these concepts! In this module's HOA, you will use local file I/O and streams to work with another subset of the movie database we learned about in this module's examples. 

## Instructions

1. Log on to your replit account. 
2. Click the "+ New repl" button to create a new repl. 
3. Click on the "Import from GitHub" tab. 
4. Type or paste the following URL into the "Paste any repository URL" text field: `github.com/mmeysenburg/IST146_Module05_HOA`
5. Click on the "Import from github" button.
6. Click the "Done" button in the ".replit" dialog that appears.
7. From the "Console" tab, enter the following command: `rm .replit` *If you omit this step, the "Run" button will not work as it should!*
8. Select the `MovieData.java` file. Search for the keyword "TODO", and write the specified code.
9. At any time you can run the code from the user's perspective, or, from a developer's point of view, execute the unit tests that have been provided.
  * To run the code, click the "Run" button.
  * To execute the unit tests (if any), enter the following command in the "Console" tab: `bash test.sh`
10. Once you have completed the code correctly, the unit tests (if any) should pass, and running the code should produce results that make sense.
11. When you are finished, submit your `MovieData.java` file via the Canvas assignment.

## Files in the repository

* `movie-test.csv`: Artificial movie data file for unit tests.
* `movies.csv`: Subset of the IMDb movie database, in CSV format.
* `Main.java`: Main program to run the code from a user's perspective. This file's `main()` method is invoked when you click the "Run" button.
* `Movie.java`: Class representing a movie with a title, year, and runtime.
* `MovieData.java`: Class for calculating a simple statistic for some movie data file. This is the only file you should edit.
* `MovieDataTest.java`: JUnit4 tests for the MovieData class.
* `README.md`: This README file.
* `test.sh`: Bash script to execute the JUnit4 unit tests in MovieDataTest.java
* `LICENSE`: GNU General Public License v3.0 for these materials.

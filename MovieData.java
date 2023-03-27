import java.io.*;
import java.util.*;
import java.util.stream.*;

/**
 * Class to produce statistics of movies held in a simple CSV file.
 * The format of the file must me: title,year,runtime
 * where title is the movie's title as a string, year is the integer
 * year the movie was made, and runtime is the integer runtime of the
 * movie. 
 */
public class MovieData {
  /**
   * Load movie CSV file into a list of Movie objects.
   *
   * @param fileName Name of movie CSV file to load
   * @return List<Movie> containing Movie objects build from the
   * CSV file.
   */
  public List<Movie> buildList(String fileName) {
    ArrayList<Movie> movieList = new ArrayList<>();

    // TODO: use a try with resources block and a nested loop
    // to read the data from the input file, turn each line into
    // a Movie object, and add each Movie object to movieList.
    //
    // Parse each line read in with a Scanner, using a comma delimiter.
    //
    // The only exception you should need to catch is FileNotFoundException.
    // The movies.csv file has valid years and runtimes for all of the 
    // included movies.


    movieList.trimToSize();
    return movieList;
  }

  /**
   * Given a list of Movie objects, count the number of movies
   * that were made in a given year.
   *
   * @param movies List of Movie objects to process.
   * @param year Four-digit integer containing the year.
   * @return The number of Movie objects in the list made in the 
   * specified year.
   */
  public long numMoviesForYear(List<Movie> movies, int year) {
    long num = 0;

    // TODO: use stream processing with a filter and a lambda 
    // expression to determine the value of num -- i.e., the number
    // of movies in the list for the specified year. 


    return num;
  }

}

import java.util.*;

/**
 * IST 146 Module 5 HOA -- more processing of a simple
 * movie dataset. 
 */
class Main {
  /**
   * Application entry point. 
   *
   * @param args Command-line arguments; ignored by this app.
   */ 
  public static void main(String[] args) {
    MovieData md = new MovieData();

    List<Movie> movieList = md.buildList("movies.csv");

    Scanner stdin = new Scanner(System.in);
    System.out.print("Enter a year (yyyy): ");
    int year = stdin.nextInt();
    System.out.printf("Number of movies made in %d: %d\n",
      year, md.numMoviesForYear(movieList, year));

  }
}
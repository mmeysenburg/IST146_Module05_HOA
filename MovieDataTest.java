import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test class for the MovieData class.
 */
public class MovieDataTest {

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {

  }

  @Test
  public void testBuildData() {
    MovieData md = new MovieData();
    List<Movie> movies = md.buildList("movie-test.csv");

    // right size read?
    assertEquals(500, movies.size());

    // all titles correct? 
    for(int i = 0; i < 500; i++) {
      String title = String.format("Test Movie %03d", i);
      assertEquals(title, movies.get(i).getTitle());
    }

    // count for each year correct?
    Map<Integer, Integer> yearCount = new HashMap<>();
    for(Movie m : movies) {
      int year = m.getYear();
      int count = 1;
      if(yearCount.containsKey(year)) {
        count = yearCount.get(year) + 1;
      }
      yearCount.put(year, count);
    }

    int[] testYears = {1888, 1952, 1966, 1994, 2021};
    for(int year : testYears) {
      assertEquals(100, (int)yearCount.get(year));
    }

    // statistics for runtimes correct?
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    double mean = 0.0;
    for(Movie m : movies) {
      int rt = m.getRunTime();
      if(rt < min) {
        min = rt;
      }
      if(rt > max) {
        max = rt;
      }
      mean += rt;
    }
    mean /= 500.0;

    assertEquals(45, min);
    assertEquals(180, max);
    assertEquals(111.75, mean, 0.01);
  }

  @Test
  public void testNumMoviesForYear() {
    int[] testYears = {0, 1888, 1952, 1966, 1994, 1999, 2021};
    long[] counts = {0, 100, 100, 100, 100, 0, 100};

    // test years in the data and years not in the data
    MovieData md = new MovieData();
    List<Movie> movies = md.buildList("movie-test.csv");
    for(int i = 0; i < testYears.length; i++) {
      assertEquals(counts[i], md.numMoviesForYear(movies, testYears[i]));
    }
  }

  /**
   * Test launcher.
   *
   * @param args Command-line arguments; ignored by 
   * this application
   */
  public static void main(String[] args) {
    org.junit.runner.JUnitCore.main("MovieDataTest");
  }
}
/**
 * Class encapsulating the title, year, and runtime of a movie.
 */
public class Movie {
  private String title;
  private int year;
  private int runTime;

  public Movie() {
    setTitle("n/a");
  }

  public Movie(String title, int year, int runTime) {
    setTitle(title);
    setYear(year);
    setRunTime(runTime);
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
  }

  public void setYear(int year) {
    if(year > 0) {
      this.year = year;
    }
  }

  public int getYear() {
    return year;
  }

  public void setRunTime(int runTime) {
    if(runTime > 0) {
      this.runTime = runTime;
    }
  }

  public int getRunTime() {
    return runTime;
  }

  @Override
  public String toString() {
    return String.format("%s (%d): %d min.",
      getTitle(), getYear(), getRunTime());
  }
}
import java.util.*;
import java.util.stream.Collectors;

public class MainClass {


  static Scanner n = new Scanner(System.in);
  static void printArray(ArrayList<Movie> movies){
    movies.forEach((movie -> System.out.println(movie.toString())));
  }
  static void searchGenre(ArrayList<Movie> movies){
    System.out.println("please type the name of the genre");
    String GENRE = n.next();
    ArrayList<Movie> filtered = (ArrayList<Movie>) movies.stream().filter((movie) -> movie.genre().equals(GENRE)).collect(Collectors.toList());
    if(!filtered.isEmpty()){
      filtered.forEach((movie -> System.out.println(movie.toString())));}
    else {
      System.out.println("error. this genre does not exist in the system");
    }
  }

  static void sortMovies(ArrayList<Movie> movies){
    movies.sort((current,next) -> roundFloat(next.rating() - current.rating()));
    movies.forEach((movie -> System.out.println(movie.toString())));
  }

  static void highestMovieRated(ArrayList<Movie> movies){
    ArrayList<Movie> filtered = (ArrayList<Movie>) movies.stream().sorted((current,next) -> roundFloat(next.rating() - current.rating())).collect(Collectors.toList());
    System.out.println(filtered.get(0).toString());
  }

  static void searchMovieByName(ArrayList<Movie> movies){
    System.out.println("please type the name of the movie");
    String  movieName = n.next();
    ArrayList<Movie> filtered = (ArrayList<Movie>) movies.stream().filter((movie) -> movie.name().equals(movieName)).collect(Collectors.toList());
    if(!filtered.isEmpty()){
      filtered.forEach((movie -> System.out.println(movie.toString())));}
    else {
      System.out.println("error. this movie name does not exist in the system");
    }
  }

  static void addMovie(ArrayList<Movie> movies){
    String movieName,Genre,movieNameForDelete;
    float score;

    System.out.println("please type the name of the movie");
    movieName = n.next();
    System.out.println("please type the genre");
    Genre = n.next();
    System.out.println("please type the score for the movie");
    score = n.nextFloat();
    movies.add(new Movie(movies.size(),movieName,Genre,score));
    System.out.println("new movie added successfully");
  }

  static void removeMovie(ArrayList<Movie> movies){
    System.out.println("please type the name of the movie you want to remove");
    String movieNameForDelete = n.next();

    ArrayList<Movie> filtered = (ArrayList<Movie>) movies.stream().filter((movie) -> movie.name().equals(movieNameForDelete)).collect(Collectors.toList());
    if(!filtered.isEmpty()){
      movies.removeIf((movie -> movie.name().equals(movieNameForDelete)));
      System.out.println("the movie was deleted");
    } else {
      System.out.println("error. this movie name does not exist in the system");
    }


  }

  public static void main(String[] args) {

    ArrayList<Movie> movies = new ArrayList<>();

    // Add movies info
    movies.add(new Movie(1, "Matrix", "Sci-Fi", (float) 8.7));
    movies.add(new Movie(2, "Pirates Of The Caribbean", "Fantasy", (float) 8.1));
    movies.add(new Movie(3, "Titanic", "Drama", (float) 7.7));
    movies.add(new Movie(4, "Inception", "Sci-Fi", (float) 8.8));
    movies.add(new Movie(5, "Ted", "Comedy", (float) 7.0));

    System.out.println("welcome to movie system.");
    System.out.println("press 1 to see all the movies we have in the system");
    System.out.println("press 2 to search movie based on chosen genre");
    System.out.println("press 3 to search all the movies based on the ranking of the scores");
    System.out.println("press 4 to see the movie with the highest score on our system.");
    System.out.println("press 5 to search the movie based on word search");
    System.out.println("press 6 to add movies into the system");
    System.out.println("press 7 to remove movies from the system");
    System.out.println("press 8 to exit");

  int commandInput = n.nextInt();
  while (commandInput != 8){
    switch (commandInput){
  case 1:
    printArray(movies);
    break;
  case 2:
    searchGenre(movies);
    break;
      case 3:
        sortMovies(movies);
        break;
      case 4:
        highestMovieRated(movies);
        break;
      case 5:
        searchMovieByName(movies);
        break;
      case 6:
        addMovie(movies);
        break;
      case 7:
        removeMovie(movies);
      default:
        System.out.println("error. command not exist");

        }
    System.out.println("press 1 to see all the movies we have in the system");
    System.out.println("press 2 to search movie based on chosen genre");
    System.out.println("press 3 to search all the movies based on the ranking of the scores");
    System.out.println("press 4 to see the movie with the highest score on our system.");
    System.out.println("press 5 to search the movie based on word search");
    System.out.println("press 6 to add movies into the system");
    System.out.println("press 7 to remove movies from the system");
    System.out.println("press 8 to exit");
    commandInput = n.nextInt();
}


    System.out.println("goodbye");

  }

  private static int roundFloat(float numberToRound) {
    int rounded;

    if ((numberToRound > 0) && (numberToRound < 1)) {
      rounded = 1;
    } else if ((numberToRound > -1) && (numberToRound < 0)) {
      rounded = -1;
    } else {
      rounded = Math.round(numberToRound);
    }

    return (rounded);
  }
}

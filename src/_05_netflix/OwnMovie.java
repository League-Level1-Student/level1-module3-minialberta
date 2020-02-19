package _05_netflix;

public class OwnMovie {
public static void main(String[] args) {
Movie one=new Movie("one",1);
Movie two=new Movie("two",2);
Movie three=new Movie("three",3);
Movie four=new Movie("four",4);
Movie five=new Movie("five",5);
one.getTicketPrice();
NetflixQueue n= new NetflixQueue();
n.addMovie(one);
n.addMovie(two);
n.addMovie(three);
n.addMovie(four);
n.addMovie(five);
n.printMovies();

System.out.println("The Best Movie is "+n.getBestMovie());
n.sortMoviesByRating();
System.out.println(n.getMovie(1));
}
}

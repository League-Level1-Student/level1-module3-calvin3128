
public class MoviePlayer {
public static void main(String[] args) {
	Movie inter = new Movie("Interstellar", 5);
	Movie so2001 = new Movie("2001: A Space Odyssey", 2);
	Movie gb = new Movie("Green Book", 5);
	Movie inc = new Movie("Inception", 4);
	Movie pe = new Movie("Polar Express", 3);
	System.out.println(inter.getTicketPrice());
	
	NetflixQueue que = new NetflixQueue();
	que.addMovie(inter);
	que.addMovie(so2001);
	que.addMovie(gb);
	que.addMovie(inc);
	que.addMovie(pe);
	
	que.printMovies();
	System.out.println("The best movie is " + que.getBestMovie());
	System.out.println("The second best movie is " + que.getMovie(1));
}
}

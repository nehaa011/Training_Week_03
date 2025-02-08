package MovieManagementSystem;

public class MovieManagementSystem {
    public static void main(String[] args){
        MovieLinkedList movie = new MovieLinkedList();

        movie.addAtBeginning("Sholay", "Ramesh Sippy", 1975 , 8.7);
        movie.addAtBeginning("Lagaan", "Ashutosh Gowariker", 2001, 8.1);
        movie.addAttEnd("Dilwale Dulhania Le Jayenge", "Aditya Chopra", 1995, 8.0);
        movie.addAtPosition(2, "3 Idiots", "Rajkumar Hirani", 2009, 8.4);

        //movie.removeMovie("Lagaan");

        //movie.searchMovie("Aditya Chopra");

        //movie.displayForward();

        //movie.displayForward();

        movie.updateRating("3 Idiots", 9.4);
        movie.displayForward();

    }

}

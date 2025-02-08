package MovieManagementSystem;

public class MovieLinkedList {

    class Node{
        String movieTitle;
        String director;
        int yearOfRelease;
        double rating;
        Node next;
        Node prev;

        Node(String movieTitle, String director, int yearOfRelease, double rating){
            this.movieTitle=movieTitle;
            this.director= director;
            this.yearOfRelease= yearOfRelease;
            this.rating= rating;
            this.next=null;
            this.prev= null;
        }

    }

    Node head;
    Node tail;


    //1.  Add a movie record at the beginning, end, or at a specific position.

    //Add a movie record at the beginning
    public void addAtBeginning(String movieTitle, String director, int yearOfRelease, double rating){
        Node newNode= new Node(movieTitle, director, yearOfRelease,rating);
        if(head==null){
            head=tail= newNode;
            return;
        }

        newNode.next= head;
        head.prev= newNode;
        head= newNode;
    }

    //Add a movie record at the end
    public void addAttEnd(String movieTitle, String director, int yearOfRelease, double rating){
        Node newNode= new Node(movieTitle, director, yearOfRelease,rating);
        if(tail== null){
            head=tail= newNode;
        }
        tail.next= newNode;
        newNode.prev=tail;
        tail= newNode;
    }


    // Add a movie at a specific position
    public void addAtPosition(int position, String movieTitle, String director, int yearOfRelease, double rating){
        Node newNode= new Node(movieTitle, director, yearOfRelease,rating);
        if (position <= 0) {
            System.out.println("Invalid position.");
            return;
        }

        if(position==1){
            addAtBeginning(movieTitle,director,yearOfRelease,rating);
            return;
        }

        Node temp=head;
        int count=1;
        while(temp !=null && count<position){
            temp=temp.next;
            count++;
        }
        newNode.next = temp;
        newNode.prev= temp.prev;
        temp.prev.next= newNode;
        temp.prev=newNode;
    }


    //2.  Remove a movie record by Movie Title.
    public void removeMovie(String title){
        Node temp=head;
        while(temp!= null && !temp.movieTitle.equals(title)){
            temp=temp.next;
        }

        // If the movie is not found
        if(temp== null){
            System.out.println("Movie not found");
        }

        // If the node to remove is the head
        if(temp==head){
            head=head.next; // Move head to the next node
            if (head != null) {
                head.prev=null;  // Disconnect the old head
            }
        }

        // If the node is somewhere in the middle or end
        if(temp.prev != null ){
            temp.prev.next = temp.next;
            temp.next.prev= temp.prev;
        }
    }


    //3. Search for a movie record by Director or Rating.
    public void searchMovie(String director){
        Node temp= head;
        int count=1;
        while(temp != null ){
            if(temp.director.equals(director)){
                System.out.println("Movie Found at " + count + "position." + "\n Movie Name: "+ temp.movieTitle + "\n Director: "+ director + "\n Year of Release: "+ temp.yearOfRelease + "\n Rating: " + temp.rating );
            }
            count++;
            temp = temp.next;
        }
        return;
    }


    //4. Display all movie records in forward order.
    public void displayForward(){
        Node temp= head;
        while(temp!=null){
            System.out.println("Movie Name: "+ temp.movieTitle + " |  Director: "+ temp.director + " |  Year of Release: "+ temp.yearOfRelease + " |  Rating: " + temp.rating);
            temp=temp.next;
        }
        return;
    }


    //Display all movie records in reverse order.
    public void displayReverse(){
        Node temp =head;
        while (temp.next != null) {
            temp = temp.next;
        }

        while (temp != null) {
            System.out.println("Movie Title: " + temp.movieTitle + " |  Director: " + temp.director + " | Year of Release: " + temp.yearOfRelease + " |  Rating:" + temp.rating);
            temp = temp.prev;
        }
        return;
    }


    //5. Update a movie's Rating based on the Movie Title.
    public void updateRating(String title, double rating){
        Node temp= head;
        while(temp!= null){
            if(temp.movieTitle.equals(title)){
                temp.rating= rating;
            }
            temp=temp.next;
        }
        return;
    }
}


//package SocialMediaFriendConnections;
//
//public class FriendLinkedList {
//    class Node{
//        int userId;
//        String name;
//        int age;
//        int[] friends;
//        Node next;
//
//        Node(int userId, String name, int age, int[] friends){
//            this.userId= userId;
//            this.name= name;
//            this.age=age;
//            this.friends=friends
//            this.next= null;
//        }
//    }

    private Node head;

//    // Add a new user to the Beginning
//    public void addUserAtBeginning(int userId, String name, int age, int[] friends){
//        Node newNode= new Node(userId, name, age, friends);
//
//        if(head==null){
//            head= newNode;
//        }
//
//        newNode.next= head;
//        head= newNode;
//        return;
//    }
//
//    // Add a new user to the End
//    public void addUserAtEnd(int userId, String name, int age, int[] friends){
//        Node newNode = new Node(userId,name, age, friends);
//
//        if(head==null){
//            head= newNode;
//        }
//
//        Node temp=head;
//        while(temp.next != null){
//            temp= temp.next;
//        }
//        temp.next=newNode;
//    }
//
//
//    // Search for a user by User ID
//    public Node searchUserById( int userId){
//        Node temp =head;
//        while(temp != null){
//            if(temp.userId== userId){
//                return temp;
//            }
//            temp=temp.next;
//        }
//        System.out.println("User Not Found.");
//        return null;
//    }
//
//
//    // Add a friend connection between two users
//    public void addFriendConnection(int userId1, int userId2){
//        Node user1= searchUserById(userId1);
//        Node user2= searchUserById(userId2);
//
//        if(user1 ==null || user2 ==null){
//            System.out.println("Users Not Found.");
//            return;
//        }
//
//        if(! user1.friends.contains(user2)){
//            user1.friends.add(userId2);
//        }
//
//        if(! user2.friends.contain(user1)){
//            user2.friends.add(userId1);
//        }
//
//        System.out.println("Friend connection added between "+ user1.name+ "and " + user2.name);
//    }
//
//
//    // Remove a friend connection between two users
//    public void removeFriendConnections(int userId1, int userId2){
//        Node user1= searchUserById(userId1);
//        Node user2= searchUserById(userId2);
//
//        if(user1 == null || user2== null){
//            System.out.println("both users not found.");
//            return;
//        }
//
//        user1.friends.remove(userId2);
//        user2.friends.remove(userId1);
//        System.out.println("Friend connection removed between "+ userI.name + " and " + user2.name);
//    }
//
//
//    // Find mutual friends between two users
//    public void findMutualFriends(int userId1, int userId2) {
//        Node user1 = searchUserById(userId1);
//        Node user2 = searchUserById(userId2);
//
//        if (user1 == null && user2 == null) {
//            System.out.println("Both User are Not Found.");
//        }
//
//        System.out.println("Mutual Friends between " + user1.name + "and " + user2.name + "are: ");
//        for (int friendId : user1.friends) {
//            if (user2.friends.contains(friendId)) {
//                Node mutualFriend = searchUserById(friendId);
//                if (mutualFriend != null) {
//                    System.out.println("name : " + mutualFriend.name + "ID: " + mutualFriend.userId);
//                }
//            }
//        }
//    }
//
//
//
//    // Display all friends of a specific user.
//    public void DisplayFriendOfUser(int userId){
//        Node user= searchUserById(userId);
//        if(user== null){
//            System.out.println("User Not Found.");
//            return;
//        }
//
//        System.out.println("Friends of " + user.name + ": ");
//        for (int friendId :user.friends){
//            Node friend= searchUserById(friendId);
//            if(friend !=null){
//                System.out.println("name: "+ friend.name + "ID: "+ friend.userId );
//            }
//        }
//    }
//
//
//    //Count the number of friends for each user
//    public void countFriends() {
//        Node temp=head;
//
//        while(temp !=null){
//            System.out.println("the number of friends of "+ temp.name + "are "+ temp.friends.size() );
//            temp= temp.next;
//        }
//    }
//
//
//}

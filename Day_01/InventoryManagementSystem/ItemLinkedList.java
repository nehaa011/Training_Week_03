package InventoryManagementSystem.InventoryManagementSystem;

public class ItemLinkedList {

    class Node {
        String itemName;
        int itemId;
        int quantity;
        double price;
        Node next;

        Node(String itemName, int itemId, int quantity, double price) {
            this.itemName = itemName;
            this.itemId = itemId;
            this.quantity = quantity;
            this.price = price;
            this.next = null;
        }
    }

    private Node head;

    //1. add items at the beginning of list
    public void addAtBeginning(String itemName, int itemId, int quantity, double price) {
        Node newNode = new Node(itemName, itemId, quantity, price);
        newNode.next = head;
        head = newNode;
        return;
    }


    //1.1 add items at end of list
    public void addAtEnd(String itemName, int itemId, int quantity, double price) {
        Node newNode = new Node(itemName, itemId, quantity, price);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }


    //1.2 add items at specific position
    public void addAtPosition(int position, String itemName, int itemId, int quantity, double price){
        Node newNode= new Node( itemName, itemId, quantity, price);
        if(head ==null){
            addAtBeginning(itemName, itemId, quantity, price);
            return;
        }

        Node temp= head;
        int count=0;
        while( temp != null && count < position-1){
            temp=temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Position is out of bounds.");
            return;
        }

        newNode.next= temp.next;
        temp.next= newNode;

    }


    //2. Remove an item based on itemId
    public void removeItem(int Id){

        if(head==null){
            System.out.println("No Item Found.");
            return;
        }

        if(head.itemId == Id ){
            head= head.next;
            return;
        }

        Node temp= head;
        while(temp!= null && temp.next.itemId != Id){
            temp= temp.next;
        }

        if(temp.next== null){
            System.out.println("Item with itemID " + Id + " not found.");
            return;
        }

        temp.next = temp.next.next;
        return;

    }


    //3. Update the quantity of item based on Item ID
    public void updateItem(int Id, int quantity){
        Node temp= head;
        while(temp !=null){
            if(temp.itemId == Id){
                temp.quantity = quantity;
            }
            temp = temp.next;
        }
        return;
    }


    //4. Search for an item based on Item ID or Item Name
    public void searchItem(int Id){
        Node temp=head;
        int index=0;
        while(temp != null ){
            if(temp.itemId == Id){
                System.out.println("Item fount at " + index + " position");
                return;
            }
            index++;
            temp=temp.next;
        }
    }



    //5. Calculate and display the total value of inventory
    public void displayTotalValue(){
        if(head== null){
            System.out.println("Inventry is Empty. Total value is 0.");
            return;
        }

        double totalValue=0;
        Node temp= head;
        while( temp != null){
            totalValue += temp.price * temp.quantity;
            temp=temp.next;
        }
        System.out.println("Total value of Inventory: " + totalValue);
        return;
    }

    //6.0  Sort the inventory
    public void swap(Node a, Node b){
        String tempName= a.itemName;
        int tempID = a.itemId;
        int tempQuantity = a.quantity;
        double tempPrice = a.price;

        a.itemName = b.itemName;
        a.itemId = b.itemId;
        a.quantity = b.quantity;
        a.price = b.price;

        b.itemName = tempName;
        b.itemId = tempID;
        b.quantity = tempQuantity;
        b.price = tempPrice;
    }


    //6. Sort the inventory based on Item Name or Price in ascending or descending order.
    public void sortByPrice(){
        if (head == null || head.next == null) return;
        for (Node i = head; i.next != null; i = i.next) {
            for (Node j = head; j.next != null; j = j.next) {
                if (j.price > j.next.price) {
                    swap(j, j.next);
                }
            }
        }
    }



    //7. Display the list
    public void displayItemLinkedList(){

        if (head==null){
            System.out.println("List is Empty.");
            return;
        }

        Node temp= head;
        while(temp != null){
            System.out.print( "Item ID: " + temp.itemId + " Item Name: " + temp.itemName + " Quantity: " + temp.quantity + " Price: " + temp.price + "-----> ");
            temp=temp.next;
        }
        System.out.print("Null");
        return;
    }





}

package InventoryManagementSystem.InventoryManagementSystem;



public class InventoryManagementSystem {
    public static void main(String[] args){
        InventoryManagementSystem.InventoryManagementSystem.ItemLinkedList item= new InventoryManagementSystem.InventoryManagementSystem.ItemLinkedList();

        item.addAtBeginning("Dal",1022, 5,100);
        item.addAtEnd("Chawal", 1056, 10,55);
        item.addAtBeginning("Aata", 1245, 25, 40);
        item.addAtEnd("Besan",1025,2,80);


        //item.removeItem(1025);

        //item.updateItem(1245, 30);

        //item.searchItem(1022);

        //item.displayTotalValue();

        item.sortByPrice();
        item.displayItemLinkedList();


    }
}

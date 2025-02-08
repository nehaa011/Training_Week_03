package StudentRecordManagement;

public class StudentRecordManagement {
    public static void main(String[] args) {
        StudentLinkedList studentList = new StudentLinkedList();
        
        studentList.addAtBeginning(102, "Alice", 20, "A");
        studentList.addAtBeginning(100, "Anam", 21 , "B");
        studentList.addAtEnd(104, "Bob", 21, "B");
        studentList.addAtPosition(1, 101, "Adob", 22, "A+");
        studentList.addAtPosition(3, 103, "Charlie", 22, "A+");


        System.out.println("All Student Records:");
        studentList.DisplayStudentRecord();

    }
        
        
}

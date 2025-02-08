package StudentRecordManagement;


public class StudentLinkedList{

    class Node {
        int rollNum;
        String name;
        int age;
        String grade;
        Node next;


        Node(int rollNum, String name, int age, String grade) {
            this.rollNum = rollNum;
            this.name = name;
            this.age = age;
            this.grade = grade;
            this.next = null;
        }
    }

    Node head;


        // 1. Add student record at the beginning of the list
        public void addAtBeginning(int rollNum, String name, int age, String grade){
            Node newNode= new Node(rollNum, name, age, grade);
            newNode.next=head;
            head=newNode;
            System.out.println("Student added in Beginning.");
            return;
        }


        // 2. Add student record at the end of the list
        public void addAtEnd( int rollNum, String name, int age, String grade){
            Node newNode= new Node(rollNum, name, age, grade);

            if(head==null){
                head= newNode;
                System.out.println("Student added at End.");
                return;
            }

            Node temp= head;
            while(temp.next != null){
                temp =temp.next;
            }

            temp.next=newNode;
            System.out.println("Student added at End.");
        }


        // 3. Add student record at a specific position in the list
        public void addAtPosition(int position , int rollNum, String name, int age, String grade){
            Node newNode= new Node(rollNum, name, age, grade);

            if(position ==0){
                addAtBeginning(rollNum, name, age, grade);
                return;
            }

            Node temp=head;
            int currentCount=0;

            while(temp !=null && currentCount < position-1){
                temp= temp.next;
                currentCount++;
            }

            if (temp == null) {
                System.out.println("Position is out of bounds.");
                return;
            }

            newNode.next= temp.next;
            temp.next= newNode;
            System.out.println("Student added at position " + position + ".");

        }


        // 4. Delete student record by Roll Number
        public void deleteByRollNo(int rollNo){

            if(head==null){
                System.out.println("No Student Record Present.");
                return;
            }

            if(head.rollNum== rollNo){
                head=head.next;
                System.out.println("Student with Roll Number " + rollNo + " deleted.");
                return;
            }

            Node temp= head;
            while (temp != null && temp.next.rollNum != rollNo) {
                temp=temp.next;
            }

            if(temp.next== null){
                System.out.println("Student with Roll Number " + rollNo + " not found.");
                return;
            }

            temp.next= temp.next.next;
            System.out.println("Student with Roll Number " + rollNo + " deleted.");
        }



        // 5. Search for student record by Roll Number
        public void searchByRollNo(int rollNo){
            Node temp= head;
            int position =1;
            while(temp != null){
                if(temp.rollNum == rollNo){
                    System.out.println("Student found: Position= " + position + " Roll No=" + temp.rollNum + ", Name=" + temp.name +  ", Age=" + temp.age + ", Grade=" + temp.grade);
                    return;
                }
                position ++;
                temp=temp.next;
            }
            System.out.println("Student with Roll Number " + rollNo + " not found.");
        }


        // 6. Update a student's grade based on their Roll Number
        public void UpdateGrade(int rollNo, String newGrade){
            Node temp=head;
            while(temp != null){
                if(temp.rollNum== rollNo){
                    temp.grade= newGrade;
                    System.out.println("Student's grade updated to: " + newGrade);
                    return;
                }
                temp= temp.next;
            }

           System.out.println("Student with Roll Number " + rollNo + " not found.");
        }



        // 7. Display all student records
        public void DisplayStudentRecord(){
            if (head == null) {
                System.out.println("No student records found.");
                return;
            }

            Node temp= head;
            while(temp != null){
                System.out.println("Roll No=" + temp.rollNum + ", Name=" + temp.name +
                    ", Age=" + temp.age + ", Grade=" + temp.grade);
                
                temp=temp.next;
            }
        }
    }






        
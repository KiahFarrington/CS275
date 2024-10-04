
// DOUBLY LINKED LIST FOR #2
import java.util.Scanner;
class Kiah_Farrington_Q2B {
    static class DoublyLinkedList{
        Node head;
        static class Node{
            public int data;
            public Node next;
            public Node prev;
            
            Node(int d) {
                this.data = d;
                this.next = null;
                this.prev = null;
            }
        }
      
        
        public void reverse(){
            Node current = head;
            Node temp = null;
    
            while (current != null) {
                temp = current.prev;
                current.prev = current.next;
                current.next = temp;

                current = current.prev;
            }
    
            if (temp != null) {
                head = temp.prev;
            }
        }
            
        
        public void addNode(int data) {
            Node newNode = new Node(data);
    
            if (head == null) {
                head = newNode;
                return;
            }
    
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
        
         
        public void printList(){
            if(this.head == null){
                System.out.print("[]\n");
            }
            else{
                System.out.print("[");
                Node current = this.head;
                while(current.next != null){
                    System.out.print(current.data + " -> ");
                    current = current.next;
                }
                System.out.println(current.data + " -> null]\n");
            }
        }
    }        
            
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Add your elements seperated by spaces(-1 & press enter to terminate):");
            
            DoublyLinkedList list = new DoublyLinkedList();
            while(in.hasNextInt()){
                int data = in.nextInt();
                if (data == -1) {
                    break;
                }else {
                    list.addNode(data);
                }
            }
            System.out.println("Your list:");
            list.printList();
            list.reverse();
            System.out.println("Reversed:");
            list.printList();
        }
}

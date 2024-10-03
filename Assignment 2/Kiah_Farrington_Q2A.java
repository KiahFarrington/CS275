// SINGLE LINKED LIST
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Kiah_Farrington_Q2A {
       
       static class LinkedList{
        Node head;
            static class Node {
                public int data;
                public Node next;
                
                Node(int d) {
                    this.data = d;
                    this.next = null;
                }
                
                Node(int d, Node n) {
                    this.data = d;
                    this.next = n;
                }
            }   
            
            
            public void addNode(int data){
                Node newNode = new Node(data);
                if(head == null){
                    head = newNode;
                    return;
                }
                
                Node current = head;
                while (current.next != null) {
                current = current.next;  // Move to the next node
                }
                current.next = newNode;
            }
            
            public Node reverse(){
                Node current = head;
                Node prev = null;
                Node next = null;

                while(current != null){
                    next = current.next;
                    current.next = prev;
        
                    prev = current;
                    current = next;
                }
    
                return prev;
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
        LinkedList list = new LinkedList();
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
        list.head = list.reverse();
        System.out.println("Reversed:");
        list.printList();
    }
}

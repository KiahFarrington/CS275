import java.util.Scanner;

public class Kiah_Farrington_Q1 {
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
            
            public Node rotateList(int k){
                if( head == null || k == 0){
            return head;
            }
        
            Node tail = head;
            int length = 1;
            while(tail.next != null){
                tail = tail.next;
                length++;
            }
            
            k = k % length; 
            if(k == 0){
                return head;
            }
            //make it circular
            tail.next = head;
            Node newTail = head;
            for(int i = 1; i < length - k; i++){
                newTail = newTail.next;
            }
            
            Node newHead = newTail.next;
            newTail.next = null;
            return newHead; //new tail becomes starting head
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
        System.out.println("How many times would you like to rotate the list?");
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        
        System.out.println("Add your elements seperated by spaces(-1 to terminate):");
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
        list.head = list.rotateList(k);
        System.out.println("Rotated:");
        list.printList();
        
        }
}

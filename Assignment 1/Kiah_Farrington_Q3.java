/*
Write a static method that takes an ArrayList of Strings and an integer and modifies the
ArrayList destructively to eliminate all Strings whose length is less than the integer argument.
So, if the integer argument is 4 and the ArrayList is the following:
*/
import java.util.ArrayList;
import java.util.Scanner;

class Kiah_Farrington_Q3 {
    public static void main(String[] args) {
        
        System.out.print("Enter a list of things, when done say \"done\" and hit enter\n");
        //scans in input of strings
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new  ArrayList<String>();
        String input = "";
        while(!(input.equals("done"))){
            input = in.next();
            list.add(input);
        }
        list.remove(list.size()-1);
       
       
        //scans argument length to eliminate
        System.out.print("Input a number, we will delete anything that length is less it:\n");
        int n = in.nextInt();
        
        
        //output
        System.out.print("Your modified list is:\n" + eliminate(list, n));
    }
    
    public static ArrayList<String> eliminate(ArrayList<String> words, int n){
        
        //destructive method
        for(int i = words.size() - 1; i >= 0; i--)
        {
            String word = words.get(i);
            if(word.length() < n){
                words.remove(i);
            }
        }
        return words;
    }
}
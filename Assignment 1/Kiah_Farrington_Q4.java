
import java.util.ArrayList;
import java.util.Scanner;

class Kiah_Farrington_Q4 {
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
        
        //create a new ArrayList and fill it with words that fit the requirment 
        // constructive method
        ArrayList<String> newWords = new  ArrayList<String>();
        for(String word : words)
        {
            if(word.length() >= n)
            {
                newWords.add(word);
            }
        }
        return newWords;
    }
}
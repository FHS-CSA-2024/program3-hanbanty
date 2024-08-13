//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input
public class Program3{
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the length?:");
        int length = scanner.nextInt();
        System.out.println("What is the width?:");
        int width = scanner.nextInt();
        int perimeter= 2*(length+width);
        System.out.println("Length:"+length);
        System.out.println("Width:"+width);
        System.out.println("The area is:"+ length * width);
        System.out.println("The perimeter is:"+ perimeter);

    
    }
}


//Your code here:




//Paste console output below:
/*
What is the length?:
143
What is the width?:
82
Length:143
Width:82
The area is:11726
The perimeter is:450


*/

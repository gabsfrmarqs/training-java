import java.util.Scanner;

public class variables {
    public static void main(String[] args){
        int age = 20;
        double gpa = 3.5;
        char doncare = 'G';
        boolean isNice = true;
        String name = "gabriel marqs " ; // WHY does it have to start with uppercase? smh
        String lyrics = "love bluh bluh bluh bluh bluh bluh bluh";

        System.out.println(name + lyrics);
        System.out.println(name.charAt(0) + lyrics); // i hate you charAt
    
        System.out.print("Insert a new name: ");
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        input.close(); // apparently i need to close input or i'll get a memory leak

        System.out.println("you're " + name);

        
    }
}

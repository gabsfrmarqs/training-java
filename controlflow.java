// "control flow" lol its just conditionals
import java.util.Scanner;

public class controlflow {
    public static void main(String arg[]){
        int numero;
        Scanner input = new Scanner(System.in);
        System.out.print("Insert a number: ");
        numero = input.nextInt(); // i mean ok but whats the point

        if (numero != 39){
            System.out.println("Oh no its time to die =)");
        } else{
            System.out.println("MIKU MIKU OOO EEE OOO");
        }

        for (int i = 0; i < 39; i++){
            System.out.print(i + ", ");
        }
        System.out.println("AYO ITS 39 MIGUMIGUOOEEOO");
        // imagine if someone actually reads this
        // home not

        int dunno = 0;
        while (dunno != 3){
            dunno++;
        }
        //happy to see things similar to C++

    }
}

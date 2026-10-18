import java.util.Random;
import java.util.Scanner;
public class DieRollar {
    public static void main (String[]args){
        Scanner in =new Scanner(System.in);
        Random rand = new Random();
        int die1 = 0;
        int die2 = 0;
        int die3 = 0;
        int rollNum = 0;
        int sum = 0;
        String continueYN = "";
        boolean done = false;

        do{
            System.out.println("Roll  Die1  Die2  Die3  Sum");
            System.out.println("----------------------------");
            die1 = rand.nextInt(1,7);
            die2 = rand.nextInt(1,7);
            die3 = rand.nextInt(1,7);
            rollNum++;
            sum = die1 + die2 + die3;
            System.out.printf("%-2d %5d %5d %5d %5d%n" , rollNum,die1,die2,die3,sum);
            System.out.println();
            System.out.println("Should we continue [Y/N]");
            continueYN = in.nextLine();
            if (continueYN.equalsIgnoreCase( "N")){
                done = true;
            }
        }while(!done);
        System.out.println("Thank you for playing!");
    }
}

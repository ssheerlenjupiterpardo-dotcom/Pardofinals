
/**
 * Write a description of class Nums9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Nums9{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int num, sum = 0;
        
        System.out.print("Enter Number (0 to Stop): ");
        
        while(true){
        num = sc.nextInt();
        if (num == 0){
            break;
        }
        sum += num;
    }
    System.out.println("Sum = " + sum);
}
}
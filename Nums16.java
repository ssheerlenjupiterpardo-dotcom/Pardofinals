
/**
 * Write a description of class Nums16 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Nums16{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int count = 0;
        
        if (num == 0) count = 1;
        else {
            num = Math.abs(num);
            while (num > 0){
                num /=10;
                count++;
            }
        }
        System.out.println("Number of digits: " + count);
    }
    }
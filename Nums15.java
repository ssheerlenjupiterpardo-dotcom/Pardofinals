
/**
 * Write a description of class Nums15 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Nums15
{
        public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int[] arr = new int [5];
        for(int i = 0; i < 5; i++){
            System.out.print("Enter Number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Numbers Greater than 50: ");
        for (int num : arr){
            if (num > 50){
                System.out.println(num);
            }
        }
    }
}

/**
 * Write a description of class Nums20 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nums20
{
    public static void main (String [] args){
        int[] arr = {10, 28, 36, 42, 9, 11};
        for (int num : arr){
            if (num > 20 && num % 2 == 0){
                System.out.println(num);
            }
        }
    }
}
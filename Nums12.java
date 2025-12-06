
/**
 * Write a description of class Nums12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nums12
{
    public static void main (String [] args){
        int[] arr = {1, 2, 1, 3, 1,5};
           int value = 1;
           int count = 0;
           boolean appears3Times = false;

               for (int n : arr) {
           if (n == value) count++;
        if (count >= 3) {
          appears3Times = true;
          break;
           }
           }

        System.out.println(appears3Times ? "YES" : "NO");
    }
}
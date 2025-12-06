
/**
 * Write a description of class Nums13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nums13
{
    public static void main (String [] args){
    int[] grades = {70, 65, 96, 80, 91};
        int pass = 0, fail = 0;

        for (int g : grades) {
            if (g >= 75) pass++;
               else fail++;
                 }

        System.out.println("Passed: " + pass);
         System.out.println("Failed: " + fail);
    }
}
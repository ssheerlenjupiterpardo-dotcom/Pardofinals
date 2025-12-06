
/**
 * Write a description of class Nums17 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nums17
{
    public static void main (String [] args){
        int[] arr = {4,15,10,25,12};
        int highest = Integer.MIN_VALUE;
        int secondhighest = Integer.MIN_VALUE;
        
        for (int num : arr){
            if (num > highest){
                secondhighest = highest;
                highest = num;
            } else if (num > secondhighest && num != highest){
                secondhighest = num;
            }
            }
        System.out.println("Second highest number: " + secondhighest);
        }  
}
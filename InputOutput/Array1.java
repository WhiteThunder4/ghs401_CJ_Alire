
public class Array1
{
    public static void main()
    {
        //declare an array of the size 100 that holds 100 integers
        int[] myArray = new int [100];
        
        
        //store the contents of the array in a loop 
        myArray[99] = 495;
        myArray[0] = 0;
        myArray[1] = 5;
        for(int i = 0; i < myArray.length; i++)
        {
            //store the array a multiples of 6
            myArray[i] = i*5;
        }
        
        for(int i = 0; i < myArray.length; i++)
        {
            System.out.println("Item " + (i+1) + " is " + myArray[i]);
        }
        
        //on your own, write the for loop that will now print the values of myArray
        //be sure to use the .length call
        //note, the display window will only show the last 47 lines multiple lines are printed
     }
}

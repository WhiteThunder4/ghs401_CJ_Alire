

public class Arrays
{
    public static void main()
 {
    // declare an array of size 12 that holds 12 integers
    int[] myArray = new int[20];
    
    //print the length of the array using the .length call
    System.out.println("The length of the array is " + myArray.length);
    
    //store three arbitrary values in the array in the three arbitrary locations
    myArray[0] = 55;
    myArray[1] = 17;
    myArray[3] = 100;
    myArray[myArray.length-2] = 4;
    myArray[11] = 73;

    //print the contents of the array in a loop, using .length to end the loop
    for(int i = 0; i < myArray.length; i++)
    {
        //print each index and its value
        System.out.println("The value of the element: " + i + " in the array is " + myArray[i]);
    }
 }
}

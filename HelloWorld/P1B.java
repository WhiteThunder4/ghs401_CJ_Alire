
import javax.swing.JOptionPane;
public class P1B
{
 public static void main()  {
    
    String num1 = JOptionPane.showInputDialog("Input high value");
    String num2 = JOptionPane.showInputDialog("Input low value");
    
    int high = Integer.parseInt(num1);
    int low = Integer.parseInt(num2);
    int even = 0;
    
    
    if (low <= high) {
        
     int[] numArray = new int [1000];   
    for(int i = 0; i < numArray.length; i++){
        
       numArray[i] = (int) (Math.random()*(high-low+1)) + low;
       
       
       //System.out.println(numArray[i]);
    }
    
   
    for (int i = 0; i < numArray.length; i++) {
    
    if (numArray[i]%2 ==0){
    System.out.println("The index is "+ (i + 1) +" The random number is "+ numArray[i] + " The number is even");
    even ++;
  
    
    }
    else {
    
     System.out.println("The index is "+ (i + 1) +" The random number is "+ numArray[i] + " The number is odd");
    
    }
    
    
    
    }
    //else (low < high)}
    
    System.out.println("The amount of even numbers is "+ even + " And the amount of odd numbers is " + (numArray.length - even));
    
    
    
    
    }
    else{
    System.out.println("Error");
    
    }
    
    
    
    }
    
}

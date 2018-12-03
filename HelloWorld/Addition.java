import javax.swing.JOptionPane;

public class Addition
{
  public static void main() {
      String val1 = JOptionPane.showInputDialog("Input Value 1");
      
      String val2 = JOptionPane.showInputDialog("Input Value 2");
      
      
      int val1a = Integer.parseInt(val1);
      int val2a = Integer.parseInt(val2);
      int sum = val1a+val2a;
      
      
      
      System.out.println("The sum is: " +sum); }
    }    
      


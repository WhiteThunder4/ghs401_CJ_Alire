import javax.swing.JOptionPane;

public class P1A
{
  public static void main() {
  
  String num1 = JOptionPane.showInputDialog("Input Value a");
  
  String num2 = JOptionPane.showInputDialog("Input Value b");
  
  String num3 = JOptionPane.showInputDialog("Input Value c");
  
  
  int a = Integer.parseInt(num1);
  
  int b = Integer.parseInt(num2);
  
  int c = Integer.parseInt(num3);
 
  int bSquared = b*b;
  
  int fourAC = 4*a*c;
  
 
  
  System.out.println("bSquared is "+bSquared);                      
  System.out.println("4AC is "+fourAC);
  if(bSquared-fourAC < 0) {
  
        System.out.println("Cannot find roots ");
        
  }
  else {
        double sqrtDisc = Math.sqrt(bSquared-fourAC);
        System.out.println("Discriminant is "+sqrtDisc);
        double root1 = (-1*b+sqrtDisc)/(2*a);
        double root2 = (-1*b-sqrtDisc)/(2*a);
    
        System.out.println("Root1 is "+root1);
        System.out.println("Root2 is "+root2);
     
    }
}
}

  
 





  
  
  
  

  
  
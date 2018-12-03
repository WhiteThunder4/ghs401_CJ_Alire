
import javax.swing.JOptionPane;
public class Age
{
    public static void main()
{
    //asks for age
    int age = Integer.parseInt(JOptionPane.showInputDialog("Please enter your age."));
    if(age >= 16)
    {
        System.out.println("You can drive.");
    }
    
    else 
    {
        System.out.println("You can't drive.");
    }
}
}

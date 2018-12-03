import javax.swing.JOptionPane;
public class GPA
{
    public static void main()
    {
        //ask for GPA
        Double GPA = Double.parseDouble(JOptionPane.showInputDialog("Please enter your GPA"));
        
        if(GPA > 4)
        {
            System.out.println("You must have taken AP classes.");
        }
        else if(GPA >= 0)
        {
             System.out.println("That is a valid GPA.");
        }
        else
        {
             System.out.println("That's impossible.");
        }
        
         System.out.println("Thank you for using the GPA system.");
    }
}

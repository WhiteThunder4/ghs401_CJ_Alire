
import javax.swing.JOptionPane;


public class InputOutput
{
    public static void main()
    {
    //compile does not read this
    //for programmer
    //window that asks for users name
    String username = JOptionPane.showInputDialog("Plese enter your username:");
    
    if(username.equals("MickeyMouse"))
    {
        String password = JOptionPane.showInputDialog("Please enter your password:");
        
        if(password.equals("mickey123"))
         {
             System.out.println("Access Granted. " + "Welcome.");
         }
    )
}
    
    
    else
    {
        System.out.println("Access Denied.");
    }
    
    
   
    
}
}

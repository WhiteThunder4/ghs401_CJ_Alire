
import javax.swing.JOptionPane;
public class P1C
{   public static void main () {

String user = JOptionPane.showInputDialog("Enter Username");
String pass = JOptionPane.showInputDialog("Enter Password");

String user2 = JOptionPane.showInputDialog("Verify Username");
String pass2 = JOptionPane.showInputDialog("Verify Password");

String answer = JOptionPane.showInputDialog("What is your favorite musical artist?");





if ((user.equals(user2))&&(pass.equals(pass2)))  
{
    
    String[] musicalArtists = new String[4];
    musicalArtists[0] = "Rick Astley";
    musicalArtists[1] = "Mozart";
    musicalArtists[2] = "Michael Jackson";
    musicalArtists[3] = null;
     System.out.println("Access Granted");
     boolean musicTaste = false;
   
    
    for (int i = 0; i < musicalArtists.length; i++)
    {
        if (musicalArtists[i] != null) {
        
            if((musicalArtists[i].equals("Michael Jackson")))
            {
                System.out.println("We found him. Element "+ (i + 1)+ " is Michael Jackson.");
            }
                
            
            else
            {
                System.out.println("We did not find him. Element "+ (i + 1)+ " is "+musicalArtists[i]);
            }
        }
        else{
    
            System.out.println("Element "+ (i + 1)+ " is null");
        }
    }
    
    
    
    for (int i = 0; i < musicalArtists.length; i++)
    {
        if ((musicalArtists[i] != null)&&(musicalArtists[i].equals(answer)))
        {
            //System.out.println("We have the same taste in music");
            musicTaste = true;
        }
    }
    
    
    
    if(musicTaste == false)
    {
        System.out.println("We do not have the same music taste");
    
    }
    else
        System.out.println("We do have the same music taste");
    }
    else 
    {
        System.out.println("Access Denied");
        
        
    }
}
}
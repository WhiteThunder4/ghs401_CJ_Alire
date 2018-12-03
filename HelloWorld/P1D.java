
import javax.swing.JOptionPane;
public class P1D
{
    public static void main() {
    
        for(int i = 1; i < 11; ++i){
            int iSq = i*i;
            int rand = (int)(((iSq - i + 1)*Math.random())+ i);
            System.out.print (i + "\t" + iSq + "\t" + rand);
            
            if(iSq == rand) {
            
                System.out.print("\tThe random value is equal to the square of the index\n");
                
               
            
            }
            else if(i==rand){
                
                System.out.print("\tThe random value is equal to the index\n");
            
                    
            }
            else {
             System.out.print("\n");
            
                
            }
        }
    
    }
}
  

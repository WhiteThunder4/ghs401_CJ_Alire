

public class Studentnames
{
   public static void main() {
    
    String[] nameArray = new String[100];
    
    nameArray[1] = "Jason";
    nameArray[92] = "John";
    nameArray[94] = "Jacob";
   
    for(int i = 0; i < nameArray.length; i++) {
    
        
        
            if(nameArray[i].equals("John") && nameArray[i] !=null){
            System.out.println("It is John");
            
            else
            System.out.println("It is not John");
        
        }
        
    
    
    }
       
    }
}

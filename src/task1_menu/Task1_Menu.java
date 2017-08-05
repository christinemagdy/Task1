package task1_menu;
import java.util.Scanner;
public class Task1_Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s = new Scanner(System.in);
        System.out.print("dollar = ");  
        int dollar = s.nextInt();
        
     
        switch(dollar)
        {   
            case 1:
                if(dollar == 1)
                System.out.println("the fish");
            case 2:
                if(dollar == 2) 
                {
                    System.out.println("the rice");
                    System.out.println( "And fish");
                }
                
            case 3:
                if(dollar >= 3)
                {
                    System.out.println("the bread");
                    System.out.println("And rice");
                    System.out.println("And fish");
                }
        }
        
    }

}

import java.util.Scanner;

public class Bonus1 {

    
    public static void main(String[] args) throws Exception {

        
            
        
        Scanner scanner = new Scanner(System.in);
        String validUsername = "Coded"; 
        String validPassword = "Coded123";

        while (true) {
            try {
                System.out.println("enter your user");
                String enteredUser = scanner.nextLine();
        
                System.out.println("Enter your password");
                String enteredPass = scanner.nextLine();
                if(enteredUser.equals(validUsername) && enteredPass.equals(validPassword)  ){
            System.out.println("Welcome ");
            break;
            }
            else {
                throw new Exception("Invalid credentials");
        }
        
            
        } catch (Exception e) {
           
            System.out.println(e.getMessage());
        }
    }
        
        


        scanner.close();
    
}
}
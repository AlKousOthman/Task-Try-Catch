import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        String validUsername = "Coded"; 
        String validPassword = "Coded123";

        System.out.println("enter your user");
        String enteredUser = scanner.nextLine();

        System.out.println("Enter your password");
        String enteredPass = scanner.nextLine();
        
        try {
            if(enteredUser.equals(validUsername) && enteredPass.equals(validPassword)  ){
            System.out.println("Welcome ");
            }
            else {
                throw new Exception("Invalid credentials");
        }
        
            
        } catch (Exception e) {
           
            System.out.println(e);
        }

        
        


        scanner.close();
} 
}

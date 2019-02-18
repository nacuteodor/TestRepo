import org.junit.Assert;
import org.junit.Test;

public class SignIn {
    public static final String signIn = "Sign In";

    public SignIn() {
    }

    public static final String email = "Email";
    public static final String  password= "Password";


    public void FillInFields(String email, String password){
        System.out.println("Clicked on the button." + email + password);
    }

    public void validateSignIn (){
        System.out.println("Page contains the Sign out button");

    }

}

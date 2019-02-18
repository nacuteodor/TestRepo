import org.junit.Assert;

public class SignIn {
    public static final String signIn = "Sign In";
    public static String emailAddress = "";
    public static String password = "";

    public UIElement signInButton = new UIElement(SignIn.signIn + " :button:");
    public UIElement emailAddressField = new UIElement(SignIn.emailAddress + " :text field:");
    public UIElement passswordField = new UIElement(SignIn.password + " :text field:");

    public void tapSignInButton() {
        if (emailAddress == "" || password == "")
            throw new IllegalArgumentException("Error Sing In");
        else
            System.out.println("Sign In with successful!");
    }

    public static void setEmailAddress(String mailAddress) {
        SignIn.emailAddress = mailAddress;
    }

    public static void setPassword(String password) {
        SignIn.password = password;
    }

    public void validateScreenElements() {
        Assert.assertEquals("Sign In button don't exist!", SignIn.signIn + " :button:", signInButton.getIdentifier());
        Assert.assertEquals("Email address field don`t exist!", SignIn.emailAddress + " :text field:", emailAddressField.getIdentifier());
        Assert.assertEquals("Password field don`t exist!", SignIn.password + " :text field:", passswordField.getIdentifier());
    }
}



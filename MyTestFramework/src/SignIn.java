import org.junit.Assert;

public class SignIn {

    public static class AccessibilityLabels {
        public static final String myStuff = "My Stuff";
        public static final String signIn = "Sign In";
        public static final String emailAddress = "Email Address";
        public static final String password = "Password";
    }

    // UI elements
    public UIElement myStuffTab = new UIElement(SignIn.AccessibilityLabels.myStuff + " label");
    public UIElement signInButton = new UIElement(SignIn.AccessibilityLabels.signIn + " text field");
    public UIElement emailAddress = new UIElement(SignIn.AccessibilityLabels.emailAddress + " text field");
    public UIElement password = new UIElement(SignIn.AccessibilityLabels.password + " text field");

    // UI actions
    public void clickSignInButton(String text) {
        System.out.println("signIn.clickButton(" + text + ")");
    }

    public void emailAddressField(String text) {
        System.out.println("emailAddress.typeEmailAddress(" + text + ")");
    }

    public void passwordField(String text) {
        System.out.println("password.typePassword(" + text + ")");
    }

    // ...

    // UI validations
    public void validateScreenElements() {
        Assert.assertEquals("signInButton doesn't exist", SignIn.AccessibilityLabels.signIn + " label", signInButton.getIdentifier());
        Assert.assertEquals("emailAddressField doesn't exist", SignIn.AccessibilityLabels.emailAddress + " text field", emailAddress.getIdentifier());
        Assert.assertEquals("passwordField doesn't exist", SignIn.AccessibilityLabels.password + " text field", password.getIdentifier());
        Assert.assertEquals("myStuffTab doesn't exist", SignIn.AccessibilityLabels.myStuff + " text field", myStuffTab.getIdentifier());
    }
}

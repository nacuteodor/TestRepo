import org.junit.Assert;

public class MyStuff {

    public static class AccessibilityLabels {
        public static final String myStuff = "My Stuff";
        public static final String signInOrSignUp = "Sign In Or Sign Up";
    }

    // UI elements
    public UIElement myStuffTab = new UIElement(MyStuff.AccessibilityLabels.myStuff + " label");
    public UIElement signInOrSignUpButton = new UIElement(MyStuff.AccessibilityLabels.signInOrSignUp + " text field");

    // UI actions
    public void clickSignInOrSignUpButton(String text) {
        System.out.println("signInOrSignUpButton.click(" + text + ")");
    }
    // ...

    // UI validations
    public void validateScreenElements() {
        Assert.assertEquals ( "myStuffTab doesn't exist", MyStuff.AccessibilityLabels.myStuff + " label", myStuffTab.getIdentifier());
        Assert.assertEquals ( "signInOrSignUpButton doesn't exist", MyStuff.AccessibilityLabels.signInOrSignUp + " text field", signInOrSignUpButton.getIdentifier());
    }
}

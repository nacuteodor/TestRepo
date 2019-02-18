import org.junit.Assert;

public class SignIn {
    public static class AccessibilityLabels {
        public static final String signIn = "Sign In";
        public static final String signOut = "Sign out";
        public static final String username = "Username";
        public static final String password = "Password";

    }
        // UI elements
        public UIElement signInButton = new UIElement(SignIn.AccessibilityLabels.signIn+" label");
        public UIElement username = new UIElement(AccessibilityLabels.username+" label");
        public UIElement password = new UIElement(AccessibilityLabels.password+" label");
        public UIElement signOutButton = new UIElement(SignIn.AccessibilityLabels.signOut+" label");



        // UI actions
        public void tapSignIn() {

            System.out.println("Tap Sign In button)");

        }
        public void completeText1(String text) {

            System.out.println("username.typeText("+text+")");

        }
        public void completeText2(String text) {

            System.out.println("password.typeText("+text+")");

        }
        // ...

        // UI validations
        public void validateSignOutLabel() {
            Assert.assertEquals("Sign Out button doesn't exist", AccessibilityLabels.signOut+" label", signOutButton.getIdentifier());
        }
    }


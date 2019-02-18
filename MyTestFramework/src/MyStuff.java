import org.junit.Assert;

import javax.net.ssl.HttpsURLConnection;

public class MyStuff {

    public static class SignIn {
        public static final String email = "E-mail";
        public static final String password = "Password";
    }

    // UI elements

    public UIElement emailInput = new UIElement(SignIn.email + "mail field");
    public UIElement passwordInput = new UIElement(SignIn.password + "password field");

    // ...

    // UI actions
    public void clickSignIn(String text) {
        System.out.println("signIn.clickSignIn(" + text + ")");
    }
    // ...
    // UI validations

    public void validateEmailAndPassword() {
        Assert.assertEquals("email doesn't exist", SignIn.email + "mail field", emailInput.getIdentifier());
        Assert.assertEquals("searchBar doesn't exist", SignIn.password + "password field", passwordInput.getIdentifier());
    }
}

import org.junit.Assert;

public class MyStuff {
    public static final String signInOrSignOut = "Sign In or Sign Out";

    public UIElement signInOrSignOutButton = new UIElement(MyStuff.signInOrSignOut + " :button:");

    public void validateScreenElements() {
        Assert.assertEquals("Sign In or Sign Out button doesn`t exist!", MyStuff.signInOrSignOut + " :button:", signInOrSignOutButton.getIdentifier());
    }

    public void tapOnSignInOrSignOutButton () {
        System.out.println("        Click on Sign In or Sign Out button!");
    }
}

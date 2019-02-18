import org.junit.Assert;

public class MyStuff {

    public static class Labels {
        public static final String signIn = "Sign In";
        public static final String myStuff = "My Stuff";}

        public UIElement signInTab = new UIElement(Labels.signIn + " Tab");
        public UIElement myStuffTab = new UIElement(Labels.myStuff + " Tab");

        public void clickSignIn(String tap) {
            System.out.println(tap+" Sign In or Sign up");
        }

        public void clickMyStuff(String tap) {
            System.out.println(tap+" my stuff");
        }

        public void verifyCredentials(){
            boolean k=true;
            if(k)
            System.out.println("Log in successful");
            else
                System.out.println("Wrong username or password");
        }

        public void validateScreenElements() {
            Assert.assertEquals("Sign In Tab doesn't exist", Labels.signIn + " Tab", signInTab.getIdentifier());
            Assert.assertEquals("My Stuff Tab doesn't exist", Labels.myStuff + " Tab", myStuffTab.getIdentifier());
        }
}

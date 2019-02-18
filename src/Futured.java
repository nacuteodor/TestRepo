import org.junit.Assert;

public class Futured {


    // UI elements
    public UIElement featuredTab = new UIElement(AccesibilityLabels.featured + "label");
    public UIElement searchBox = new UIElement(AccesibilityLabels.searchButton + "text field");
    public UIElement signIn = new UIElement(AccesibilityLabels.signIn + "label");
    public UIElement signOut = new UIElement(AccesibilityLabels.signOut + "label");


    // UI actions
    public void searchText(String text) {

        System.out.println("Search Box typeText(" + text + ")");

    }

    public void myStaffLabel() {

          myStaffLabel();

    }
    public void signIn()
    {


    }




    // UI validations
    public void validateScreenElements() {
        Assert.assertEquals("featuredTab doesn't exist", AccesibilityLabels.featured + "label", featuredTab.getIdentifier());
        Assert.assertEquals("SearchBar doesn't exist", AccesibilityLabels.searchButton + "text field", searchBox.getIdentifier());
        Assert.assertEquals("Sign in error", AccesibilityLabels.signIn + "label", signIn.getIdentifier());
        Assert.assertEquals("You are not log in ", AccesibilityLabels.signOut + "label", signOut.getIdentifier());


    }

    public static class AccesibilityLabels {
        public static final String featured = "Featured";
        public static final String searchButton = "Search Button";
        public static final String signIn = "Sign in";
        public static final String signOut = "Sign out";


    }
}






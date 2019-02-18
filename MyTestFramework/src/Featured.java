import org.junit.Assert;

public class Featured {

    public static class AccesibilityLabels {
        public static final String featured = "Featured";
        public static final String searchGroupon = "Search Groupon";
    }

    // UI elements

    public UIElement featuredTab = new UIElement(AccesibilityLabels.featured + "label");
    public UIElement searchBar = new UIElement(AccesibilityLabels.searchGroupon + "text field");
    // ...

    // UI actions
    public void searchText(String text) {
        System.out.println("searchBar.typeText(" + text + ")");
    }
    // ...

    // UI validations
    public void validateScreenElements() {
        Assert.assertEquals("featuredTab doesn't exist", AccesibilityLabels.featured + "label", featuredTab.getIdentifier());
        Assert.assertEquals("searchBar doesn't exist", AccesibilityLabels.searchGroupon + "text field", searchBar.getIdentifier());
    }
}




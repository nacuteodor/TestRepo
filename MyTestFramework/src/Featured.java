import org.junit.Assert;

public class Featured {
    public static class AccessibilityLabels {
        public static final String featured = "Featured";
        public static final String searchGroupon = "Search Groupon";
    }

    // UI elements
    public UIElement featuredTab = new UIElement(AccessibilityLabels.featured + " label");
    public UIElement searchBar = new UIElement(AccessibilityLabels.searchGroupon + " text field");


    // UI actions
    public void searchText(String text) {
        System.out.println("searchBar.typeText(" + text + ")");
    }
    // ...

    // UI validations

    public void validateScreenElements() {
        Assert.assertEquals("featureTab dont't exist", AccessibilityLabels.featured + " label", featuredTab.getIdentifier());
        Assert.assertEquals("searchTab dont't exist", AccessibilityLabels.searchGroupon + " text field", searchBar.getIdentifier());

    }
}
//
//class DealsListScreen: Screen {
//        // ...
//        }



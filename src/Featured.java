import org.junit.Assert;
import org.junit.Test;

public class Featured {

    public static class AccessibilityLabels  {
        public static final String featured = "Featured";
        public static final String  searchGroupon= "Search Groupon";
        public static final String myStuff = "My Stuff Tap";
    }

    // UI elements
    public UIElement featuredTab = new UIElement(AccessibilityLabels.featured + " label");
    public UIElement searchGroupon = new UIElement(AccessibilityLabels.searchGroupon + " text field");
    public UIElement myStuff = new UIElement(Featured.AccessibilityLabels.myStuff + "myStuff");



    // UI actions
   public void searchText(String text){
       System.out.println(" searchBar.typeText(" + text + ")");
   }


    // UI validations
    public void validateScreenElements() {
        Assert.assertEquals("featuredTab doesn't exist",AccessibilityLabels.featured +" label",featuredTab.getIdentifier() );
        Assert.assertEquals("searchBar doesn't exist",AccessibilityLabels.searchGroupon + " text field",searchGroupon.getIdentifier());
        Assert.assertEquals("MyStuff button doesn't exist", Featured.AccessibilityLabels.myStuff + "myStuff", myStuff.getIdentifier());

    }





}

import org.junit.Assert;

public class MyStuff {

    public static class AccessibilityLabels{
        public static final String myStuff="My Stuff";
    }
    // UI elements
    public UIElement myStuffButton = new UIElement(MyStuff.AccessibilityLabels.myStuff+" label");

    public void tap() {

        System.out.println("Tap My Stuff button");

    }

}
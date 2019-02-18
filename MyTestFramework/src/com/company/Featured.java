package com.company;

import org.junit.Assert;

public class Featured {
    public static class AccessibilityLabels {
        public static final String featured = "com.company.Featured";
        public static final String searchGroupon = "Search Groupon";

    }

    // UI elements
    public UIElement featuredTab = new UIElement(AccessibilityLabels.featured + "label");
    public UIElement searchBar = new UIElement(AccessibilityLabels.searchGroupon + "text field");



    // ...

    // UI actions
    public void searchText(String text) {
        System.out.println("searchBar.typeText(" + text + ")");
    }
    // ...

    // UI validations
    public void validateScreenElements() {
        Assert.assertEquals("featuredTab doesn't exist", AccessibilityLabels.featured + "label", featuredTab.getIdentifier());
        Assert.assertEquals("searchBar doesn't exist", AccessibilityLabels.searchGroupon + "text field", searchBar.getIdentifier());
    }


}

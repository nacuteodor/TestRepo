package com.company;


import org.junit.Assert;

public class MyStaff {


    public static class Accessibility {

        //public static final String myStaff = "My Staff";
        public static final String singIn = "Sing In";
    }


    public void validateSingOutLabel() {
        Assert.assertEquals("button doesn't exist", MyStaff.Accessibility.singIn + "button", singin.getIdentifier());
    }

    public UIElement singin = new UIElement(MyStaff.Accessibility.singIn + "button");

    public void performSingIn(String username, String password) {

        System.out.println("singin.typeText(" + username + ")");
        System.out.println("singin.typeText(" + password + ")");
        System.out.println("Tap Sing In Button");
    }




}

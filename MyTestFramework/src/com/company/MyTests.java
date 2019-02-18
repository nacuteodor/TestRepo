package com.company;

import org.junit.*;

public class MyTests {
  private Featured featured ;
  private MyStaff myStaff;

    @BeforeClass
    public static void setUpSuite(){
        System.out.println("SetupSuite");
    }

    @Before
    public void setUp(){
        System.out.println("Setup");
        featured = new Featured();
        myStaff =  new MyStaff();
    }



    @Test
    public void myFirstTest(){
    System.out.println("Hello World!");
    featured.searchText("pizza");
    featured.validateScreenElements();

    }
    @Test
    public void mySecondTest(){
        System.out.println("Second Hello World!");

    }
    @AfterClass
    public static void tearSuiteDown(){
        System.out.println("tearDownSuite");
    }

  @After
    public void tearDown(){
      System.out.println("tearDown");
  }


    @Test
    public void myStaffTest(){
        myStaff.performSingIn("ceva", "altceva");
        myStaff.validateSingOutLabel();
    }


}

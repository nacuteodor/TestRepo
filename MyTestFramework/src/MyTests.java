import org.junit.*;


public class MyTests {

    private Featured featured;
    private MyStuff myStuff;
    private SignIn signIn;

    @BeforeClass
    public static void setUpSuite() {
        System.out.println("Setup suite");
    }

    @Before
    public void setUp() {
        System.out.println("    Screens were enabled!");
        featured = new Featured();
        myStuff = new MyStuff();
        signIn = new SignIn();

    }

    @Test
    public void myFirstTest() {
        System.out.println("Hello World!");
        featured.searchText("pizza");
        featured.validateScreenElements();
    }

    @Test
    public void mySecondTest() {
        System.out.println("Second Hello World!");
    }

    @After
    public void tearDown() {
        System.out.println("    Teardown");
        signIn.setEmailAddress("");
        signIn.setPassword("");
    }

    @AfterClass
    public static void tearDownSuite() {
        System.out.println("Teardown suite");
    }


    @Test
    public void testMyStuffScreen_ValidateElements() {
        System.out.println("        We are on the MyStuff screen!");
        System.out.println("        All elements are here!");
        myStuff.validateScreenElements();
    }

    @Test
    public void testSinInScreen_ValidateElements() {
        System.out.println("        We are on the SignIn screen!");
        System.out.println("        All elements are here!");
        myStuff.validateScreenElements();
    }

    @Test
    public void testSignInScreen_EnterValidEmailAndPassword_SignInButtonConfirm() {
        signIn.setEmailAddress("email@gmial.com");
        signIn.setPassword("****");
        signIn.tapSignInButton();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSignInScreen_EnterValidEmailAButNoPassword_SignInButtonConfirm() {
        signIn.setEmailAddress("email@gmial.com");
        System.out.println("        Password missing!");
        signIn.tapSignInButton();

    }

    @Test(expected = IllegalArgumentException.class)
    public void testSignInScreen_EnterValidPasswordAButNoEmail_SignInButtonConfirm() {
        signIn.setPassword("****");
        System.out.println("        Email missing!");
        signIn.tapSignInButton();

    }

    @Test
    public void testMyStuffScreen_ClickOnSignInOrOutButton() {
        myStuff.tapOnSignInOrSignOutButton();
    }
}

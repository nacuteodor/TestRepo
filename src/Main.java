import org.junit.*;

public class Main {
    private Futured featured = new Futured();


    @BeforeClass
    public static void setUpSuite() {

        System.out.println("Setup");

    }

    @AfterClass
    public static void tearDownAfter() {
        System.out.println("tearDownAfter");
    }

    @Before
    public void setUp() {
        System.out.println("Setup"
        );

    }

    @Test
    public void myFirstTest() {

        System.out.println("Hello World");
        featured.searchText("pizza");
        featured.validateScreenElements();

    }

    @Test
    public void mySecondTest() {

        System.out.println("Second Hello world");
    }

    @After
    public void tearDown() {
        System.out.println("tearDown");
    }











    @Test
        public void testSignInScreen_EnterValidEmailAndPassword_SignInButtonConfirm () {
        SignIn.setEmailAddress("email@gmial.com");
        SignIn.setPassword("****");
    }

    @Test(expected = IllegalArgumentException.class)
        public void testSignInScreen_EnterValidEmailAButNoPassword_SignInButtonConfirm () {
        SignIn.setEmailAddress("email@gmial.com");
        System.out.println("        Password missing!");

    }






 }





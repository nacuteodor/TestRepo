import org.junit.*;

public class MyTests {
    private Featured featured = new Featured();
    private static MyStuff myStuff = new MyStuff();
    public static SignIn signIn = new SignIn();


    @BeforeClass
    public static void setUpSuite() {
        System.out.println("setUpSuite");

    }

    @Before
    public void setUp() {
        System.out.println("setUp");
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
        System.out.println("Hello World2!");
    }

    @After
    public void tearDown() {
        System.out.println("tearDown");

    }
    @AfterClass
    public static void tearDownSuite() {
        System.out.println("tearDownSuite");
    }
    @Test
    public void SignInTest(){
        signIn.FillInFields("email@email.com", "12222");
    }



}

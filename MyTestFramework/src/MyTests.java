import org.junit.*;

public class MyTests {

    private Featured featured = new Featured();
    private MyStuff mystuff = new MyStuff();

    @BeforeClass
    public static void setUpSuite() {
        System.out.println("setUpSuite");

    }

    @Before
    public void setUp() {
        System.out.println("setUp");
        featured = new Featured();
        mystuff = new MyStuff();

    }

    @Test
    public void myFirstTest () {
        System.out.println("Hello World!");
        featured.searchText("pizza");
        featured.validateScreenElements();

    }

    @Test
    public void mySecondTest () {
        System.out.println("Email and password.");
        mystuff.clickSignIn("A");
        mystuff.validateEmailAndPassword();

    }

    @After
    public void tearDown() {
        System.out.println("tearDown");

    }

    @AfterClass
    public static void tearDownSuite() {
        System.out.println("tearDown suite");

    }
}

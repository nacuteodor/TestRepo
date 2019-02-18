import org.junit.*;

public class MyTest {
    private Featured featured = new Featured();
    private MyStuff myStuff=new MyStuff();

    @BeforeClass
    public static void setUpSuite() {
        System.out.println("Set up suite");
    }

    @Before
    public void setUp() {
        System.out.println("set up");
        featured=new Featured();
        myStuff=new MyStuff();
    }

    @Test
    public void myFirstTest() {
        myStuff.clickMyStuff("click");
        featured.validateScreenElements();
    }

    @Test
    public void mySecondTest() {
        myStuff.clickSignIn("click");
        myStuff.validateScreenElements();
    }

    @After
    public void tearDown() {
        System.out.println("tearDown");
    }

    @AfterClass
    public static void tearDownSuite() {
        System.out.println("tear down suite");
    }
}

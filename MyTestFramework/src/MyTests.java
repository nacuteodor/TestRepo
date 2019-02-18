import org.junit.*;

public class MyTests {
    private Featured featured;

    @BeforeClass
    public static void setUpSuite() {
        System.out.println("Setup suite!");
    }


    @Before
    public void setUp() {
        System.out.println("This is a setup method!");
        featured = new Featured();
    }

    @Test
    public void myFirstTest() {
        System.out.println("Hello World!");
        featured.searchText("pizza");
        featured.validateScreenElements();
    }

    @Test
    public void mySecondTest() {
        System.out.println("Hello World Second!");

    }

    @After
    public void tearDown() {
        System.out.println("tear down");
    }

    @AfterClass
    public static void tearDownSuite() {
        System.out.println("tear down suite");
    }


}

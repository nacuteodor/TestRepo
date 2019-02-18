import org.junit.*;

public class MyTests {
    private Featured featured;

    @BeforeClass
    public static void setUpSuite() {
        System.out.println("setUpSuite");
    }

    @Before
    public void setUp() {
        System.out.println("setUp");
        featured = new Featured();
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

    @After
    public void tearDown() {
        System.out.println("tearDown");
    }

    @AfterClass
    public static void tearDownSuite() {
        System.out.println("tearDownSuite");
    }
}

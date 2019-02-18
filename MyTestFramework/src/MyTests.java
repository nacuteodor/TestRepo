import org.junit.*;

public class MyTests {
    private Featured featured;
    private MyStuff myStuff;
    private SignIn signIn,username,password,signOut;


    @BeforeClass
    public static void setUpSuite(){
        System.out.println("SetUp suite");
    }

    @Before
    public void setUp(){
        featured=new Featured();
        myStuff=new MyStuff();
        signIn=new SignIn();
        signOut=new SignIn();
        username=new SignIn();
        password=new SignIn();
        System.out.println("SetUp");
    }

    @Test
    public void myFirstTest() {

        System.out.println("Hello World!");
        myStuff.tap();
        signIn.tapSignIn();
        username.completeText1("Blabla");
        password.completeText2("Parola");
        signOut.validateSignOutLabel();

    }

    @Test
    public void mySecondTest() {

        System.out.println("Hello World second!");

    }
    @After
    public void tearDown() {
        System.out.println("tear down");
    }
    @AfterClass
    public static void tearDownUpSuite(){
        System.out.println("tear down suite");
    }
}
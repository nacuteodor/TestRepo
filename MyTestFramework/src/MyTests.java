import org.junit.*;

public class MyTests {
    private Featured featured;
    private MyStuff myStuff;
    private SignIn signIn,username,password,signOut;



    @BeforeClass
    public static  void setUpSuite(){
        System.out.println("Setup suite!");


    }
    @Before
    public void setUp(){
        featured=new Featured();
        myStuff=new MyStuff();
        signIn=new SignIn();
        signOut=new SignIn();
        username=new SignIn();
        password=new SignIn();
        System.out.println("setUp");
    }

    @Test
    public void myFirstTest(){
        System.out.println("Hello World!");
        myStuff.tap();
        signIn.tapSignIn();
        username.completeText1("Ana");
        password.completeText2("Caraza");
        signOut.validateSignOutLabel();

    }

    @Test
    public void mySecondTest(){
        System.out.println(" Second Hello World !");
    }


    @After
    public void tearDown(){
        System.out.println("tearDown!");


    }
    @AfterClass
    public static void tearDownSuite(){
        System.out.println(" tearDownSuite!");


    }
}

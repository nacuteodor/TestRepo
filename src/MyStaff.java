import org.junit.Assert;

public class MyStaff {


    public static final String myStaff = "My Staff";
    Futured lavel=new Futured();
    public void signIn()

    {

        System.out.println("Log in");
    }

    public void checkSignIn()

    {

     lavel.validateScreenElements();


    }

    public  void signOut()

    {

        System.out.println("Sign out");
        lavel.validateScreenElements();



    }




}

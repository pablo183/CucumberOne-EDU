package stepDefinations;


import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before("@MobileTest")
    public void beforevaldiation()
    {
        System.out.println("Before mobile before hook");
    }
    @After("@MobileTest")
    public void aftervaldiation()
    {
        System.out.println("After mobile before hook");
    }

}

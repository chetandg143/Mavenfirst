package Demo.org;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class App 
{
   @Test
   public void run()
    {
        System.out.println( "run1 running...");
    }
   @BeforeClass
   public void run2()
   {
	System.out.println("run 2 running...");
   }
}

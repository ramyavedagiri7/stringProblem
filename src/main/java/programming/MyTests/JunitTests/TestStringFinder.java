package programming.MyTests.JunitTests;

import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import programming.StringFinder;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by rvedagiri on 9/9/16.
 */
@RunWith(Parameterized.class)
public class TestStringFinder {

    static StringFinder sf;
    @BeforeClass
    public static void setup(){
        sf = new StringFinder();
    }
    private String m1;
    private Character m2;
    private String m3;

    public TestStringFinder(String p1, Character p2, String p3) {
        m1 = p1;
        m2 = p2;
        m3 = p3;
    }


    // creates the test data
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] { { "Hello World" , 'l' ,"Heo Word"}, { "Hello World" , ' ',"HelloWorld" },{ "Hello World" , 'H',"ello World" },{ "@pp!e.c0m" , '!', "@ppe.c0m"}, };
        return Arrays.asList(data);
    }
    @Test
    public void testFindChar(){
        Assert.assertEquals(m3,sf.stringProblem(m1,m2));

    }
}


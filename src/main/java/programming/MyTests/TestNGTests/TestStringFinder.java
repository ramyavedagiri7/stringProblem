package programming.MyTests.TestNGTests;



import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import programming.StringFinder;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by rvedagiri on 9/9/16.
 */


    public class TestStringFinder {

        static StringFinder sf;

        @BeforeClass
        public static void setup(){
            sf = new StringFinder();        //Initialize the class
        }


        // creates the test data
        @DataProvider(name="Strings")
        public static Object[][]   testData() {   //Data set for the test
            return new Object[][] { { "Hello World" , 'l' ,"Heo Word"}, { "Hello World" , ' ',"HelloWorld" },{ "Hello World" , 'H',"ello World" },{ "@pp!e.c0m" , '!', "@ppe.c0m"}, };
        }
        @Test(dataProvider = "Strings")
        public void testFindChar(String str, Character c, String expected){
            Assert.assertEquals(expected, sf.stringProblem(str, c));        //Actual tests

        }
    }



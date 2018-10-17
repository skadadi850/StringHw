import jdk.nashorn.internal.runtime.Undefined;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringMethodsTest {

    @Test
    public void abcTest1() {
        boolean response = StringMethods.abcTest ("123abc");
        assertEquals(true,response);
    }
    @Test
    public void abcTest2() {
        boolean response = StringMethods.abcTest ("123.abc");
        assertEquals(false,response);
    }
    @Test
    public void abcTest3() {
        boolean response = StringMethods.abcTest ("abc.123");
        assertEquals(true,response);
    }
    @Test
    public void abcTest4() {
        boolean response = StringMethods.abcTest ("");
        assertEquals(false,response);
    }
    @Test
    public void alternateStrings1 (){
        String response = StringMethods.alternateStrings("abc","xyz");
        assertEquals("axbycz",response);
    }
    @Test
    public void alternateStrings2 (){
        String response = StringMethods.alternateStrings("Hi","There");
        assertEquals("HTihere",response);
    }
    @Test
    public void alternateStrings3 (){
        String response = StringMethods.alternateStrings("xxxx","Thereee");
        assertEquals("xTxhxexreee",response);
    }
    @Test
    public void alternateStrings4 (){
        String response = StringMethods.alternateStrings("Thereee", "xxxx");
        assertEquals("Txhxexrxeee",response);
    }
    @Test
    public void alternateString5 (){
        String response = StringMethods.alternateStrings("", "");
        assertEquals("",response);
    }

}
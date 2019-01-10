package Java_Test_Package;

import Java_Package.Program1;
import org.junit.Test;

import static org.junit.Assert.*;

public class Program1_Test {
    Program1 pgm1 = new Program1();

    @Test

    public void test1()
    {
        assertEquals("Values are not matched", 36,pgm1.method2(6,6));
    }

    @Test

    public void test2()
    {
        assertEquals("String doesn't matches", "AsrithvelSathiya",pgm1.method3("Asrith","vel","Sathiya"));

    }
    @Test

    public void test3()
    {
        assertEquals("Second Message", "jothiraniasrith",pgm1.method3("jothi","rani","asrith"));
    }
}

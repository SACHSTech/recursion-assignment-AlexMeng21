package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Before;
//import org.junit.jupiter.api.After;
import java.io.*;
import recursionAssignment.Recursion;

public class RecursionTest{
    
    
    /**
     * An initial test
     */
    @Test
    public void Count7Test1(){
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);
        assertEquals(2,Recursion.count7(717));
    }
    
    // add more tests
    @Test
    public void pairStarTest1(){
      assertEquals("x*x*xy*y*y", Recursion.pairStar("xxxyyy"));
    }
    @Test
    public void pairStarTest2(){
      assertEquals("x*xy*y", Recursion.pairStar("xxyy"));
    }
    @Test
    public void pairStarTest3(){
      assertEquals("hel*lo", Recursion.pairStar("hello"));
    }
    
    
}

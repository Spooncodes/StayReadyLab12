package io.codedifferently;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OpenCloseCheckerTest {

    OpenCloseChecker openCloseChecker;

    @Before
    public void setup(){
        this.openCloseChecker = new OpenCloseChecker();
    }

    @Test
    public void parenthesisTest(){
        String input = "a(b)c(d)e(f)g";

        Boolean actual = openCloseChecker.openCloseChecker(input);

        Assert.assertTrue(input, actual);
    }

    @Test
    public void parenthesisTest2(){
        String input = ")";

        Boolean actual = false;

        Assert.assertFalse(input, actual);
    }

    @Test
    public void parenthesisTest3(){
        String input = "a(bcd(ef))";

        Boolean actual = openCloseChecker.openCloseChecker(input);

        Assert.assertTrue(input, actual);
    }

    @Test
    public void parenthesisTest4(){
        String input = "a(bc(d)))";

        Boolean actual = openCloseChecker.openCloseChecker(input);

        Assert.assertFalse(input, actual);
    }

    @Test
    public void squareBracketTest(){
        String input = "[]";

        Boolean actual = openCloseChecker.openCloseChecker(input);

        Assert.assertTrue(input, actual);
    }

    @Test
    public void squareBracketTest2(){
        String input = "]";

        Boolean actual = openCloseChecker.openCloseChecker(input);

        Assert.assertFalse(input, actual);
    }

}
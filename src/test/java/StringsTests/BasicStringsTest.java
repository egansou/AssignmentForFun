package StringsTests;

import Strings.BasicStrings;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// Please rewrite the test part as the format I gave here.

public class BasicStringsTest {
    private BasicStrings basicStrings;

    @Before
    public void setup(){
        basicStrings = new BasicStrings();
    }

    @Test
    public void flipConcatTest1(){
        // Given
        String string1 = " Everyone!";
        String string2 = "Hi";
        String expected = "Hi Everyone!";
        // When
        String actual = basicStrings.flipConcat(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void flipConcatTest2(){
        // Given
        String string1 = "mind";
        String string2 = "Never";
        String expected = "Nevermind";
        // When
        String actual = basicStrings.flipConcat(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void flipConcatTest3(){
        // Given
        String string1 = "Luigi!";
        String string2 = "Yes, that's me! ";
        String expected = "Yes, that's me! Luigi!";
        // When
        String actual = basicStrings.flipConcat(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCharTest1(){
        // Given
        String string1 = "We can do this!";
        char expected = 'd';
        // When
        char actual = basicStrings.getChar(string1, 7);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCharTest2(){
        // Given
        String string1 = "We can do this!";
        char expected = '!';
        // When
        char actual = basicStrings.getChar(string1, 14);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void iCantSeeTest1(){
        // Given
        String string1 = "Love";
        String expected = "    ";
        // When
        String actual = basicStrings.iCantSee(string1);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void iCantSeeTest2(){
        // Given
        String string1 = "I Can Do It.";
        String expected = "            ";
        // When
        String actual = basicStrings.iCantSee(string1);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void iCantSeeTest3(){
        // Given
        String string1 = "";
        String expected = "";
        // When
        String actual = basicStrings.iCantSee(string1);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void loudAndClearTest1(){
        // Given
        String string = " ";
        String expected = " ";
        // When
        String actual = basicStrings.loudAndClear(string);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void loudAndClearTest2(){
        // Given
        String string = "lEt mE hEaR yOu lOUdEr";
        String expected = "LET ME HEAR YOU LOUDER";
        // When
        String actual = basicStrings.loudAndClear(string);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseCaseTest1(){
        // Given
        String string = "lEt mE hEaR yOu LOuDeR.";
        String expected = "LeT Me HeAr YoU loUdEr.";
        // When
        String actual = basicStrings.reverseCase(string);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseCaseTest2(){
        // Given
        String string = "IT'S aLl lOvE, mY FRieNd!";
        String expected = "it's AlL LoVe, My frIEnD!";
        // When
        String actual = basicStrings.reverseCase(string);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseCaseTest3(){
        // Given
        String string = " ";
        String expected = "  ";
        // When
        String actual = basicStrings.reverseCase(string);
        // Then
        Assert.assertNotEquals(expected, actual);
    }

    @Test
    public void oneAtATimeTest(){
        // Given
        String string1 = "  ";
        String string2 = " ";
        String expected = "   ";
        // When
        String actual = basicStrings.oneAtATime(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void oneAtATimeTest2(){
        // Given
        String string1 = "Yuwl";
        String string2 = "o ecome";
        String expected = "You welcome";
        // When
        String actual = basicStrings.oneAtATime(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void oneAtATimeTest3(){
        // Given
        String string1 = "Don't hate";
        String string2 = "";
        String expected = "Don't hate";
        // When
        String actual = basicStrings.oneAtATime(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }



}

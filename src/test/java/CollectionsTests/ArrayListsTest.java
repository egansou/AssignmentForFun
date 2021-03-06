package CollectionsTests;

import org.junit.Assert; 
import org.junit.Before;
import org.junit.Test;

import Collections.ArrayLists;

import java.util.ArrayList;

// Please rewrite the test part as the format I gave here.

public class ArrayListsTest {
    private ArrayLists arrayLists;

    @Before
    public void setup(){
        arrayLists = new ArrayLists();
    }

    @Test
    public void addShitTest1(){
        // Given
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        original1.add(6);
        original1.add(5);
        original1.add(1);
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        original2.add(2);
        original2.add(1);
        // When
        ArrayList<Integer> actual = arrayLists.addShit(original1, original2);
        original1.add(2);
        original1.add(1);
        // Then
        Assert.assertEquals(original1, actual);
    }

    @Test
    public void addShitTest2(){
        // Given
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        original2.add(5);
        original2.add(4);
        original2.add(3);
        // When
        ArrayList<Integer> actual = arrayLists.addShit(original1, original2);
       
        // Then
        Assert.assertEquals(original2, actual);
    }

    @Test
    public void addShitTest3(){
        // Given
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        // When
        ArrayList<Integer> actual = arrayLists.addShit(original1, original2);
        // Then
        Assert.assertEquals(original1, actual);
    }

    @Test
    public void addShitTogetherTest1(){
        // Given
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        original1.add(-5);
        original1.add(5);
        original1.add(5);
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        original2.add(10);
        
        // When
        Integer actual = arrayLists.addShitTogether(original1, original2);
        Integer expected = 15;
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addShitTogetherTest2(){
        // Given
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        original2.add(4);
        // when
        Integer actual = arrayLists.addShitTogether(original1, original2);
        Integer expected = 4;
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addShitTogetherTest3(){
        // Given
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        // When
        Integer actual = arrayLists.addShitTogether(original1, original2);
        Integer expected = 0;
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeAllTest1(){
        // Given
        ArrayList<Integer> original = new ArrayList<Integer>();
        original.add(5);
        original.add(4);
        original.add(5);
        original.add(4);
        original.add(7);
        // When
        Integer toRemove = 4;
        ArrayList<Integer> actual = arrayLists.removeAll(original, toRemove);
        original.remove(1);
        original.remove(2);
        // Then
        Assert.assertEquals(original, actual);
    }

    @Test
    public void removeAllTest2(){
        // Given
        ArrayList<Integer> original = new ArrayList<Integer>();    
        // When
        Integer toRemove = 5;
        ArrayList<Integer> actual = arrayLists.removeAll(original, toRemove);
        // Then
        Assert.assertEquals(original, actual);
    }

    @Test
    public void removeAllTest3(){
        // Given
        ArrayList<Integer> original = new ArrayList<Integer>();
        original.add(1);
        original.add(2);
        original.add(3);
        original.add(4);
        original.add(5);
        // When
        Integer toRemove = null;
        ArrayList<Integer> actual = arrayLists.removeAll(original, toRemove);
        // Then
        Assert.assertEquals(original, actual);
    }

    @Test
    public void happyListTest1(){
        // Given
        ArrayList<String> original = new ArrayList<String>();
        original.add("Testing");
        original.add("my");
        original.add("code");
        // When
        boolean actual = arrayLists.happyList(original);
        // Then
        Assert.assertFalse(actual);
    }

    @Test
    public void happyListTest2(){
        // Given
        ArrayList<String> original = new ArrayList<String>();
        original.add("Do");
        original.add("not");
        original.add("hate");
        original.add("all");
        original.add("love");
        // When
        boolean actual = arrayLists.happyList(original);
        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void happyListTest3(){
        // Given
        ArrayList<String> original = new ArrayList<String>();
        // When
        boolean actual = arrayLists.happyList(original);
        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void happyListTest4(){
        // Given
        ArrayList<String> original = new ArrayList<String>();
        original.add("Yes!");
        // When
        boolean actual = arrayLists.happyList(original);
        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void happyListTest5(){
        // Given
        ArrayList<String> original = new ArrayList<String>();
        original.add("Trust");
        original.add("the");
        original.add("Process!");
        // When
        boolean actual = arrayLists.happyList(original);
        // Then
        Assert.assertTrue(actual);
    }

}

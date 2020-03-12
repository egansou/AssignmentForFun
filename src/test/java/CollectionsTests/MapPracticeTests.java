package CollectionsTests;

import Collections.MapPractice;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

// Please rewrite the test part as the format I gave here.

public class MapPracticeTests {
    private MapPractice mapPractice;
    private Map map1;

    @Before
    public void setup(){
        mapPractice = new MapPractice();
        map1 = new TreeMap<String, String>();
        map1.put("Mario", "Mario Bros.");
        map1.put("Donkey Kong", "Donkey Kong");
        map1.put("Link", "Legend of Zelda");
        map1.put("Samus Aran", "Metroid");
        map1.put("Yoshi", "Yoshi's World");
        map1.put("Kirby", "Kirby");
        map1.put("Fox McCloud", "Star Fox");
        map1.put("Pikachu", "Pokemon");
        map1.put("Luigi", "Mario Bros.");
        map1.put("Captain Falcon", "F-Zero");
        map1.put("Ness", "EarthBound");
        map1.put("Jigglypuff", "Pokemon");
    }

    @Test
    public void findValueOfTest1(){
        // Given
        String key = "Pikachu";
        // When
        String expected = "Pokemon";
        String actual = (String) mapPractice.findValueOf(map1, key);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findValueOfTest2(){
        // Given
        String key = "Kirby";
        // When
        String expected = "Pokemon";
        String actual = (String) mapPractice.findValueOf(map1, key);
        // Then
        Assert.assertNotEquals(expected, actual);
    }

    @Test
    public void findValueOfTest3(){
        // Given
        String key = "Ness";
        // When
        String expected = "EarthBound";
        String actual = (String) mapPractice.findValueOf(map1, key);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findKeysOfTest1(){
        // Given
        String value = "EarthBound";
        // When
        Object[] expected = {"Ness"};
        Object[] actual = mapPractice.findKeysOf(map1, value);
        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void findKeysOfTest2(){
        // Given
        String value = "FinalFantasy";
        // When
        Object[] expected = {};
        Object[] actual = mapPractice.findKeysOf(map1, value);
        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void findKeysOfTest3(){
        // Given
        String value = "Mario Bros.";
        // When
        Object[] expected = {"Luigi", "Mario"};
        Object[] actual = mapPractice.findKeysOf(map1, value);
        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void fibonacciTreeTest1(){
        // Given
        Integer upTo = 11;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 1);
        expected.put(2, 1);
        expected.put(3, 2);
        expected.put(4, 3);
        expected.put(5, 5);
        expected.put(6, 8);
        expected.put(7, 13);
        expected.put(8, 21);
        expected.put(9, 34);
        expected.put(10, 55);
        expected.put(11, 89);
        Map<Integer, Integer> actual = mapPractice.fibonacciTree(upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibonacciTreeTest2(){
        // Given
        Integer upTo = 4;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 1);
        expected.put(2, 1);
        expected.put(3, 2);
        expected.put(4, 3);
        Map<Integer, Integer> actual = mapPractice.fibonacciTree(upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibonacciTreeTest3(){
        // Given
        Integer upTo = 2;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 1);
        expected.put(2, 1);
        Map<Integer, Integer> actual = mapPractice.fibonacciTree(upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibonacciTreeTest4(){
        // Given
        Integer upTo = 1;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 1);
        Map<Integer, Integer> actual = mapPractice.fibonacciTree(upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibonacciTreeTest5(){
        // Given
        Integer upTo = 0;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        Map<Integer, Integer> actual = mapPractice.fibonacciTree(upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void crazySpiralTest1(){
        // Given
        Integer upTo = 7;
        Integer first = 2;
        Integer second = 3;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 2);
        expected.put(2, 3);
        expected.put(3, 5);
        expected.put(4, 8);
        expected.put(5, 13);
        expected.put(6, 21);
        expected.put(7, 34);
        
        Map<Integer, Integer> actual = mapPractice.crazySpiral(first, second, upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void crazySpiralTest2(){
        // Given
        Integer upTo = 4;
        Integer first = 5;
        Integer second = 2;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 5);
        expected.put(2, 2);
        expected.put(3, 7);
        expected.put(4, 9);
        
        Map<Integer, Integer> actual = mapPractice.crazySpiral(first, second, upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void crazySpiralTest3(){
        // Given
        Integer upTo = 6;
        Integer first = -1;
        Integer second = -4;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, -1);
        expected.put(2, -4);
        expected.put(3, -5);
        expected.put(4, -9);
        expected.put(5, -14);
        expected.put(6, -23);
     
        Map<Integer, Integer> actual = mapPractice.crazySpiral(first, second, upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void crazySpiralTest4(){
        // Given
        Integer upTo = 2;
        Integer first = 56;
        Integer second = -4;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 56);
        expected.put(2, -4);
        Map<Integer, Integer> actual = mapPractice.crazySpiral(first, second, upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void crazySpiralTest5(){
        // Given
        Integer upTo = 1;
        Integer first = 56;
        Integer second = -4;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 56);
        Map<Integer, Integer> actual = mapPractice.crazySpiral(first, second, upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void crazySpiralTest6(){
        // Given
        Integer upTo = 0;
        Integer first = 33412;
        Integer second = -4131417;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        Map<Integer, Integer> actual = mapPractice.crazySpiral(first, second, upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }



}

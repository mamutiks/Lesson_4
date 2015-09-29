package ua.com.mamutiks.utils;

import org.junit.Test;
import ua.com.mamutiks.ua.com.mamutiks.objects.Person;
import ua.com.mamutiks.ua.com.mamutiks.objects.Position;
import ua.com.mamutiks.ua.com.mamutiks.utils.ArrayHelper;

import static org.junit.Assert.assertArrayEquals;

public class ArrayHelperTest {

//    @Test
//    public void testLeftUnion() throws Exception {
//        // initialize variable inputs
//        int[] leftArray = {3, 6, 2, 4};
//        int[] rightArray = {3, 6, 2, 4, 1};
//
//        int[] expectedValue = {3, 6, 2, 4, 3, 6, 2, 4};
//
//        // initialize class to test
//        ArrayHelper testClass = new ArrayHelper();
//
//        // invoke method on class to test
//        int[] returnedValue = testClass.leftUnion(leftArray, rightArray);
//
//        // assert return value
//        assertArrayEquals(expectedValue, returnedValue);
//
//    }

//    @Test
//    public void testLeftUnionWithException() throws Exception {
//        // initialize variable inputs
//        int[] leftArray = {3, 6, 2, 4};
//        int[] rightArray = {3, 6, 2, 4, 1};
//
//        String expectedValue = "Wrong Values";
//
//        // initialize class to test
//        ArrayHelper testClass = new ArrayHelper();
//
//        // invoke method on class to test
//        try {
//            testClass.leftUnion(leftArray, rightArray);
//            fail("Exception Should be thrown");
//        }
//        catch (MyException exception) {
//            assertEquals(expectedValue, exception.getErrorCode());
//        }
//
//        // assert return value
//
//    }

    @Test
    public void testMerge() throws Exception {

        //initialize variable inputs
        Person[] group1 = new Person[4];
        Person[] group2 = new Person[5];

        group1[0] = new Person("Alexandr", "Matushevskyi", 35, Position.TRAINEE);
        group1[1] = new Person("John", "Rambo", 45, Position.DIRECTOR);
        group1[2] = new Person("John", "Rambo", 20, Position.QA);
        group1[3] = new Person("Masha", "Yefrosinina", 36, Position.DEVELOPER);

        group2[0] = new Person("Alex", "Shultz", 21, Position.TRAINEE);
        group2[1] = new Person("Jack", "Flash", 24, Position.QA);
        group2[2] = new Person("John", "Rambo", 20, Position.QA);
        group2[3] = new Person("Mick", "Morison", 42, Position.DEVELOPER);
        group2[4] = new Person("Masha", "Yefrosinina", 30, Position.QA);

        Person[] expectedValue = new Person[8];
        expectedValue[0] = new Person("Alexandr", "Matushevskyi", 35, Position.TRAINEE);
        expectedValue[1] = new Person("John", "Rambo", 45, Position.DIRECTOR);
        expectedValue[2] = new Person("John", "Rambo", 20, Position.QA);
        expectedValue[3] = new Person("Masha", "Yefrosinina", 36, Position.DEVELOPER);
        expectedValue[4] = new Person("Alex", "Shultz", 21, Position.TRAINEE);
        expectedValue[5] = new Person("Jack", "Flash", 24, Position.QA);
        expectedValue[6] = new Person("Mick", "Morison", 42, Position.DEVELOPER);
        expectedValue[7] = new Person("Masha", "Yefrosinina", 30, Position.QA);


        // initialize class to test
        ArrayHelper testClass = new ArrayHelper();

        // invoke method on class to test
        Person[] returnedValue = testClass.merge(group1, group2);

        // assert return value
        assertArrayEquals(expectedValue, returnedValue);

    }

//    @Test
//    public void testInnerUnion() throws Exception {
//
//    }
//
//    @Test
//    public void testOuterUnion() throws Exception {
//
//    }
}
package ua.com.mamutiks.ua.com.mamutiks.utils;

import ua.com.mamutiks.ua.com.mamutiks.objects.Person;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Сандро on 29.09.2015.
 */
public class ArrayHelper {

//    public int[] leftUnion(int[] leftArray, int[] rightArray) throws MyException{
//        return new int[0];
//    }

    public Person[] merge(Person[] leftArray, Person[] rightArray) throws MyException{

        for (int i = 0; i < leftArray.length; i++){
            for (int j = 0; j < rightArray.length; j++) {

            }
        }


        return new Person[0];
    }

//    public int[] innerUnion(int[] leftArray, int[] rightArray) throws MyException{
//        return new int[0];
//    }
//
//    public int[] outerUnion(int[] leftArray, int[] rightArray) throws MyException{
//        return new int[0];
//    }

    private Person[] dubKill(Person[] array) {
        Person[] tempArray = new Person[array.length];
        tempArray = Arrays.sort(array, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return 0;
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        });

        return tempArray;
    }



}

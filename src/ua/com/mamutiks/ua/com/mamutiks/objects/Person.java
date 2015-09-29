package ua.com.mamutiks.ua.com.mamutiks.objects;

import java.util.Comparator;

/**
 * Created by Сандро on 29.09.2015.
 */
public class Person implements Comparator{

    private final String firstName;
    private final String lastName;
    private final int age;
    private final Position position;

    public Person(String firstName, String lastName, int age, Position position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.position = position;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }


    public Position getPosition() {
        return position;
    }

    @Override
    public int compare(Object obj1, Object obj2) {

        Person person1 = (Person) obj1;
        Person person2 = (Person) obj2;

        int result = person1.lastName.compareTo(person2.lastName);

        if(result != 0) {
            return result;
        }

        result = person1.firstName.compareTo(person2.firstName);

        if(result != 0) {
            return result;
        }
        result = person1.age - person2.age;
        if(result != 0) {
            return result;
        }
        return 0;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (!firstName.equals(person.firstName)) return false;
        if (!lastName.equals(person.lastName)) return false;
        return position == person.position;

    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + age;
        result = 31 * result + position.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", position=" + position +
                '}';
    }
}



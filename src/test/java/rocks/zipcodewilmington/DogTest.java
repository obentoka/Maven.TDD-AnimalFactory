package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    String expectedName = "Tom";
    Date expectedDOB = new Date(20001010);
    Integer expectedID = 0;
    Food expectedFood = new Food();
    Dog test = new Dog(expectedName, expectedDOB, expectedID);

    @Test
    public void constructorTest() {

        // When (we retrieve data from the dog)
        String retrievedName = test.getName();
        Date retrievedBirthDate = test.getBirthDate();
        Integer retrievedId = test.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expectedName, retrievedName);
        Assert.assertEquals(expectedDOB, retrievedBirthDate);
        Assert.assertEquals(expectedID, retrievedId);
    }

    @Test
    public void setNameTest(){

        test.setName(expectedName);
        String actualName = test.getName();

        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setDOBTest(){

        test.setBirthDate(expectedDOB);
        Date actualDOB = test.getBirthDate();

        Assert.assertEquals(expectedDOB, actualDOB);
    }

    @Test
    public void speakTest() {

        String expectedSpeak = "bark!";
        String actualSpeak = test.speak();

        Assert.assertEquals(expectedSpeak, actualSpeak);
    }

    @Test
    public void eatTest(){
        int expectedMealEaten = test.getNumberOfMealsEaten() + 1;
        test.eat(expectedFood);
        int actualMealsEaten = test.getNumberOfMealsEaten();
        Assert.assertEquals(expectedMealEaten, actualMealsEaten);
    }

    @Test
    public void getIDTest(){
        Integer actualID = test.getId();
        Assert.assertEquals(expectedID, actualID);
    }

    @Test
    public void instanceOfTest(){
        boolean expectedBoolean = true;
        boolean actualBoolean = test instanceof Animal;
        Assert.assertEquals(expectedBoolean, actualBoolean);
    }

    @Test
    public void instanceOfTest2(){
        boolean expectedBoolean = true;
        boolean actualBoolean = test instanceof Mammal;
        Assert.assertEquals(expectedBoolean, actualBoolean);
    }
}

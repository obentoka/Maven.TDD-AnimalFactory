package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    String expectedName = "Zula";
    Date expectedDOB = new Date(20001010);
    Integer expectedID = 0;
    Dog testDog = new Dog(expectedName, expectedDOB, expectedID);

    @Test
    public void addTest(){
        DogHouse.clear();
        DogHouse.add(testDog);
        int expected = 1;
        int actual  = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest(){
        DogHouse.clear();
        DogHouse.add(testDog);
        DogHouse.remove(testDog.getId());
        int expected = 0;
        int actual  = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest2(){
        DogHouse.clear();
        DogHouse.add(testDog);
        DogHouse.remove(testDog);
        int expected = 0;
        int actual  = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDogByIDTest(){
        DogHouse.clear();
        DogHouse.add(testDog);
        Dog actual = DogHouse.getDogById(testDog.getId());
        Assert.assertEquals(testDog, actual);
    }

    @Test
    public void getNumberOfDogTest(){
        DogHouse.clear();
        DogHouse.add(testDog);
        DogHouse.add(testDog);
        DogHouse.add(testDog);
        DogHouse.remove(testDog);
        int expected = 2;
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearTest(){
        DogHouse.clear();
        int expected = 0;
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }
}

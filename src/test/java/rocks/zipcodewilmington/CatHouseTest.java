package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    String expectedName = "Zula";
    Date expectedDOB = new Date(20001010);
    Integer expectedID = 0;
    Cat testCat = new Cat(expectedName,expectedDOB, expectedID);

    @Test
    public void addTest(){
        CatHouse.clear();
        CatHouse.add(testCat);
        int expected = 1;
        int actual  = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest(){
        CatHouse.clear();
        CatHouse.add(testCat);
        CatHouse.remove(testCat.getId());
        int expected = 0;
        int actual  = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest2(){
        CatHouse.clear();
        CatHouse.add(testCat);
        CatHouse.remove(testCat);
        int expected = 0;
        int actual  = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCatByIDTest(){
        CatHouse.clear();
        CatHouse.add(testCat);
        Cat actual = CatHouse.getCatById(expectedID);
        Assert.assertEquals(testCat, actual);
    }

    @Test
    public void getNumberOfCatsTest(){
        CatHouse.clear();
        CatHouse.add(testCat);
        CatHouse.add(testCat);
        CatHouse.add(testCat);
        CatHouse.remove(testCat);
        int expected = 2;
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearTest(){
        CatHouse.clear();
        int expected = 0;
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }
}

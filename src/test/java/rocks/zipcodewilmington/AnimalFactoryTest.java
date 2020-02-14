package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest(){
        String expectedName = "Zula";
        Date expectedDOB = new Date(20001010);

        AnimalFactory test;
        Dog actualDog = AnimalFactory.createDog(expectedName, expectedDOB);

        String acutalName = actualDog.getName();
        Date actualDOB = actualDog.getBirthDate();

        Assert.assertEquals(expectedName, acutalName);
        Assert.assertEquals(expectedDOB, actualDOB);
    }

    @Test
    public void createCatTest(){
        String expectedName = "Tom";
        Date expectedDOB = new Date(20001111);

        AnimalFactory test;
        Cat actualDog = AnimalFactory.createCat(expectedName, expectedDOB);

        String acutalName = actualDog.getName();
        Date actualDOB = actualDog.getBirthDate();

        Assert.assertEquals(expectedName, acutalName);
        Assert.assertEquals(expectedDOB, actualDOB);
    }
}

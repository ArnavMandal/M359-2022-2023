package U3_BOOLEAN_IF_STATEMENTS.ShoeCourseJUnitEx;


import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

/**
 *
 * @author sdenna
 * @created: 9-23-22
 *
 * This class was created to test the equals and compareTo methods of the Course
 * and Shoe class.  You can either run ALL tests at once by clicking the double green
 * triangle next to the class header OR you can run tests one at a time by clicking
 * the single green triangle next to the specific test method header
 */
public class Section_3_7Examples_JUnitTest {
    // Variables used for testing equals and compareTo
    Shoe herAirForceOnes, hisAirForceOnes, hisAdidas, herConverse;
    Course per1, per3, per4, per6, per8;

    @Before
    public void runBeforeEachTest() {
        // instantiate all Shoe and Course objects
        herAirForceOnes = new Shoe("Nike", "Air Force 1", 8.5, 110.00);
        hisAirForceOnes = new Shoe("Nike", "Air Force 1", 10.5, 110.00);
        hisAdidas = new Shoe("Adidas", "Original Superstar", 11, 145.0);
        herConverse = new Shoe("Converse", "Chuck Taylor All Star Lift High Top", 7, 75.00);

        per1 = new Course("M448-M468", 29, "Mrs. Denna");
        per3 = new Course("M359", 19, "Mrs. Denna");
        per4 = new Course("M448-M468", 31, "Mrs. Denna");
        per6 = new Course("M448-M468", 31, "Mrs. Denna");
        per8 = new Course("M359", 27, "Mrs. Denna");
    }

    @After
    public void runAfterEachTest() {
        // set all objects to null to wipe them clean before each test.
        herAirForceOnes = null;
        hisAirForceOnes = null;
        hisAdidas = null;
        herConverse = null;

        per1 = null;
        per3 = null;
        per4 = null;
        per6 = null;
        per8 = null;
    }

    // Test equals method for Shoe when shoes are equal
    @Test
    public void equalsShoeTestOne() {
        boolean expected = true;
        boolean actual = herAirForceOnes.equals(hisAirForceOnes);
        assertEquals(expected, actual);
    }

    // Test equals method for Shoe when shoes are NOT equal
    @Test
    public void equalsShoeTestTwo() {
        boolean expected = false;
        boolean actual = herAirForceOnes.equals(herConverse);
        assertEquals(expected, actual);
    }

    // Test compareTo method when calling object is equal to param object
    @Test
    public void compareToShoeTestOne() {
        boolean expected = true;
        int actual = herAirForceOnes.compareTo(hisAirForceOnes);
        assertEquals(expected, actual == 0);
    }

    // Test compareTo method when calling object is less than param object
    @Test
    public void compareToShoeTestTwo() {
        boolean expected = true;
        int actual = herAirForceOnes.compareTo(hisAdidas);
        assertEquals(expected, actual < 0);
    }

    // Test compareTo method when calling object is more than param object
    @Test
    public void compareToShoeTestThree() {
        boolean expected = true;
        int actual = hisAdidas.compareTo(herConverse);
        assertEquals(expected, actual > 0);
    }

    // Test equals method for Shoe when courses are equal
    @Test
    public void equalsCourseTestOne() {
        boolean expected = true;
        boolean actual = per4.equals(per6);
        assertEquals(expected, actual);
    }

    // Test equals method for Course when name is NOT equal
    @Test
    public void equalsCourseTestTwo() {
        boolean expected = false;
        boolean actual = per3.equals(per4);
        assertEquals(expected, actual);
    }

    // Test equals method for Course when names are same and enrollment is NOT equal
    @Test
    public void equalsCourseTestThree() {
        boolean expected = false;
        boolean actual = per1.equals(per4);
        assertEquals(expected, actual);
    }

    // Test compareTo method when calling object is equal to param object
    @Test
    public void compareToCourseTestOne() {
        boolean expected = true;
        int actual = per4.compareTo(per6);
        assertEquals(expected, actual == 0);
    }

    // Test compareTo method when calling object has same name and
    // enrollment is less than param object
    @Test
    public void compareToCourseTestTwo() {
        boolean expected = true;
        int actual = per1.compareTo(per4);
        assertEquals(expected, actual < 0);
    }

    // Test compareTo method when calling object has same name and
    // enrollment is more than param object
    @Test
    public void compareToCourseTestThree() {
        boolean expected = true;
        int actual = per8.compareTo(per3);
        assertEquals(expected, actual > 0);
    }

    // Test compareTo method when calling object has name that comes
    // before param object
    @Test
    public void compareToCourseTestFour() {
        boolean expected = true;
        int actual = per3.compareTo(per4);
        assertEquals(expected, actual < 0);
    }

    // Test compareTo method when calling object has name that comes
    // after param object
    @Test
    public void compareToCourseTestFive() {
        boolean expected = true;
        int actual = per6.compareTo(per8);
        assertEquals(expected, actual > 0);
    }

}

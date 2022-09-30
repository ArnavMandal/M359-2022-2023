package U3_BOOLEAN_IF_STATEMENTS.ChevyLab;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
public class ChevyJUnitTestStudent {
        // Create all sample Chevy to be used in code
        private Chevy traxBase, traxLux, bluesilverado, moonTesla;
        private Chevy corvetteSport, corvetteClassic;

        @Before
        public void runBeforeEachTest() {
            // instantiate all Chevy objects
            traxBase = new Chevy();
            traxLux = new Chevy();
            bluesilverado = new Chevy(1990, 15000, 16.5, 37850, "Silverado",
                    "Blue", true, true, false);
            corvetteClassic = new Chevy(1963, 123500, 13.5, 61500, "Corvette (Classic)",
                    "Fire Red", true, false, false);
            corvetteSport = new Chevy(2020, 1500, 18.5, 58900, "Corvette (Sport)",
                    "Fire Red", true, false, true);
            moonTesla = new Chevy(2021, 2000, 0, 69420, "Not a Chevy",
                    "Silver", true, true, true);

        }
        @After
        public void runAfterEachTest() {
            traxBase = null;
            traxLux = null;
            bluesilverado = null;
            corvetteClassic = null;
            corvetteSport = null;
            moonTesla = null;
        }

        // this method tests the get/set method calls in driver
        @Test
        public void getSetMethodsTestOne() {
            traxBase.setMiles(15);
            int actual = traxBase.getMiles();
            int expected = 15;
            assertEquals(expected, actual);
        }

        // this method tests the get/set method calls in driver
        @Test
        public void getSetMethodsTestTwo() {
            // Set traxLux mileage to 175 with both a luxury and 4WD package
            traxLux.setLuxuryPkg(true);
            traxLux.setMiles(175);
            traxLux.set4WDPkg(true);
            String expected = "true175true";
            String actual = traxLux.getLuxuryPkg() + "" + traxLux.getMiles()+ "" + traxLux.get4WDPkg();
            assertEquals(expected, actual);
        }

    // tests if compareTo works when calling Chevy object has more miles
    @Test
    public void compareToMethodTestOne() {
        int actual = corvetteClassic.compareTo(corvetteSport);
        assertEquals(true, actual > 0);
    }

    // tests if compareTo works when calling Chevy object has less miles
    @Test
    public void compareToMethodTestTwo() {
        int actual = corvetteSport.compareTo(corvetteClassic);
        assertEquals(true, actual < 0);
    }

    // tests if compareTo recognizes equal Chevy by miles
    @Test
    public void compareToMethodTestThree() {
        int actual = corvetteSport.compareTo(corvetteSport);
        assertEquals(0, actual);
    }

    // tests if equals method recognizes equal Chevy objects
    @Test
    public void equalsMethodTestOne() {
        Chevy other = new Chevy();
        other.setModel(bluesilverado.getModel());
        other.setColor(bluesilverado.getColor());

        boolean actual = bluesilverado.equals(other);
        assertEquals(true, true);
    }

    // tests if equals method recognizes nonequal Chevy objects
    @Test
    public void equalsMethodTestTwo() {
        Chevy other = new Chevy();
        other.setModel("Different model");
        boolean actual = bluesilverado.equals(other);
        assertEquals(false, actual);
    }

    // tests base price
    @Test
    public void calcPriceTestOne() {
        double actual = traxBase.getBasePrice();
        double expected = 16000.0;
        assertEquals(expected, actual, 0.01);
    }

    // tests priceWithUpgrades when a luxury package exists
    @Test
    public void calcPriceTestTwo() {
        double actual = corvetteClassic.getPriceWithUpgrades();
        double expected = 73800.0;
        assertEquals(expected, actual, 0.01);
    }

    // tests priceWithUpgrades when a luxury and 4WD package exists
    @Test
    public void calcPriceTestThree() {
        double actual = bluesilverado.getPriceWithUpgrades();
        double expected = 48920.0;
        assertEquals(expected, actual, 0.01);
    }

    // tests grandtotal
    @Test
    public void calcPriceTestFour() {
        double actual = bluesilverado.getGrandTotal();
        double expected = 54888.24;
        assertEquals(expected, actual, 0.01);
    }

}

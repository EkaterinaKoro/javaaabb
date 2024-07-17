import org.junit.Assert;
import org.junit.Test;

public class BonusServiceTest {


    @Test
    public void testRegisteredUnderLimit() {
        BonusService bonusService = new BonusService();

        int expected = 150;
        int actual = bonusService.calcBonus(5_000, true);
        // System.out.println("1. " + expected + "== ? == " + actual);

        Assert.assertEquals(expected, actual);

        @Test
        public void testUnregisteredUnderLimit () {
            BonusService bonusService = new BonusService();
            int expected = 50;
            int actual = bonusService.calcBonus(5_000, false);
            // System.out.println("2, " + expected + "== ? == " + actual);
            Assert.assertEquals(expected, actual);
        }

    }

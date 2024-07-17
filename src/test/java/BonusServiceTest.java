import org.junit.Test;

public class BonusServiceTest {


    @Test
    public void testRegisteredUnderLimit() {
        BonusService service = new BonusService();

        long amount = 1000;
        boolean registered = true;
        long actual = service.calcBonus(amount, registered);
        System.out.println("Bonus calculated: " + actual);

        amount = 2000;
        registered = false;
        actual = service.calcBonus(amount, registered);
        System.out.println("Bonus calculated: " + actual);

        amount = 10000;
        registered = true;
        actual = service.calcBonus(amount, registered);
        System.out.println("1. " + registered + "== ? == " + actual);

        amount = 5000;
        registered = false;
        actual = service.calcBonus(amount, registered);
        System.out.println("2. " + registered + "== ? == " + actual);


    }

}

public class Main {
    public static void main(String[] args) {

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
        System.out.println("Bonus calculated: " + actual);

        amount = 1000;
        registered = false;
        actual = service.calcBonus(amount, registered);
        System.out.println("Bonus calculated: " + actual);

    }

}





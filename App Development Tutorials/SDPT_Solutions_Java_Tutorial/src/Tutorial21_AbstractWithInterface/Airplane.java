package Tutorial21_AbstractWithInterface;

public class Airplane extends Vehicle implements Air {

    @Override
    public void fly() {
        System.out.println("The airplane is now flying through the sky.");
    }

    @Override
    public void landfromAir() {
        System.out.println("The airplane is landing safely on the runway.");
    }
}

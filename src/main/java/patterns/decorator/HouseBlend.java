package patterns.decorator;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}

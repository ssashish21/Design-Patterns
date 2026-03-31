package designPatterns.decorator;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Suger";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 0.3;
    }
}

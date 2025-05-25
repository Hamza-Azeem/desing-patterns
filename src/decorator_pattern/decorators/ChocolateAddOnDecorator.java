package decorator_pattern.decorators;

import decorator_pattern.Drink;

public class ChocolateAddOnDecorator extends DrinkAddOnDecorator{
    Drink drink;
    public ChocolateAddOnDecorator(Drink drink) {
        this.drink = drink;
    }
    @Override
    public int cost() {
        return 2 + drink.cost();
    }
}

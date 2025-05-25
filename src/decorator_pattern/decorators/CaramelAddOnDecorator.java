package decorator_pattern.decorators;

import decorator_pattern.Drink;

public class CaramelAddOnDecorator extends DrinkAddOnDecorator {
   Drink drink;

   public CaramelAddOnDecorator(Drink drink) {
       this.drink = drink;
   }
    @Override
    public int cost() {
        return 1 + drink.cost();
    }
}

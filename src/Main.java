import adpator_pattern.Adaptee;
import adpator_pattern.Adapter;
import adpator_pattern.AdapterInterface;
import decorator_pattern.Drink;
import decorator_pattern.IcedCoffee;
import decorator_pattern.decorators.CaramelAddOnDecorator;
import decorator_pattern.decorators.ChocolateAddOnDecorator;
import singleton_pattern.Singleton;
import strategy_pattern.Device;
import strategy_pattern.DuckCallBehavior;
import strategy_pattern.DuckDevice;

public class Main {
    public static void main(String[] args) {

////        Strategy example
//        Device device = new DuckDevice();
//        device.turnOnDevice();
//        device.call();
//        device.setCallBehavior(new DuckCallBehavior());
//        device.call();
//        device.turnOffDevice();

////        Decorator example
//        Drink drink = new CaramelAddOnDecorator( // adds 1
//                new ChocolateAddOnDecorator( // adds 2
//                        new ChocolateAddOnDecorator( // adds 2
//                                new IcedCoffee() // adds 1
//                        )
//                )
//        );
//        System.out.println(drink.cost());

////        Singleton example
//        Singleton one = Singleton.getInstance();
//        Singleton two = Singleton.getInstance();
//        System.out.println(one == two);

////        Adapter example
//        AdapterInterface adapter = new Adapter(
//                new Adaptee()
//        );
//        adapter.request();

    }
}
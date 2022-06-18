package Factories;

public class FactoryProvider {
    public AbstractFactory getFactory(String input){
        if (input.toLowerCase().equals("pizza"))
            return new PizzaFactory();
        return null;
    }
}

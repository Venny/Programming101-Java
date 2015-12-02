package week02.Wednesday.FastAndFurious;

/**
 * Created by inspired on 29.11.15.
 */
public class Car {
    public static void main(String[] args){
        Car myCar = new Volkswagen();
        Car mySecondCar = new Audi();
        System.out.println(mySecondCar.isEcoFriendly(false));
        System.out.println(myCar.isEcoFriendly(false));
    }

    protected boolean isEcoFriendly(boolean testing){
        return true;
    }
}

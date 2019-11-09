package facade;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/19 15:57
 * @Author: Ling Chen
 * @Description:
 */
public class FakerFacade {

    private Car car;
    private House house;

    public FakerFacade() {
        this.car = new Car();
        this.house = new House();
    }

    public void showHouse(){
        house.showHouse();
    }

    public void showCar(){
        car.showCar();
    }
}

package facade;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/19 16:03
 * @Author: Ling Chen
 * @Description:
 */
public class FakerTest {
    public static void main(String[] args) {
        FakerFacade fakerFacade = new FakerFacade();
        fakerFacade.showHouse();
        fakerFacade.showCar();
    }
}

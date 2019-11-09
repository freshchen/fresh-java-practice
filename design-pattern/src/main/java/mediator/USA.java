package mediator;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/26 15:13
 * @Author: Ling Chen
 * @Description:
 */
public class USA extends Country {
    public USA(UnitedNations mediator) {
        super(mediator);
    }

    public void declare(String message) {
        getMediator().declare(message, this);
    }

    public void getMessage(String message){
        System.out.println( message + " USA Got it: ");
    }
}

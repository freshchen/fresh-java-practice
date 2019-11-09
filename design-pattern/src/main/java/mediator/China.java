package mediator;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/26 15:16
 * @Author: Ling Chen
 * @Description:
 */
public class China extends Country{
    public China(UnitedNations mediator) {
        super(mediator);
    }

    public void declare(String message) {
        getMediator().declare(message, this);
    }

    public void getMessage(String message){
        System.out.println( message + " China Got it: ");
    }
}

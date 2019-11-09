package template;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/19 14:53
 * @Author: Ling Chen
 * @Description:
 */
abstract public class GameTemplate {

    public abstract void causeFailure();

    public void gameProcess(){
        System.out.println(" All army attack !!!");
        causeFailure();
        System.out.println(" Mission fail !!!");
    }
}

package state;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/21 20:57
 * @Author: Ling Chen
 * @Description:
 */
public class AfternoonState implements State{
    @Override
    public void writeProgram(Work work) {
        if (work.getTime() >= 13 && work.getTime() < 18){
            System.out.println("current time " + work.getTime() + " fighting !");
        }
    }
}

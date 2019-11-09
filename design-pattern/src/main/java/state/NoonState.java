package state;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/21 20:54
 * @Author: Ling Chen
 * @Description:
 */
public class NoonState implements State{
    @Override
    public void writeProgram(Work work) {
        if (work.getTime() >= 12 && work.getTime() <13){
            System.out.println("current time " + work.getTime() + " i am tired");
        }else {
            work.setCurrentState(new AfternoonState());
            work.writeProgram();
        }
    }
}

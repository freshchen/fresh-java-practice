package state;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/21 20:50
 * @Author: Ling Chen
 * @Description:
 */
public class ForenoonState implements State {
    @Override
    public void writeProgram(Work work) {
        if (work.getTime() >= 10 && work.getTime() < 12){
            System.out.println("current time " + work.getTime() + " make a cup of coffee then write");
        }else {
            work.setCurrentState(new NoonState());
            work.writeProgram();
        }
    }
}

package state;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/21 20:59
 * @Author: Ling Chen
 * @Description:
 */
public class OneDay {
    public static void main(String[] args) {
        Work work = new Work();
        work.setCurrentState(new ForenoonState());
        work.setTime(10);
        work.writeProgram();
        work.setTime(12.5);
        work.writeProgram();
        work.setTime(13);
        work.writeProgram();
        work.setTime(15);
        work.writeProgram();
    }
}

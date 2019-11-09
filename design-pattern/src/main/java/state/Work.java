package state;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/21 20:40
 * @Author: Ling Chen
 * @Description:
 */
public class Work {

    private State currentState;
    private double time;

    public void writeProgram(){
        currentState.writeProgram(this);
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
}

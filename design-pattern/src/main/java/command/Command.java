package command;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/26 14:05
 * @Author: Ling Chen
 * @Description:
 */
public abstract class Command {

    private Receiver receiver;

    public Receiver getReceiver() {
        return receiver;
    }

    abstract public void execute();

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }
}

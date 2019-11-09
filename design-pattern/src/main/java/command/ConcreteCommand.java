package command;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/26 14:07
 * @Author: Ling Chen
 * @Description:
 */
public class ConcreteCommand extends Command {


    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        getReceiver().action();
    }
}

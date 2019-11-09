package command;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/26 14:05
 * @Author: Ling Chen
 * @Description:
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand(){
        command.execute();
    }
}

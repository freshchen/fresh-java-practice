package command;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/26 14:11
 * @Author: Ling Chen
 * @Description:
 */
public class JustDoIt {
    public static void main(String[] args) {
        Receiver xiaowang = new Receiver();
        Command command = new ConcreteCommand(xiaowang);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.executeCommand();
    }
}

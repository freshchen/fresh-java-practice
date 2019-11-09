package interpreter;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/26 19:52
 * @Author: Ling Chen
 * @Description:
 */
public class TerminalExpression implements Expression{
    @Override
    public void interpret(Content content) {
        System.out.println("This is a terminal");
    }
}

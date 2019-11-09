package interpreter;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/26 19:56
 * @Author: Ling Chen
 * @Description:
 */
public class NonterminalExpression implements Expression{
    @Override
    public void interpret(Content content) {
        System.out.println("This is not a terminal");
    }
}

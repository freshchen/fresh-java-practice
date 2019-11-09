package interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/26 19:58
 * @Author: Ling Chen
 * @Description:
 */
public class Language {
    public static void main(String[] args) {
        Content content = new Content();
        List<Expression> expressions = new ArrayList <>();
        expressions.add(new TerminalExpression());
        expressions.add(new NonterminalExpression());
        expressions.add(new NonterminalExpression());
        expressions.add(new TerminalExpression());

        expressions.stream().forEach(item -> item.interpret(content));
    }
}

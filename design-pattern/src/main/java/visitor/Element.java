package visitor;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/26 20:07
 * @Author: Ling Chen
 * @Description:
 */
public interface Element {
    public void accept(Visitor visitor);
}

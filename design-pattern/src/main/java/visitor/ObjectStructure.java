package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/26 20:16
 * @Author: Ling Chen
 * @Description:
 */
public class ObjectStructure {

    private List<Element> elements = new ArrayList <>();

    public void attach(Element element){
        elements.add(element);
    }

    public void detach(Element element){
        elements.remove(element);
    }

    public void accept(Visitor visitor){
        elements.stream().forEach(element -> element.accept(visitor));
    }
}

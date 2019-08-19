package generic;

import java.util.Collection;

/**
 * @program: fresh-java-practice
 * @Date: 2019/8/18 19:15
 * @Author: Ling Chen
 * @Description: 生产用extends，消费用super
 */
public class NewStack<T> {

    /**
     * T的某个子类型的Iterable接口
     * @param src
     */
    public void pushAll(Iterable <? extends T> src) {
        for (T t : src) {
            push(t);
        }
    }

    /**
     * T的某种超类的集合
     * @param dst
     */
    public void popAll(Collection <? super T> dst){
        while (!isEmpty()){
            dst.add(pop());
        }
    }

    public NewStack() {
    }

    public void push(T t) {
    }

    public boolean isEmpty(){
        return true;
    }

    public T pop(){
        return (T) new Object();
    }

}

package generic;

/**
 * @program: fresh-java-practice
 * @Date: 2019/8/8 19:19
 * @Author: Ling Chen
 * @Description:
 */
public class GenericClass<T> {

    private T time;

    GenericClass() {
    }

    public GenericClass(T time) {
        this.time = time;
    }

    public T getTime(){
        return time;
    }
}

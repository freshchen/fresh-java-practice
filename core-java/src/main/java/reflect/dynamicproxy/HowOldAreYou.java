package reflect.dynamicproxy;

/**
 * @program: fresh-languages
 * @Date: 2019/5/26 10:37
 * @Author: Ling Chen
 * @Description:
 */
public class HowOldAreYou {
    public static void main(String[] args) {
        MyInvocationHandler handler = new MyInvocationHandler();
        Subject sub = (Subject) handler.bind(new RealSubject());
        System.out.println(sub.say("Xiao wang", 23));
    }
}

package create_and_destory;

/**
 * @program: fresh-java-practice
 * @Date: 2019/8/8 21:56
 * @Author: Ling Chen
 * @Description:
 */
public class NoConstruct {

    private static String name;

    public static String getName(){
        return name;
    }

    /**
     * 确保不被实例化
     */
    private NoConstruct(){
        throw new AssertionError();
    }
}

package create_and_destory;

/**
 * @program: fresh-java-practice
 * @Date: 2019/8/8 21:46
 * @Author: Ling Chen
 * @Description: 使用单枚举可以实现单例，并且序列化不会出错
 */
public enum  Singleton {
    INSTANCE;

    Singleton() {
    }
}

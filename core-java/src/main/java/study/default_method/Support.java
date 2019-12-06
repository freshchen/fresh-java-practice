package study.default_method;

/**
 * @anthor LingChen
 * @create 11/14/2019 1:26 PM
 * @Description
 */
public interface Support {
    static void weather(){
        System.out.println("晴转多云");
    }

    static void main(String[] args) {
        Support.weather();
    }
}

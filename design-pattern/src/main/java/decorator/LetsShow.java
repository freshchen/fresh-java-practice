package decorator;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/18 15:54
 * @Author: Ling Chen
 * @Description:
 */
public class LetsShow {

    public static void main(String[] args) {
        Person freshchen = new AJOne(new Supreme(new OffWhite(new Man())));
        freshchen.show();
    }
}

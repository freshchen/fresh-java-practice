package template;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/19 15:05
 * @Author: Ling Chen
 * @Description:
 */
public class BeginGame {

    public static void main(String[] args) {
        GameTemplate game1 = new FailureReasonOne();
        game1.gameProcess();

        GameTemplate game2 = new FailureReasonTwo();
        game2.gameProcess();
    }
}

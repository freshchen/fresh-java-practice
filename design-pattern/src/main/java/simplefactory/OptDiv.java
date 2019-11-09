package simplefactory;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/16 0:16
 * @Author: Ling Chen
 * @Description:
 */
public class OptDiv extends Operation{
    public double getResult() {
        double result =0;
        try {
            result = super.getNumberOne() / super.getNumberTwo();
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}

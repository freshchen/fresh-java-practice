package simplefactory;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/16 0:22
 * @Author: Ling Chen
 * @Description:
 */
public class OptFactory {

    public static Operation createOpt(String opt) throws Exception {
        Operation operation = null;
        if ("+".equals(opt)) {
            operation = new OptAdd();
        }else if ("-".equals(opt)){
            operation = new OptSub();
        }else if ("*".equals(opt)){
            operation = new OptMul();
        }else if ("/".equals(opt)){
            operation = new OptDiv();
        }else {
            throw new Exception("no such operation");
        }
        return operation;
    }
}

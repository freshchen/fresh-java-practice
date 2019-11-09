package chain;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/26 14:41
 * @Author: Ling Chen
 * @Description:
 */
public class GeneralManager extends Manager{
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(MoneyRequest request) {
        if ("money".equals(request.getRequestType()) && request.getNumber() <= 100000){
            System.out.println(getName() + " say:" + request.toString() + " is approved");
        }else {
            System.out.println(getName() + " say:" + request.toString() + "bro wake up !!!");
        }
    }
}

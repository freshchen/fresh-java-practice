package chain;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/26 14:31
 * @Author: Ling Chen
 * @Description:
 */
public class CommonManager extends Manager{
    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(MoneyRequest request) {
        if ("money".equals(request.getRequestType()) && request.getNumber() <= 1000){
            System.out.println(getName() + " say:" + request.toString() + " is approved");
        }else {
            if (getSuperior() != null){
                getSuperior().requestApplications(request);
            }
        }
    }
}

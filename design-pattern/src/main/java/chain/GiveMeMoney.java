package chain;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/26 14:43
 * @Author: Ling Chen
 * @Description:
 */
public class GiveMeMoney {

    public static void main(String[] args) {
        Manager teamLeader = new CommonManager("team leader");
        Manager head = new Majordemo("head");
        Manager boss = new GeneralManager("boss");
        teamLeader.setSuperior(head);
        head.setSuperior(boss);

        MoneyRequest request = new MoneyRequest();
        request.setRequestType("money");
        request.setRequestContent("hi , I work hard . I want more money");

        request.setNumber(500);
        teamLeader.requestApplications(request);

        request.setNumber(5000);
        teamLeader.requestApplications(request);

        request.setNumber(50000);
        teamLeader.requestApplications(request);

        request.setNumber(500000);
        teamLeader.requestApplications(request);
    }
}

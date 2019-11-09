package bridge;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/26 13:30
 * @Author: Ling Chen
 * @Description:
 */
public abstract class OperatingSystem {

    private MobileSoftware software;

    public MobileSoftware getSoftware() {
        return software;
    }

    public void setSoftware(MobileSoftware software) {
        this.software = software;
    }

    public abstract void runApp();
}

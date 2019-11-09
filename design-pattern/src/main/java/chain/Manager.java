package chain;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/26 14:21
 * @Author: Ling Chen
 * @Description:
 */
public abstract class Manager {

    private String name;
    private Manager superior;

    abstract public void requestApplications(MoneyRequest request);

    public Manager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manager getSuperior() {
        return superior;
    }

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }
}

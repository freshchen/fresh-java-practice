package mediator;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/26 15:17
 * @Author: Ling Chen
 * @Description:
 */
public class SecurityCouncil implements UnitedNations {

    private USA usa;
    private China china;

    public USA getUsa() {
        return usa;
    }

    public void setUsa(USA usa) {
        this.usa = usa;
    }

    public China getChina() {
        return china;
    }

    public void setChina(China china) {
        this.china = china;
    }

    @Override
    public void declare(String message, Country country) {
        if (country == getUsa()) {
            getChina().getMessage(message);
        } else if (country == getChina()) {
            getUsa().getMessage(message);
        }
    }
}

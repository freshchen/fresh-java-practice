package mediator;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/26 15:12
 * @Author: Ling Chen
 * @Description:
 */
public class Country {

    private UnitedNations mediator;

    public Country(UnitedNations mediator) {
        this.mediator = mediator;
    }

    public UnitedNations getMediator() {
        return mediator;
    }

    public void setMediator(UnitedNations mediator) {
        this.mediator = mediator;
    }
}

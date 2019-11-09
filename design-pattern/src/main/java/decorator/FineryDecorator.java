package decorator;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/18 15:35
 * @Author: Ling Chen
 * @Description:
 */
public abstract class FineryDecorator implements Person {

    Person person = null;

    public FineryDecorator(Person person) {
        this.person = person;
    }


    public void show() {
        if (person != null) {
            person.show();
        }
    }
}

package reflect.method_field_interface;

/**
 * @anthor LingChen
 * @create 2018-07-02-23:16
 */
public class Person implements YouKonwMe, NoWordOne, NoWordTwo, NoWordThree {

    private String sex;

    public Person() {
    }

    public Person(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void sayNothing() {
        System.out.println(" ... .... ");
    }

    public void niceToMeetYou(String name, int age) {
        System.out.println(" Nice to meet you , my name is " + name + " i " + age );
    }

    public static final Class<?> getMyClass(){
        Class<?> myClass = null;
        try {
            myClass =  Class.forName("reflect.method_field_interface.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return myClass;
    }

    @Override
    public String toString() {
        return "Person{" +
                "sex='" + sex + '\'' +
                '}';
    }
}

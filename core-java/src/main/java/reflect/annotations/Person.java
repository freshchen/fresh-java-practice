package reflect.annotations;

public class Person implements Action {

    @Chinese
    private String name;

    @Override
    @Hello("服务员")
    public void order() {
        System.out.println("可以给我一个汉堡包么？");
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Person() {
    }
}

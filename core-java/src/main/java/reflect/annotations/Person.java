package reflect.annotations;

public class Person implements Action {

    @Chinese
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    @Hello("小美")
    public void order() {
        System.out.println("可以给我一个汉堡包么？");
    }

}

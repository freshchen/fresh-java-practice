package reflect.annotations;

public class Person {

    @Chinese
    private String name;

    public void eat(){
        System.out.println("I'm hungry");
    }

    public Person(String name) {
        this.name = name;
    }
}

package gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import gson.entity.Person;

public class Test {

    public static void case1() {
        Gson gson = new Gson();
        String json = gson.toJson(new Person("wang", 22));
        System.out.println(json);
    }

    public static void case2() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(new Person("wang", 22));
        System.out.println(json);
    }

    public static void case3() {
        String json = "{\"name\":\"wang\",\"age\":22}";
        Gson gson = new Gson();
        Person person = gson.fromJson(json, Person.class);
        System.out.println(person);
    }


    public static void main(String[] args) {
        Test.case1();
        Test.case2();
        Test.case3();
    }
}

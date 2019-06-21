package generic;

import java.util.Map;

/**
 * @anthor LingChen
 * @create 6/17/2019 5:12 PM
 * @Description
 */
public abstract class MethodChainingConfig<A extends MethodChainingConfig<A, B>, B extends Map> {

    private String name;
    private int age;
    private Map<?, ?> story;

    MethodChainingConfig() {
    }

    MethodChainingConfig(MethodChainingConfig<A, B> chainingConfig) {
        this.name = chainingConfig.name;
        this.age = chainingConfig.age;
        this.story = chainingConfig.story;
    }

    public A name(String name) {
        this.name = name;
        return self();
    }

    public A age(int age) {
        this.age = age;
        return self();
    }

    public A story(Map<?, ?> story) {
        this.story = story;
        return self();
    }

    private A self() {
        return (A) this;
    }

    @Override
    public String toString() {
        return "MethodChainingConfig{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", story=" + story +
                '}';
    }
}

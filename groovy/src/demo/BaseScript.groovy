package demo

class BaseScript extends Script{

    String name
    public void greet() { println "Hello, $name!" }

    @Override
    Object run() {
        greet()
    }

}

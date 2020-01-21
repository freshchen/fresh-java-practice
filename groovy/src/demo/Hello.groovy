package demo

class Hello {
    static void main(String[] args) {
        println("Hello")
        println "hello"
        int[] range = 0..10;
        println(range)

        List<String> strings = ["g", "r", "o", "o", "v", "y"]

        Map<String, String> stringMap = ["name": "wang", "age": "99"]
        println(stringMap.get("name"))

        if ("Groovy" =~ "^G") {
            println(true)
        }

        def closure = { param -> println "Hello ${param}" };
        closure.call("World");

//        println "ls -l".execute().text

        def a = 10
        def b = 20
        println a <=> b
        println b <=> a

    }
}

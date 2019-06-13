## java-lambda

### lambda与匿名内部类区别

匿名内部类仍然是一个类，只是不需要程序员显示指定类名，编译器会自动为该类取名。

Lambda表达式通过invokedynamic指令实现，书写Lambda表达式不会产生新的类。



### 集合类适应Lambda增加的方法

| 接口名     | Java8新加入的方法                                            |
| ---------- | ------------------------------------------------------------ |
| Collection | removeIf() spliterator() stream() parallelStream() forEach() |
| List       | replaceAll() sort()                                          |
| Map        | getOrDefault() forEach() replaceAll() putIfAbsent() remove() replace() computeIfAbsent() computeIfPresent() compute() merge() |


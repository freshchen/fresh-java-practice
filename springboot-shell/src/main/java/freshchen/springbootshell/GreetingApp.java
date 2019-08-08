package freshchen.springbootshell;


import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

/**
 * @program: fresh-java-practice
 * @Date: 2019/7/28 22:12
 * @Author: Ling Chen
 * @Description:
 */
@ShellComponent
public class GreetingApp {

    @ShellMethod
    public String sayHi(String name){
        return String.format("Hi %s", name);
    }
}

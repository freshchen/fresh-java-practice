package reflect.method_field_interface;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

/**
 * @program: fresh-core-java
 * @Date: 2019/5/24 0:18
 * @Author: Ling Chen
 * @Description:
 */
public class Fields {

    public void showFields(Class<?> personClass){
        Field[] fields = personClass.getFields();
        int length  = fields.length;
        for (int i = 0; i < length; i++) {
            Field field = fields[i];
            System.out.println("field " + (i + 1));
            System.out.println(Modifier.toString(field.getModifiers()));
            System.out.println(field.getType());
            System.out.println(field.getName());
        }
    }

    public void changeField(Class<?> personClass) throws NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Person person = (Person) personClass.getDeclaredConstructor().newInstance();
        Field field = personClass.getDeclaredField("sex");
        field.setAccessible(true);
        field.set(person, "man");
        System.out.println(person.toString());
    }

    public static void main(String[] args) {
        Fields fields = new Fields();
        Class<?> personClass = Person.getMyClass();
        //取得共有的全部属性
        fields.showFields(personClass);
        try {
            fields.changeField(personClass);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }


    }
}

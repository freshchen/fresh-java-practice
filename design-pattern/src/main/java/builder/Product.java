package builder;

import java.util.ArrayList;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/19 16:33
 * @Author: Ling Chen
 * @Description:
 */
public class Product {

    private ArrayList <String> parts = new ArrayList <String>();

    public void addPart(String partName) {
        parts.add(partName);
    }

    public void show() {
        System.out.println("product parts show");
        for (String part : parts) {
            System.out.println(part + " ");
        }
    }
}

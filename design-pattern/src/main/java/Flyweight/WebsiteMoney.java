package Flyweight;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/26 16:16
 * @Author: Ling Chen
 * @Description:
 */
public class WebsiteMoney {

    public static void main(String[] args) {
        WebsiteFactory factory = new WebsiteFactory();
        Website website1 = factory.getWebsiteCategory("blog");
        website1.user(new User("one kong"));

        Website website2 = factory.getWebsiteCategory("blog");
        website2.user(new User("two kong"));

        Website website3 = factory.getWebsiteCategory("show");
        website3.user(new User("three kong"));

        Website website4 = factory.getWebsiteCategory("show");
        website4.user(new User("four kong"));

        System.out.println(factory.getFlyweights().toString());
    }
}

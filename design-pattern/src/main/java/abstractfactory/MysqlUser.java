package abstractfactory;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/21 0:49
 * @Author: Ling Chen
 * @Description:
 */
public class MysqlUser implements User {
    @Override
    public void insert(User user) {
        System.out.println("add one User data to Mysql");
    }

    @Override
    public User getUser(int id) {
        System.out.println("get one User data from Mysql");
        return null;
    }
}

package abstractfactory;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/21 0:48
 * @Author: Ling Chen
 * @Description:
 */
public interface User {

    void insert (User user);

    User getUser(int id);
}

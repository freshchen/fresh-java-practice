package abstractfactory;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/21 0:45
 * @Author: Ling Chen
 * @Description:
 */
public interface DatabaseFactory {
    User createUser();

    Department createDepartment();
}

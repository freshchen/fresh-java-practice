package abstractfactory;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/21 0:54
 * @Author: Ling Chen
 * @Description:
 */
public class UseDatabase {
    public static void main(String[] args) {
        DatabaseFactory mysqlFactory = new MysqlFactory();
        User user = mysqlFactory.createUser();
        user.insert(new MysqlUser());
        user.getUser(1);

        Department department = mysqlFactory.createDepartment();
        department.insert(new MysqlDepartment());
        department.getDepartment(1);
    }
}

package abstractfactory;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/21 0:41
 * @Author: Ling Chen
 * @Description:
 */
public interface Department {

    void insert (Department department);

    Department getDepartment(int id);
}

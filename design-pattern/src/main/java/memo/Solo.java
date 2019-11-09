package memo;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/22 20:55
 * @Author: Ling Chen
 * @Description:
 */
public class Solo {
    public static void main(String[] args) {
        Nevermore sf = new Nevermore();
        RoleCaretaker roleCaretaker = new RoleCaretaker();
        roleCaretaker.setRoleMemento(sf.save());
        System.out.println(sf.toString());

        sf.setHealthPoint(1);
        sf.setMagicPoint(0);
        System.out.println(sf.toString());

        sf.rollback(roleCaretaker.getRoleMemento());
        System.out.println(sf.toString());

    }
}

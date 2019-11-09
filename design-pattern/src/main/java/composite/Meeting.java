package composite;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/22 22:53
 * @Author: Ling Chen
 * @Description:
 */
public class Meeting {

    public static void main(String[] args) {
        Company headOffice = new ConcreteCompany("headOffice");
        headOffice.add(new HRDepartment("headOffice HRDepartment"));
        headOffice.add(new FinanceDepartment("headOffice FinanceDepartment"));

        Company shangHaiOfficeOffice = new ConcreteCompany("ShangHai Office");
        shangHaiOfficeOffice.add(new HRDepartment("ShangHai Office HRDepartment"));
        shangHaiOfficeOffice.add(new FinanceDepartment("ShangHai Office FinanceDepartment"));
        headOffice.add(shangHaiOfficeOffice);

        Company hangZhouOffice = new ConcreteCompany("Hang Zhou Office");
        hangZhouOffice.add(new HRDepartment("Hang Zhou Office HRDepartment"));
        hangZhouOffice.add(new FinanceDepartment("Hang Zhou Office FinanceDepartment"));
        headOffice.add(hangZhouOffice);

        headOffice.display();

        headOffice.remove(hangZhouOffice);
        headOffice.display();

    }
}

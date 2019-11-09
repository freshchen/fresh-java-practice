package factoryMethod;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/18 21:52
 * @Author: Ling Chen
 * @Description:
 */
public class StudentFactory implements PublicBenefitFactory{
    public PublicBenefit createPublicBenefitEntity() {
        return new Student();
    }
}

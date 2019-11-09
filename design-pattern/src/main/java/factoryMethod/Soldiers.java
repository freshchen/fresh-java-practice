package factoryMethod;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/18 21:54
 * @Author: Ling Chen
 * @Description:
 */
public class Soldiers {

    public static void main(String[] args) {
        PublicBenefitFactory publicBenefitFactory = new StudentFactory();
        PublicBenefit publicBenefit = publicBenefitFactory.createPublicBenefitEntity();
        publicBenefit.sweep();
        publicBenefit.wash();
    }
}

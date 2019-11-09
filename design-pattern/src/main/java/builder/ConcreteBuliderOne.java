package builder;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/19 16:56
 * @Author: Ling Chen
 * @Description:
 */
public class ConcreteBuliderOne implements Builder{

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.addPart("milk");
    }

    @Override
    public void buildPartB() {
        product.addPart("egg");
    }

    @Override
    public void buildPartC() {
        product.addPart("cheese");
    }

    @Override
    public Product getResult() {
        return product;
    }
}

package builder;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/19 16:58
 * @Author: Ling Chen
 * @Description:
 */
public class ConcreteBuliderTwo implements Builder{

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.addPart("pork");
    }

    @Override
    public void buildPartB() {
        product.addPart("beef");
    }

    @Override
    public void buildPartC() {
        product.addPart("goose");
    }

    @Override
    public Product getResult() {
        return product;
    }
}

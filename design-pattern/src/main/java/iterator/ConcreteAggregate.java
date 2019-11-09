package iterator;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/23 20:10
 * @Author: Ling Chen
 * @Description:
 */
public class ConcreteAggregate implements Aggregate {

    public String names[] = {"Robert", "John", "Julie", "Lora"};

    @Override
    public MyIterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements MyIterator {

        int index;

        @Override
        public boolean hasNext() {

            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }


}

package generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @program: fresh-java-practice
 * @Date: 2019/8/15 21:34
 * @Author: Ling Chen
 * @Description:
 */
public class Chooser<T> {

    private final List<T> choiceArray;

    public Chooser(Collection<T> choiceArray) {
        this.choiceArray = new ArrayList <>(choiceArray);
    }

    public Object choose(){
        Random random = ThreadLocalRandom.current();
        return choiceArray.get(random.nextInt(choiceArray.size()));
    }
}

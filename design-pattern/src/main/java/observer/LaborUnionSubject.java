package observer;

import java.util.ArrayList;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/19 20:30
 * @Author: Ling Chen
 * @Description:
 */
public class LaborUnionSubject {

    private ArrayList <BossObserver> bossObservers = new ArrayList <>();

    public void add(BossObserver bossObserver){
        bossObservers.add(bossObserver);
    }

    public void remove(BossObserver bossObserver){
        bossObservers.remove(bossObserver);
    }

    public void notifyLaborUnion(){
        bossObservers.parallelStream().forEach(BossObserver::update);
    }

}

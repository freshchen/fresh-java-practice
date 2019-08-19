package enum_and_annotation;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: fresh-java-practice
 * @Date: 2019/8/18 20:49
 * @Author: Ling Chen
 * @Description:
 */
public enum Operation {
    PLUS {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS {
        @Override
        public double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES {
        @Override
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DEVIDE {
        @Override
        public double apply(double x, double y) {
            return x / y;
        }
    };

    Operation() {
    }

    public abstract double apply(double x, double y);

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            executorService.execute(() -> {
                System.out.println(Operation.PLUS.apply(100, 20));
                System.out.println(Operation.MINUS.apply(100, 20));
                System.out.println(Operation.DEVIDE.apply(100, 20));
                System.out.println(Operation.TIMES.apply(100, 20));
            });
        }
    }
}

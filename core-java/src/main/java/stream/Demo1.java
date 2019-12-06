package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @anthor LingChen
 * @create 10/24/2019 1:35 PM
 * @Description (1) 找出2011年发生的所有交易，并按交易额排序（从低到高）。
 * (2) 交易员都在哪些不同的城市工作过？
 * (3) 查找所有来自于剑桥的交易员，并按姓名排序。
 * (4) 返回所有交易员的姓名字符串，按字母顺序排序。
 * (5) 有没有交易员是在米兰工作的？
 * (6) 打印生活在剑桥的交易员的所有交易额。
 * (7) 所有交易中，最高的交易额是多少？
 * (8) 找到交易额最小的交易。
 */
public class Demo1 {

    @AllArgsConstructor
    @Getter
    private static class Trader {
        private String name;
        private String city;
    }

    @AllArgsConstructor
    @Getter
    private static class Transaction {
        private Trader trader;
        private int year;
        private int value;
    }


    public static List<Transaction> init() {
        Trader zhao = new Trader("zhao", "SH");
        Trader qian = new Trader("qian", "BJ");
        Trader sun = new Trader("sun", "SH");
        Trader li = new Trader("li", "SH");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(li, 2018, 300),
                new Transaction(zhao, 2019, 1000),
                new Transaction(zhao, 2018, 400),
                new Transaction(qian, 2019, 710),
                new Transaction(qian, 2019, 700),
                new Transaction(sun, 2019, 950)
        );
        return transactions;
    }

    public static void main(String[] args) {
        List<Transaction> transactions = init();

        System.out.println("找出2018年发生的所有交易，并按交易额排序（从低到高）");
        transactions.stream()
                .filter(transaction -> transaction.getYear() == 2018)
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(transaction -> System.out.println(transaction.getValue()));

        System.out.println("交易员都在哪些不同的城市工作过");
        transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        System.out.println("查找所有来自于上海的交易员，并按姓名排序");
        transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> "SH".equals(trader.getCity()))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(trader -> System.out.println(trader.getName())
                );

        System.out.println("返回所有交易员的姓名字符串，按字母顺序排序");
        System.out.println(transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.joining())
        );

        System.out.println("有没有交易员是在北京工作过的");
        System.out.println(transactions.stream()
                .anyMatch(transaction -> "BJ".equals(transaction.getTrader().getCity()))
        );

        System.out.println("打印上海的交易员的所有交易额");
        transactions.stream()
                .filter(transaction -> "SH".equals(transaction.getTrader().getCity()))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        System.out.println("所有交易中，最高的交易额是多少");
        Optional<Integer> max = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);
        System.out.println(max.get());

        System.out.println("找到交易额最小的交易");
        Optional<Transaction> small = transactions.stream()
                .min(Comparator.comparing(Transaction::getValue));
        System.out.println(small.get().getValue());

        Stream.iterate(new int[]{0, 1},
                t -> new int[]{t[1], t[0]+t[1]})
                .limit(10)
                .forEach(t -> System.out.println("(" + t[0] + "," + t[1] +")"));

    }


}
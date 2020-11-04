package demo;

import com.google.common.collect.Lists;
import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.commons.collections4.MapUtils;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.time.LocalDate.MAX;
import static java.time.LocalDate.now;
import static java.time.ZoneId.systemDefault;

/**
 * @author darcy
 * @since 2020/02/09
 **/
public class Test {

    @Data
    @AllArgsConstructor
    public static class A {
        private Integer a;
        private Integer b;

    }

    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException {
//        ArrayList<Integer> integers = Lists.newArrayList(1, 2, 3, 4, 4, 5);
//        Map<Boolean, List<Integer>> collect = integers.stream().collect(Collectors.partitioningBy(v -> v > 10));
//        collect.get(true).forEach(v -> {
//            System.out.println(v);
//        });
//        System.out.println();

        Map<A, Integer> map = new HashMap<>();
        map.put(new A(1,1),1);
        map.put(new A(2,2),2);
        System.out.println(map.get(new A(1,1)));


//        ArrayList<Integer> strings = Lists.newArrayList(1, 2, 3, 4, 4, 5, 56, 7, 7, 7, 8, 78, 7, 87, 8, 7, 87, 66576);
//        System.out.println(ArrayUtils.contains(strings.toArray(), 87));
//
//        System.out.println(StringUtils.isNotBlank(null));

//        Optional <Integer> any = Arrays.asList(0, 1, 1, 4).stream().filter(integer -> integer == 1).findFirst();
//        System.out.println(any.get());

//        System.out.println(Double.valueOf(Double.parseDouble(null) * 100).intValue());

//        SecretKeySpec keySpec = new SecretKeySpec("ais8Eice8Lamei8ahzoGoh1ahph4eropho0faif0iu9aif5zaaqu4aiji2us6tee".getBytes(), "HmacSHA256");
//        Mac mac = Mac.getInstance("HmacSHA256");
//        mac.init(keySpec);
//        byte[] result = mac.doFinal("20021121".getBytes());
//        System.out.println(Hex.encodeHexString(result));
//    new BigDecimal("5.1").doubleValue();
//        String amount = "5.1";
//        NumberFormat format = NumberFormat.getInstance();
//        try{
//            Number number = format.parse(amount);
//            double temp = number.doubleValue() * 100.0;
//            format.setGroupingUsed(false);
//            // 设置返回数的小数部分所允许的最大位数
//            format.setMaximumFractionDigits(0);
//            amount = format.format(temp);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(amount);
//        String str1="5.1";
//        BigDecimal bd=new BigDecimal(str1);
//        System.out.println(100 * bd.doubleValue());
//        String a = null;
//        String b = null;
//        System.out.println(a == null || b == null);
//
//        Map<Object, String> map = new HashMap<>();
//        Object o1 = new Object();
//        Object o2 = new Object();
//        map.put(o1, "1");
//        map.put(o2, "2");
//        map.get(o2);
//        System.out.println(map);
//
//        OO oo = new OO(VV.KE2);
//        System.out.println(oo.getV().getName());'

//        HashSet<Long> objects = Sets.newHashSet();
//        objects.add(1L);
//        objects.add(2L);
//        objects.add(1L);
//
//        System.out.println(objects);
//        long l = OffsetDateTimeDateTime.now().toInstant().toEpochMilli();
//        System.out.println(System.currentTimeMillis());

//        List<Integer> integers = Lists.newArrayList(1, 2, 1, 2, 3, 4, 5, 6, 7, 7, 8, 8, 1, 2, 4, 11, 22, 23);
//        List<Integer> collect = integers.stream().distinct().collect(Collectors.toList());
//        Collection<Integer> subtract = CollectionUtils.subtract(integers, collect).stream().distinct().collect(Collectors.toList());
//        System.out.println(subtract);
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        System.out.println(OffsetDateTime.now().format(dateTimeFormatter));

//        OffsetDateTime offsetDateTime = OffsetDateTime.now().truncatedTo(ChronoUnit.DAYS);
//        System.out.println(offsetDateTime);
//        System.out.println(offsetDateTime.plusDays(1));
//
//        System.out.println(now().atStartOfDay(systemDefault()).toOffsetDateTime());
//        System.out.println(now().plusDays(1).atStartOfDay(systemDefault()).toOffsetDateTime());
//
//        try {
//            System.out.println(111111);
//            throw new IOException();
//        }catch (Exception x){
//
//        }
//        System.out.println(22222222);
    }

}

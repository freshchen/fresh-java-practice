package demo;

import com.google.common.collect.Sets;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;

/**
 * @author darcy
 * @since 2020/02/09
 **/
public class Test {

    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException {
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

        HashSet<Long> objects = Sets.newHashSet();
        objects.add(1L);
        objects.add(2L);
        objects.add(1L);

        System.out.println(objects);

    }

}

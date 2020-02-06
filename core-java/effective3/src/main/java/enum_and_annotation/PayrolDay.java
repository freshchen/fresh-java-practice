package enum_and_annotation;

/**
 * @program: fresh-java-practice
 * @Date: 2019/8/18 20:59
 * @Author: Ling Chen
 * @Description:
 */
public enum PayrolDay {
    MONDAY(PayType.WEEKDAY),
    TUESDAY(PayType.WEEKDAY),
    WEDNESDAY(PayType.WEEKDAY),
    THURSDAY(PayType.WEEKDAY),
    FRIDAY(PayType.WEEKDAY),
    SATURDAY(PayType.WEEKDEND),
    SUNDAY(PayType.WEEKDEND);

    private final  PayType payType;

    public int pay(int minsWorked, int payRate){
        return payType.pay(minsWorked, payRate);
    }

    PayrolDay(PayType payType) {
        this.payType = payType;
    }

    private enum PayType {
        WEEKDAY {
            @Override
            int overtimePay(int minsWorked, int payRate) {
                return minsWorked <= MINS_PRE_SHIFT ? 0 : (minsWorked = MINS_PRE_SHIFT) * payRate / 2;
            }
        },
        WEEKDEND {
            @Override
            int overtimePay(int minsWorked, int payRate) {
                return minsWorked * payRate / 2;
            }
        };

        private static final int MINS_PRE_SHIFT = 8 * 60;

        abstract int overtimePay(int minsWorked, int payRate);

        int pay(int minsWorked, int payRate) {
            int basePay = minsWorked * payRate;
            return basePay + overtimePay(minsWorked, payRate);
        }
    }


    public static void main(String[] args) {
        System.out.println(PayrolDay.SUNDAY.pay(657,1));
    }
}

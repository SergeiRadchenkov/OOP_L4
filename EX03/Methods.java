package EX03;

import java.util.List;

public class Methods {
    public static Integer getElementFromIntegerCollection(List<Integer> col, int index) {
        return col.get(index);
    }
    public static String getElementFromStringCollection(List<String> col, int index) {
        return col.get(index);
    }
    public static Double getElementFromDoubleCollection(List<Double> col, int index) {
        return col.get(index);
    }
    public static <U> U getElementFromUCollection(List<U> col, int index) {
        return col.get(index);
    }

    public static <T1, T2> T2 put(T1 arg1, T2 arg2) {
        return arg2;
    }
}

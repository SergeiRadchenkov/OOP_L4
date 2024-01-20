package EX03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        var el = Methods.getElementFromIntegerCollection(data, 1);
        System.out.println(el);
        el = Methods.<Integer>getElementFromIntegerCollection(data, 2);
        el = Methods.getElementFromIntegerCollection(data, 2);
        System.out.println(el);
    }
}

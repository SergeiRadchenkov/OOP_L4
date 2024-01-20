package EX02;

import java.util.UUID;

public class Program {
    public static void main(String[] args) {
        Worker w = new Worker(28, "Василий", "Иванов", 29, 50000);

        ParameterizedWorker<Integer> w1 = new ParameterizedWorker<Integer>(1990, "Игнат", "Петросевич", 20, 22);

        String uid = UUID.randomUUID().toString();
        ParameterizedWorker<String> w2 = new ParameterizedWorker<String>(uid, "Естафий", "Гаврилов", 20, 22);
        System.out.println(w2.getId());
    }
}

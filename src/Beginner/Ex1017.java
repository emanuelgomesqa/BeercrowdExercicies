package Beginner;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Ex1017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            list.add(scanner.nextDouble());
        }
        list.stream()
                .reduce((n1, n2) -> n1*n2)
                .ifPresent(n -> System.out.printf("%.3f\n", n/12));
    }
}

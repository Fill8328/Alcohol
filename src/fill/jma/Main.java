package fill.jma;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Congak congak = new Congak();
        congak.pakCongak().forEach(System.out::println);

        congak.pakCongak().stream()
                .sorted(Comparator.comparing(Congak::getSpiritPersentage)
                        .thenComparing(Congak::getPrice)
                        .thenComparing(Congak::getVolume))
                .forEach(System.out::println);

        // сгруппировать по обьему и посчитать среднюю цену для каждого обьема

    }
}

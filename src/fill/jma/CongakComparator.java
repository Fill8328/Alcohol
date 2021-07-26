package fill.jma;

import java.util.Comparator;

public class CongakComparator implements Comparator<Congak> {
    @Override
    public int compare(Congak o1, Congak o2) {
        return o1.getSpiritPersentage()- o2.getSpiritPersentage();
    }
}

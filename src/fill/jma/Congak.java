package fill.jma;

import java.awt.*;
import java.util.*;

public class Congak extends Alkohol{
    public Congak(String title, String country, int volume, int spiritPersentage, int price, int years, String barrel) {
        super(title, country, volume, spiritPersentage, price, years);
        this.barrel = barrel;
    }

    private String barrel;

    public String getBarrel() {
        return barrel;
    }

    public void setBarrel(String barrel) {
        this.barrel = barrel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Congak congak = (Congak) o;
        return Objects.equals(barrel, congak.barrel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), barrel);
    }
    @Override
    public String toString() {
        return "Congak{" +
                "title='" + title + '\'' +
                ", country='" + country + '\'' +
                ", volume=" + volume +
                ", spiritPersentage=" + spiritPersentage +
                ", price=" + price +
                ", years=" + years +
                ", barrel=" + barrel +
                '}';
    }

    public Congak() {
    }

    public Collection<Congak> pakCongak(){
        Collection<Congak> pakCongak = new ArrayList<>();
        Congak Ararat = new Congak("Ararat", "Armenya", 1, 43, 1300, 2008 ,"Oak");
        Congak Macallan = new Congak("Macallan", "France", 1, 48, 2200, 2007 ,"Oak");
        Congak RеmyMartin = new Congak("RеmyMartin", "France", 2, 44, 3500, 2004 ,"Oak");
        Congak GrandCrue = new Congak("GrandCrue ", "Ruhssa", 2, 43, 1000, 2014 ,"Oak");
        Congak VSOP = new Congak("VSOP", "France", 3, 42, 2000, 2004 ,"Oak");
        Congak Camous = new Congak("Camous", "Armenya", 3, 47, 3000, 2010 ,"Oak");
        pakCongak.add(Ararat);
        pakCongak.add(Macallan);
        pakCongak.add(RеmyMartin);
        pakCongak.add(GrandCrue);
        pakCongak.add(VSOP);
        pakCongak.add(Camous);
            return pakCongak;
    }




}

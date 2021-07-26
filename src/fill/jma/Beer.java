package fill.jma;

import java.util.Objects;

public class Beer extends Alkohol{
    private String beerColor;

    public String getBeerColor() {
        return beerColor;
    }

    public void setBeerColor(String beerColor) {
        this.beerColor = beerColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Beer beer = (Beer) o;
        return Objects.equals(beerColor, beer.beerColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), beerColor);
    }

    public Beer(String title, String country, int volume, int spiritPersentage, int price, int years) {
        super(title, country, volume, spiritPersentage, price, years);
    }

    @Override
    public String toString() {
        return "Beer{" +
                "title='" + title + '\'' +
                ", country='" + country + '\'' +
                ", volume=" + volume +
                ", spiritPersentage=" + spiritPersentage +
                ", price=" + price +
                ", years=" + years +
                '}';
    }
}

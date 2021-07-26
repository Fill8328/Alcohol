package fill.jma;

import java.util.Objects;

public class Alkohol {
    public String title;
    public String country;
    public int volume;
    public int spiritPersentage;
    public int price;
    public int years;

    public Alkohol() {
    }

    public Alkohol(String title, String country, int volume, int spiritPersentage, int price, int years) {
        this.title = title;
        this.country = country;
        this.volume = volume;
        this.spiritPersentage = spiritPersentage;
        this.price = price;
        this.years = years;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getSpiritPersentage() {
        return spiritPersentage;
    }

    public void setSpiritPersentage(int spiritPersentage) {
        this.spiritPersentage = spiritPersentage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alkohol alkohol = (Alkohol) o;
        return volume == alkohol.volume && spiritPersentage == alkohol.spiritPersentage && price == alkohol.price && years == alkohol.years && Objects.equals(title, alkohol.title) && Objects.equals(country, alkohol.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, country, volume, spiritPersentage, price, years);
    }

    @Override
    public String toString() {
        return "Alkohol{" +
                "title='" + title + '\'' +
                ", country='" + country + '\'' +
                ", volume=" + volume +
                ", spiritPersentage=" + spiritPersentage +
                ", price=" + price +
                ", years=" + years +
                '}';
    }

}

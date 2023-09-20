package web.model;

public class Car {
    private String manufacturer;
    private String countryOfOrigin;
    private int year;

    public Car(String manufacturer, String countryOfOrigin, int year) {
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public int getYear() {
        return year;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                ", year=" + year +
                '}';
    }
}

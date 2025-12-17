public class Artworks {

    private String title;
    private int year;
    private double price;

    public Artworks(String title, int year, double price) {
        this.title = title;
        this.year = year;
        this.price = price;
    }

    public String getTitle() { return title; }
    public int getYear() { return year; }
    public double getPrice() { return price; }

    public void setTitle(String title) { this.title = title; }
    public void setYear(int year) { this.year = year; }
    public void setPrice(double price) { this.price = price; }

    public void printInfo() {
        System.out.println("Artworks → Title: " + title + ", Year: " + year + ", Price: $" + price);
    }

    public double culturalImpactScore() {
        return (2025 - year) + (price / 100000);
    }

    public int compareImpact(Artworks other) {
        return Double.compare(this.culturalImpactScore(), other.culturalImpactScore());
    }
}

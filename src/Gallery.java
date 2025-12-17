public class Gallery {

    private String name;
    private int visitors;
    private String style;

    public Gallery(String name, int visitors, String style) {
        this.name = name;
        this.visitors = visitors;
        this.style = style;
    }

    public String getName() { return name; }
    public int getVisitors() { return visitors; }
    public String getStyle() { return style; }

    public void setName(String name) { this.name = name; }
    public void setVisitors(int visitors) { this.visitors = visitors; }
    public void setStyle(String style) { this.style = style; }

    public void printInfo() {
        System.out.println("Gallery → Name: " + name + ", Visitors: " + visitors + ", Style: " + style);
    }

    public int compareVisitors(Gallery other) {
        return Integer.compare(this.visitors, other.visitors);
    }

    public boolean isSameStyle(Gallery other) {
        return this.style.equalsIgnoreCase(other.style);
    }
}

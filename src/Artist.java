public class Artist {

    private String name;
    private int age;
    private boolean famous;

    public Artist(String name, int age, boolean famous) {
        this.name = name;
        this.age = age;
        this.famous = famous;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public boolean isFamous() { return famous; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setFamous(boolean famous) { this.famous = famous; }

    public void printInfo() {
        System.out.println("Artist → Name: " + name + ", Age: " + age + ", Famous: " + famous);
    }

    public int activityScore() {
        return famous ? age * 2 : age;
    }

    public int compareActivity(Artist other) {
        return Integer.compare(this.activityScore(), other.activityScore());
    }
}

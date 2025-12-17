public class Main {

    public static void main(String[] args) {

        Artworks art1 = new Artworks("Allegory of the Planets and Continents", 1752, 3000000);
        Artworks art2 = new Artworks("Allegory of Government: Wisdom Defeating Discord", 1730, 2500000);

        Artist artist1 = new Artist("Giovanni Battista Tiepolo", 56, true);
        Artist artist2 = new Artist("Jacob de Wit", 59, true);

        Gallery g1 = new Gallery("Modern Art Hall", 1200, "Modern");
        Gallery g2 = new Gallery("Eastern Gallery", 900, "Eastern");

        System.out.println("=== ARTWORKS ===");
        art1.printInfo();
        art2.printInfo();

        System.out.println("\n=== ARTISTS ===");
        artist1.printInfo();
        artist2.printInfo();

        System.out.println("\n=== GALLERIES ===");
        g1.printInfo();
        g2.printInfo();

        System.out.println("\n=== CULTURAL IMPACT (ARTWORKS) ===");
        if (art1.compareImpact(art2) > 0) {
            System.out.println(art1.getTitle() + " has higher cultural impact.");
        } else if (art1.compareImpact(art2) < 0) {
            System.out.println(art2.getTitle() + " has higher cultural impact.");
        } else {
            System.out.println("Both artworks have equal cultural impact.");
        }

        System.out.println("\n=== ARTIST ACTIVITY ===");
        if (artist1.compareActivity(artist2) > 0) {
            System.out.println(artist1.getName() + " is more active.");
        } else if (artist1.compareActivity(artist2) < 0) {
            System.out.println(artist2.getName() + " is more active.");
        } else {
            System.out.println("Both artists have equal activity.");
        }

        System.out.println("\n=== GALLERY POPULARITY & STYLE ===");
        if (g1.compareVisitors(g2) > 0) {
            System.out.println(g1.getName() + " is more popular.");
        } else if (g1.compareVisitors(g2) < 0) {
            System.out.println(g2.getName() + " is more popular.");
        } else {
            System.out.println("Both galleries have equal popularity.");
        }

        System.out.println("Do both galleries have the same style? " + g1.isSameStyle(g2));
    }
}

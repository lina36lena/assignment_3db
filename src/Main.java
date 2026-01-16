public class Main {
    public static void main(String[] args) throws Exception {

        ArtworkDAO dao = new ArtworkDAO();


        dao.insertArtwork("Allegory of the Planets", 1455, 3000000);
        dao.insertArtwork("Allegory of Government", 1730, 2500000);

        // вывод всех записей
        dao.readArtworks();

        // обнова
        dao.updateArtworkPrice(1, 3500000);

        // после обновы
        dao.readArtworks();

        //удаление
        dao.deleteArtwork(2);

        //после удаления
        dao.readArtworks();
    }
}

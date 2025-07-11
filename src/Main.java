import Contenido.MyFavorite;
import Contenido.Podcast;
import Contenido.Songs;

public class Main {
    public static void main(String[] args) {

       Songs mysongs = new Songs();
       mysongs.setTitle("Eye of the tiger");
       mysongs.setAuthor("Survivor");

      // mysongs.setAlbum("RockyIV");
      // mysongs.setGenre("Rock");

        Podcast mypodcast = new Podcast();
        mypodcast.setTitle("All the languages");
        mypodcast.setName("Richard G.Anderson");
        mypodcast.setDescription("A multilingual podcast when you can learn: german, english, spaanish!");

        for (int i = 0; i < 100; i++) {
            mysongs.myFavorites();
        }
        for (int i = 0; i <= 5000; i++) {
            mysongs.reproduce();
        }
        for (int i = 0; i < 100; i++) {
            mypodcast.myFavorites();
        }
        for (int i = 0; i <= 5000; i++) {
            mypodcast.reproduce();
        }
        System.out.println("Total de reproducciones: " + mysongs.getTotalRepo());
        System.out.println("Total de me gustas: " + mysongs.getTotalOfFavorites());

        MyFavorite favorite = new MyFavorite();
        favorite.add(mypodcast);
        favorite.add(mysongs);


    }
}
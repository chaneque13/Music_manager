package Contenido;

public class MyFavorite {
     public   void add (Audio audio){
        if (audio.getClassi() > 8){
            System.out.println(audio.getTitle() + " es uno de los favoritos del momento");
        }else {
            System.out.println(audio.getTitle() + " tambien es uno de los favoritos");
        }

    }
}

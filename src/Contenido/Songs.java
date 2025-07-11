package Contenido;

public class Songs extends Audio {
    private String album;
    private String genre;
    private String author;


    @Override
    public int getClassi() {
        if(getTotalOfFavorites() > 5000){
            return 8;
        }else{
            return 4;
        }
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

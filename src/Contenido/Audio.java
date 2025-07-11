package Contenido;

public class Audio {
    private String title;
    private int totalRepo;
    private int totalOfFavorites;
    private int classi;

    public void myFavorites(){
        this.totalOfFavorites++;
    }
    public void reproduce(){
        this.totalRepo++;
    }
//Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalRepo() {
        return totalRepo;
    }

    public void setTotalRepo(int totalRepo) {
        this.totalRepo = totalRepo;
    }

    public int getTotalOfFavorites() {
        return totalOfFavorites;
    }

    public void setTotalOfFavorites(int totalOfFavorites) {
        this.totalOfFavorites = totalOfFavorites;
    }

    public int getClassi() {
        return classi;
    }

    public void setClassi(int classi) {
        this.classi = classi;
    }
}

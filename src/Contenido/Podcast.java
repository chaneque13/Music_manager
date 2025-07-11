package Contenido;

public class Podcast extends Audio {
    private String name;
    private String description;


    @Override
    public int getClassi() {
        if (getTotalRepo() > 2000){
            return 9;
        }else {
            return 2;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

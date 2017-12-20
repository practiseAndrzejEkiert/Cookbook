package pl.andrzejekiert.models;

public class CookbookModel {

    private int id;
    private int time;
    private String title;
    private String description;

    public CookbookModel(int id, int time, String description, String title) {
        this.id = id;
        this.time = time;
        this.title = title;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "CookbookModel{" +
                "id=" + id +
                ", time=" + time +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}


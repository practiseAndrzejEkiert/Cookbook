package pl.andrzejekiert.models;

public class IdModels {
    private int id;
    private int ingriedientsId;
    private int cookbookId;

    public IdModels(int id, int ingriedientsId, int cookbookId) {
        this.id = id;
        this.ingriedientsId = ingriedientsId;
        this.cookbookId = cookbookId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIngriedientsId() {
        return ingriedientsId;
    }

    public void setIngriedientsId(int ingriedientsId) {
        this.ingriedientsId = ingriedientsId;
    }

    public int getCookbookId() {
        return cookbookId;
    }

    public void setCookbookId(int cookbookId) {
        this.cookbookId = cookbookId;
    }

    @Override
    public String toString() {
        return "IdModels{" +
                "id=" + id +
                ", ingriedientsId=" + ingriedientsId +
                ", cookbookId=" + cookbookId +
                '}';
    }
}

package pl.andrzejekiert.models;

public class ProductsModel {
   private int id;
   private int recipeId;

    private String product;

    public ProductsModel(int id, int recipeId, String product) {
        this.id = id;
        this.recipeId = 0;
        this.product = product;
    }

    @Override
    public String toString() {
        return "ProductsModel{" +
                "id=" + id +
                ", recipeId=" + recipeId +
                ", product='" + product + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}

package hust.soict.hedspi.aims.media;

public abstract class Media {
    protected String title;
    protected String category;
    protected float cost;

    public Media() {
    }

    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Media{" +
                "title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", cost=" + cost +
                '}';
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}

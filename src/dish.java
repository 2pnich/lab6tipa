//БАЗОВЫЙ КЛАСС

public abstract class dish {
    private String type;
    private float weight;
    private float price;
    private float volume;


    public void setVolume(float volume) {
        this.volume = volume;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getVolume() {
        return volume;
    }

    public String getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    public float getWeight() {
        return weight;
    }

}

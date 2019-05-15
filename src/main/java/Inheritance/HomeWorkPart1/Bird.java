package SoftServe.InheritanceHomeWork;

public abstract class Bird {
    private String layEggs ;
    private String feathers;

    public abstract void fly();

    public Bird(String feathers, String layEggs ) {
        this.layEggs  = layEggs;
        this.feathers = feathers;
    }

    public String getLayEggs () {
        return layEggs ;
    }

    public String getFeathers() {
        return feathers;
    }

    public void setLayEggs(String attributes) {
        this.layEggs  = attributes;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }
}

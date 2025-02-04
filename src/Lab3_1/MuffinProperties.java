package Lab3_1;

public class MuffinProperties {
    double radius;
    int baketime;
    int bakeheat;

    public MuffinProperties(double radius, int baketime, int bakeheat) {
        this.radius = radius;
        this.baketime = baketime;
        this.bakeheat = bakeheat;
}

    @Override
    public String toString() {
        return "MuffinProperties{" +
                "radius=" + radius +
                ", baketime=" + baketime +
                ", bakeheat=" + bakeheat +
                '}';
    }
}

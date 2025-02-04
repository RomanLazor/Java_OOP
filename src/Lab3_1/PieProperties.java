package Lab3_1;

public class PieProperties {
    double radius;
    int baketime;
    int bakeheat;

    @Override
    public String toString() {
        return "PieProperties{" +
                "radius=" + radius +
                ", baketime=" + baketime +
                ", bakeheat=" + bakeheat +
                '}';
    }

    public PieProperties(double radius, int baketime, int bakeheat) {
        this.radius = radius;
        this.baketime = baketime;
        this.bakeheat = bakeheat;
    }
}


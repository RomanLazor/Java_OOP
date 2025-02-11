package Lab3_2;

public class MuffinProperties {
    double radius;
    int baketime;
    int bakeheat;

    public MuffinProperties(double radius, int baketime, int bakeheat) {
        this.radius = radius;
        this.baketime = baketime;
        this.bakeheat = bakeheat;
}



    void perimeter(){
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of the muffin: " + perimeter);
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

package Lab3_2;

public class CookieProperties{
        double radius;
        int baketime;
        int bakeheat;

        public CookieProperties(double radius, int baketime, int bakeheat) {
            this.radius = radius;
            this.baketime = baketime;
            this.bakeheat = bakeheat;
        }

    double ThermalLoad(){
        double l;
        l = bakeheat * baketime;
        return l;
    }




    @Override
    public String toString() {
        return "CookieProperties{" +
                "radius=" + radius +
                ", baketime=" + baketime +
                ", bakeheat=" + bakeheat +
                '}';
    }
}

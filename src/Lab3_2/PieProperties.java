package Lab3_2;

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

    void compareCookie(CookieProperties cookie){
        if(this.radius == cookie.radius && this.baketime == cookie.baketime && this.bakeheat == cookie.bakeheat) {
            System.out.println("The properties of cookie and pie are the same.");
        }else {
            System.out.println("The properties of cookie and pie are not the same.");
        }
    }



}


package enum_and_annotation;

/**
 * @program: fresh-java-practice
 * @Date: 2019/8/18 20:24
 * @Author: Ling Chen
 * @Description:
 */
public enum Planet {
    MERCURY(3.302e+23, 2.439e6),
    EARTH(5.975e+24,6.378e6);

    private final double mass;
    private final double radius;
    private final double surfaceGravity;
    private static final double G = 6.67300E-11;

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public double getSurfaceGravity() {
        return surfaceGravity;
    }

    public double getSurfaceWeight(){
        return mass * surfaceGravity;
    }

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
        this.surfaceGravity = G * mass / Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        System.out.println(Planet.EARTH.getSurfaceWeight());
    }
}

package lab10;
//Name:witawat
//ID:6887054
//Section:2
public class Sphere extends Object3D {
    double radius;

    public Sphere(String name, Material matType, double radius) {
        super(name, matType);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getVolume() {
        return (4.0 / 3.0) * PI * (radius * radius * radius);
    }

    public double getSurface() {
        return 4.0 * PI * (radius * radius);
    }

}


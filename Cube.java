//Name:witawat
//ID:6887054
//Section:2
public class Cube extends Object3D {
    private double edge;

    public Cube(String name, Material mat, double edge) {
        super(name, mat);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    @Override
    public double getVolume() {
        return edge * edge * edge;
    }

    @Override
    public double getSurface() {
        return 6 * edge * edge;
    }
}

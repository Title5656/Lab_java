package lab10;

public class WaxDie extends Cube implements Comparable<Object3D>, Meltable {
	public WaxDie(String name, double edge) {
		super(name, Material.Wax, edge);
	}

	@Override
	public int compareTo(Object3D otherObject3d) {
		// เปรียบเทียบ volume ก่อน (จากน้อยไปมาก)
		int volumeComparison = Double.compare(this.getVolume(), otherObject3d.getVolume());
		if (volumeComparison != 0) {
			return volumeComparison;
            
		}else{
            return this.getName().compareTo(otherObject3d.getName());
        }
		
	}

	@Override
	public Object3D convertToOtherShape() {
		
		double volume = this.getVolume();
		
		double radius = Math.cbrt((3 * volume) / (4 * Object3D.PI));
		return new Sphere(this.getName(), this.getMaterial(), radius);
	}
}


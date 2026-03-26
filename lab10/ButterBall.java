package lab10;

public class ButterBall extends Sphere implements Comparable<Object3D>, Meltable {
    public ButterBall(String name, double radius){
        super(name, Material.Butter, radius);
    }

        public int compareTo(Object3D otherObject3d) {
            int volumeComparison = Double.compare(this.getSurface(), otherObject3d.getSurface());
            if (volumeComparison != 0) {
                return volumeComparison;
            }else{

                return this.getName().compareTo(otherObject3d.getName());
            }
        }
		
        public Object3D convertToOtherShape() {
            
            double surfaceArea = this.getSurface();
            double edge = Math.sqrt(surfaceArea / 6);
            return new Cube(this.getName(), this.getMaterial(), edge);
        }
		    
    }
    

    
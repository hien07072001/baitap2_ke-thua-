import java.util.Arrays;

public class Point3D extends  Point2D {
    private float z = 0.0f;

    public Point3D() {

    }

    public Point3D(float z, float x, float y) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.getXY();
        this.z = z;

    }
//    float[]array=new float[3];
//    public void  setXYZ(){
//        array[0]=getX();
//        array[1]=getY();
//        array[2]=z;
//    }
//    public float[] getXYZ(){
//        return array;
//    }
//
//    @Override
//    public String toString() {
//        return "Point3D{" +
//                "z=" + z +
//                ", array=" + Arrays.toString(array) +
//                '}';
//    }
    public float[] getXYZ() {

        return new float[]{getX(), getY(), z};

    }

    @Override
    public String toString() {
        return Arrays.toString(getXYZ());
    }
}

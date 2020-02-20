import java.lang.reflect.Array;
import java.util.Arrays;

public class Point2D {
    private float x=0.0f;
    private float y=0.0f;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public Point2D(){

    }
    public Point2D(float x,float y){
        this.x=x;
        this.y=y;

    }
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;

    }
//Phương thức java.util.Arrays.toString (int [])
// trả về một chuỗi đại diện cho nội dung của mảng int được chỉ định.
    public float [] getXY() {

        return new float[]{x, y};

    }
//    float[]array=new float[2];
//    public void setXY(float x,float y){
//        array[0]=x;
//        array[1]=y;
//    }
//
//    public float[] getXY() {
//        return array;
//    }
//
//    @Override
//    public String toString() {
//        return "Point2D{" +
//                "x=" + x +
//                ", y=" + y +
//                ", array=" + Arrays.toString(array) +
//                '}';
//    }
    @Override
    public String toString() {
        return Arrays.toString(getXY());
    }
}

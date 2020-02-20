public class test {
    public static void main(String[] args) {
        Point2D point2D=new Point2D();
        System.out.println(point2D);
        point2D=new Point2D(2,3);
        System.out.println(point2D);
        System.out.println( "mang:"+ point2D.toString());


        Point3D point3D=new Point3D();
        System.out.println(point3D);
        point3D=new Point3D(3,4,5);
        System.out.println(point3D);
        System.out.println("mang3D:"+point3D.toString());
    }
}

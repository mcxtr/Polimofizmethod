public class Circle {
    private final double PI=3.14;
    public static void area(double PI){
        double radius = PI;
        double area = Math.PI*(radius*radius);
        System.out.println("area:"+area);
    }
    public static void circumference(double PI){
        double radius = PI;
        double circumference = Math.PI*2*radius;
        System.out.println("circumference:"+circumference);
    }
}
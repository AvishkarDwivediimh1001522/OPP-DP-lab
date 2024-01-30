import java.util.*;
class shape_area{
    void area(double a){
        double A= a*a;
        System.out.println("\narea of square is : "+A);
    }
    void area(float r){
        float A= 3.14f*r*r;
        System.out.println("area of circle is : "+A);
    }
    void area(float p,float q){
        float A= p*q;
        System.out.println("area of rectangle is : "+A);
    }
}
class shape_perimeter{
    void perimeter(double a){
        double A= 4*a;
        System.out.println("\n\nperimeter of square is : "+A);
    }
    void perimeter(float r){
        float A= 3.14f*2*r;
        System.out.println("perimeter of circle is : "+A);
    }
    void perimeter(float p,float q){
        float A= (p+q)*2;
        System.out.println("perimeter of rectangle is : "+A);
    }
}
public class shape_dim {
    public static void main(String[] args) {
        //create object
        shape_area ob = new shape_area();
        ob.area(12.45);
        ob.area(10.32f);
        ob.area(12.45f,16.22f);

        shape_perimeter obj = new shape_perimeter();
        obj.perimeter(11.35);
        obj.perimeter(10.75f);
        obj.perimeter(11.35f,52.11f);

    }
}

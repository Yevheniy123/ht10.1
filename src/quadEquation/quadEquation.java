package quadEquation;

public class quadEquation {

    public void quad(double a, double b, double c)
    {
        double D=0;
        D = (b * b) - 4*a*c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: x1= " + x1 + ", x2= " + x2);
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x= " + x);
        }
        else {
            System.out.println("Уравнение не имеет действительных корней!");
        }
    }
}

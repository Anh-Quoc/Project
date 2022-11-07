
public class Math {

    public double getMin(double value_1, double value_2){
        if(value_1 < value_2){
            return value_1;
        } else {
            return value_2;
        }
    }

    public double getMax(double value_1, double value_2){
        if(value_1 > value_2){
            return value_1;
        } else{
            return value_2;
        }
    }

    public double getAvg(double... listValue){
        double sum = 0;

        for(double value : listValue){
            sum += value;
        }
        return sum / listValue.length;
    }

    public double getPerimeter(double Radius){
        return 2 * Radius * java.lang.Math.PI;
    }

    public double getPerimeter(double a, double b){
        return 2 * a + 2 * b;
    }

    public double getPerimeter(double a, double b, double c){
        return a + b + c;
    }

    public double getArea(double Radius){
        return java.lang.Math.pow(Radius, 2) * java.lang.Math.PI;
    }

    public double getArea(double a, double b){
        return a * b;
    }



}

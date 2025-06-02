import java.io.Console;
import java.util.Random;
import java.util.Scanner;
import com.math.Math;

public class PrimeiroPrograma {

    public static void main(String[] args){
        var login = "Oi";
        double num1 = -1;
        System.out.println(Math.isNegative(num1));
        int times = 8;
        System.out.println("Digite um número");
        Scanner scanner = new Scanner(System.in);
        double input = scanner.nextDouble();
        infinitesum(input, times , (getAndPrint(generate(0,1000))));

    }

    static void minhaInstrucao (){
        System.out.println("Vindo de minha instrução");
    }

    static void sum(double num1,double num2){
        double result = num1 + num2;
        if (result >= 0) {
            System.out.println(result);
        }
        else{
            System.out.println("A soma é negativa:" + result);
        }
    }

    static void multiply(double num1, double num2){
        if ((num1 * num2) > 0) {
            System.out.println(num1 * num2);
        }
        else {
            System.out.println("A multiplicação é negativa:" + (num1 * num2));
        }
    }

    static void subtract(double num1 , double num2){
        double result = num1 - num2;
        if (result >= 0){
            System.out.println(result);
        }
        else {
            System.out.println("A subtração é negativa:" + result);
        }
    }

    static void divide(double num1, double num2){
        double result = num1 - num2;
        if (result >= 0){
            System.out.println(result);
        }
        else {
            System.out.println("A subtração é negativa:" + result);
        }
    }

    static void infinitesum(double num1, int times , double incrementer ){

        int i = 0;
        if(times < 0){
            System.out.println("Can´t be negative");
        }
        else {
            while (i < times) {
                num1 += incrementer;
                i++;
            }

            System.out.println(num1);

        }
    }

    static void infinitesum(double num1, int times , double incrementer, double limiter ){

        int i = 0;
        if(times < 0){
            System.out.println("Can´t be negative");
        }
        else {
            while (i < times) {
                num1 += incrementer;
                if ( num1 >= limiter ){
                    break;
                }
                i++;
            }

            System.out.println(num1);

        }
    }

    static double getAndPrint(double wiw){
        System.out.println(wiw);
        return wiw;
    }

    static double generate(double init, double limit){
        Random generate = new Random();
        double number = generate.nextDouble(init,limit);
        return number;
    }

}

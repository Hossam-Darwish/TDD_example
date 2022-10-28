package calculator;

public class Calculator {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int n1, int n2) {
        return n1 - n2 ;
    }

    public int multiply(int n1, int n2) {
        return  n1 * n2 ;
    }

    public double divide(double n1, double n2) throws Exception {
      if(n2 == 0 ){
          throw  new Exception("Division by zero !!");
      }

      return n1/n2;
    }

    public double getSquareRoot(double root) {
        return Math.sqrt(25);
    }
}

package section2;

public class PrintNumbers {
    private int length = 5;
    public void calculate() {
        final int width = 20;
        class Calculator {
            public void multiply() {
                System.out.print(length * width);
            }
        }
        var calculator = new Calculator();
        calculator.multiply();
    }
    public static void main(String[] args) {
         var printer = new PrintNumbers();
         printer.calculate();
    }

    //for snippet 74

//    public void processData() {
//        final int length = 5;
//        int width = 10;
//        int height = 2;
//        class VolumeCalculator {
//            public int multiply() {
//                return length * width * height; // DOES NOT COMPILE
//            }
//        }
//        width = 2;
//    }
 }

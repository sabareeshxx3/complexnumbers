class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void add(ComplexNumber num) {
        this.real += num.real;
        this.imaginary += num.imaginary;
    }

    public void display() {
        System.out.println("Complex number: " + real + " + " + imaginary + "i");
    }
}

public class ComplexNumberTest {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(3.5, 5.5);
        ComplexNumber num2 = new ComplexNumber(4.5, 1.5);

        // Display the initial complex numbers
        System.out.println("Before addition:");
        num1.display();
        num2.display();

        // Adding two complex numbers
        num1.add(num2);

        // Display the result after addition
        System.out.println("\nAfter addition:");
        num1.display();
    }
}

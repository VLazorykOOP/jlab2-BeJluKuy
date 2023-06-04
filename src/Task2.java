public class Task2 {
    private double real;
    private double imaginary;

    public Task2(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public double modulus() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    public double argument() {
        return Math.atan2(imaginary, real);
    }

    public Task2 add(Task2 other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new Task2(newReal, newImaginary);
    }

    public Task2 subtract(Task2 other) {
        double newReal = this.real - other.real;
        double newImaginary = this.imaginary - other.imaginary;
        return new Task2(newReal, newImaginary);
    }

    public Task2 multiply(Task2 other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new Task2(newReal, newImaginary);
    }

    public Task2 divide(Task2 other) {
        double divisor = other.real * other.real + other.imaginary * other.imaginary;
        double newReal = (this.real * other.real + this.imaginary * other.imaginary) / divisor;
        double newImaginary = (this.imaginary * other.real - this.real * other.imaginary) / divisor;
        return new Task2(newReal, newImaginary);
    }

    public Task2 conjugate() {
        return new Task2(real, -imaginary);
    }

    public static void main(String[] args) {
        Task2 number1 = new Task2(3, 4);
        Task2 number2 = new Task2(2, -1);

        // Приклад використання методів
        double modulus = number1.modulus();
        double argument = number1.argument();
        Task2 sum = number1.add(number2);
        Task2 difference = number1.subtract(number2);
        Task2 product = number1.multiply(number2);
        Task2 quotient = number1.divide(number2);
        Task2 conjugate = number1.conjugate();

        // Виведення результатів
        System.out.println("Modulus: " + modulus);
        System.out.println("Argument: " + argument);
        System.out.println("Sum: " + sum.getReal() + " + " + sum.getImaginary() + "i");
        System.out.println("Difference: " + difference.getReal() + " + " + difference.getImaginary() + "i");
        System.out.println("Product: " + product.getReal() + " + " + product.getImaginary() + "i");
        System.out.println("Quotient: " + quotient.getReal() + " + " + quotient.getImaginary() + "i");
        System.out.println("Conjugate: " + conjugate.getReal() + " + " + conjugate.getImaginary() + "i");
    }
}

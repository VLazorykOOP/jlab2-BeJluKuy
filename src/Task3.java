public class Task3 {
    private int numerator;
    private int denominator;

    public Task3(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Task3 add(Task3 other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Task3(newNumerator, newDenominator).reduce();
    }

    public Task3 subtract(Task3 other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Task3(newNumerator, newDenominator).reduce();
    }

    public Task3 multiply(Task3 other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Task3(newNumerator, newDenominator).reduce();
    }

    public Task3 divide(Task3 other) {
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Task3(newNumerator, newDenominator).reduce();
    }

    public Task3 reduce() {
        int gcd = gcd(this.numerator, this.denominator);
        int newNumerator = this.numerator / gcd;
        int newDenominator = this.denominator / gcd;
        return new Task3(newNumerator, newDenominator);
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        int numerator1 = 2;
        int denominator1 = 3;
        int numerator2 = 1;
        int denominator2 = 4;

        Task3 d1 = new Task3(numerator1, denominator1);
        Task3 d2 = new Task3(numerator2, denominator2);

        // Приклад використання методів
        Task3 sum = d1.add(d2);
        Task3 difference = d1.subtract(d2);
        Task3 product = d1.multiply(d2);
        Task3 quotient = d1.divide(d2);

        // Виведення результатів
        System.out.println("Sum: " + sum.getNumerator() + "/" + sum.getDenominator());
        System.out.println("Difference: " + difference.getNumerator() + "/" + difference.getDenominator());
        System.out.println("Product: " + product.getNumerator() + "/" + product.getDenominator());
        System.out.println("Quotient: " + quotient.getNumerator() + "/" + quotient.getDenominator());
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
}

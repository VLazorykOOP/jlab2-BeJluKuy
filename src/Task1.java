public class Task1 {
    private double x;
    private double y;
    private double z;

    public Task1(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Task1 add(Task1 other) {
        double newX = this.x + other.x;
        double newY = this.y + other.y;
        double newZ = this.z + other.z;
        return new Task1(newX, newY, newZ);
    }

    public Task1 subtract(Task1 other) {
        double newX = this.x - other.x;
        double newY = this.y - other.y;
        double newZ = this.z - other.z;
        return new Task1(newX, newY, newZ);
    }

    public double dotProduct(Task1 other) {
        double product = this.x * other.x + this.y * other.y + this.z * other.z;
        return product;
    }

    public Task1 multiplyByScalar(double scalar) {
        double newX = this.x * scalar;
        double newY = this.y * scalar;
        double newZ = this.z * scalar;
        return new Task1(newX, newY, newZ);
    }

    public boolean equals(Task1 other) {
        return this.x == other.x && this.y == other.y && this.z == other.z;
    }

    public double length() {
        double squaredSum = Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2);
        double length = Math.sqrt(squaredSum);
        return length;
    }

    public int compareLength(Task1 other) {
        double thisLength = this.length();
        double otherLength = other.length();
        return Double.compare(thisLength, otherLength);
    }

    public static void main(String[] args) {
        Task1 vector1 = new Task1(1, 2, 3);
        Task1 vector2 = new Task1(4, 5, 6);

        // Приклад використання методів
        Task1 sum = vector1.add(vector2);
        Task1 difference = vector1.subtract(vector2);
        double dotProduct = vector1.dotProduct(vector2);
        Task1 scaledVector = vector1.multiplyByScalar(2);
        boolean isEqual = vector1.equals(vector2);
        double length = vector1.length();
        int lengthComparison = vector1.compareLength(vector2);

        // Виведення результатів
        System.out.println("Sum: " + sum.x + ", " + sum.y + ", " + sum.z);
        System.out.println("Difference: " + difference.x + ", " + difference.y + ", " + difference.z);
        System.out.println("Dot Product: " + dotProduct);
        System.out.println("Scaled Vector: " + scaledVector.x + ", " + scaledVector.y + ", " + scaledVector.z);
        System.out.println("Vectors are equal: " + isEqual);
        System.out.println("Length: " + length);
        System.out.println("Length Comparison: " + lengthComparison);
    }
}

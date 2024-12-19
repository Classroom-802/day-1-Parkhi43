import java.util.*;
public class Day1 {
    //Sum of n natural numbers
    public static int sumOfNumbers(int n){
        int result=(n*(n+1))/2;
        return result;
    }


    //Check whether the number is prime
    public static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }

        for (int i = 2; i<=Math.sqrt(n);i++) {
            if (n % i == 0 ) {
                return false;
            }
        }


        return true;
    }

    //Print n odd numbers
    public static void oddNumbers(int n){
        for(int i=1;i<=n;i+=2){
            System.out.print(i + " ");
        }
    }

    //Sum Of Odd number upto n
    public static  void sumOfOdd(int n){
        int sum=0;
        for(int i=1;i<=n;i+=2){
            sum+=i;
        }
        System.out.println(sum);
    }


    //Print multiplication table of a number
    public static void printTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
    }


    //Print number of digits of a number
    public static void countDigits(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }


    //Reverse a number
    public static void reverse(int n){
        while(n>0){
            System.out.print(n%10);
            n=n/10;
        }
    }

    //Find largest digit in a number
    public static void findLargest(int n){
        int cnt=0;
        while(n>0){
            if(n%10>cnt){
                cnt=n%10;
            }
            n=n/10;
        }
        System.out.println(cnt);
    }

    // Method to check if a number is a palindrome
    public static String isPalindrome(int n) {
        String str = Integer.toString(n);
        String reversedStr = new StringBuilder(str).reverse().toString();
        if (str.equals(reversedStr)) {
            return "Palindrome";
        } else {
            return "Not Palindrome";
        }
    }

    // Method to calculate the sum of digits of a number
    public static int sumOfDigits(int n) {
        String str = Integer.toString(n);
        int sum = 0;
        for (char digit : str.toCharArray()) {
            sum += Character.getNumericValue(digit);
        }
        return sum;
    }

}


 class ShapeAreaCalculator {

    // Method to calculate area of a circle
    public static double calculateArea(double radius) {
        return 3.14159 * radius * radius;
    }

    // Method to calculate area of a rectangle
    public static double calculateArea(int  length, int breadth) {
        return length * breadth;
    }

    // Method to calculate area of a triangle
    public static double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

}


class SalaryCalculator {

    // Method to calculate Intern salary
    public static int calculateSalary(int stipend) {
        return stipend;
    }

    // Method to calculate Regular Employee salary
    public static int calculateSalary(int baseSalary, int bonuses) {
        return baseSalary + bonuses;
    }

    // Method to calculate Manager salary
    public static int calculateSalary(int baseSalary, int bonuses, int incentives) {
        return baseSalary + bonuses + incentives;
    }

}

class Employee {

    // Private attributes
    private int employeeID;
    private String employeeName;
    private double employeeSalary;

    // Public setter methods
    public void setEmployeeID(int id) {
        this.employeeID = id;
    }

    public void setEmployeeName(String name) {
        this.employeeName = name;
    }

    public void setEmployeeSalary(double salary) {
        this.employeeSalary = salary;
    }

    // Public getter methods
    public int getEmployeeID() {
        return this.employeeID;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public double getEmployeeSalary() {
        return this.employeeSalary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + employeeSalary);
    }


}

// Base class Student
class Student {
    private int rollNumber;
    private String name;

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return this.rollNumber;
    }

    public String getName() {
        return this.name;
    }
}

// Derived class Result
class Result extends Student {
    private int[] marks;

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public int[] getMarks() {
        return this.marks;
    }

    public int calculateTotal() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public double calculatePercentage() {
        int total = calculateTotal();
        return (double) total / (marks.length * 100) * 100;
    }

    public void displayDetails() {
        System.out.println("Roll Number: " + getRollNumber());
        System.out.println("Name: " + getName());
        System.out.print("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
        System.out.println("Total: " + calculateTotal());
        System.out.println("Percentage: " + calculatePercentage() + "%");
    }


}

//Matrix Multiplication
class Matrix {
    int rows, cols;
    int[][] data;

    Matrix(int r, int c) {
        rows = r;
        cols = c;
        data = new int[rows][cols];
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                data[i][j] = sc.nextInt();
    }

    void display() {
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print(data[i][j] + " ");
            System.out.println();
        }
    }

    Matrix add(Matrix b) {
        if (rows != b.rows || cols != b.cols) {
            System.out.println("Invalid dimensions for addition.");
            return null;
        }
        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result.data[i][j] = data[i][j] + b.data[i][j];
        return result;
    }

    Matrix multiply(Matrix b) {
        if (cols != b.rows) {
            System.out.println("Invalid dimensions for multiplication.");
            return null;
        }
        Matrix result = new Matrix(rows, b.cols);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < b.cols; j++) {
                result.data[i][j] = 0;
                for (int k = 0; k < cols; k++)
                    result.data[i][j] += data[i][k] * b.data[k][j];
            }
        return result;
    }
}




class ShapeAreaCalculator1 {

    // Method to calculate area of a Circle
    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate area of a Rectangle
    double calculateArea(int length, int breadth) {
        return length * breadth;
    }

    // Method to calculate area of a Triangle
    double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }
}

 class GeometricShapesArea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShapeAreaCalculator calculator = new ShapeAreaCalculator();

        System.out.println("Choose a shape to calculate area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter radius: ");
                double radius = sc.nextDouble();
                if (radius > 0) {
                    double circleArea = calculator.calculateArea(radius);
                    System.out.println("Shape: Circle");
                    System.out.println("Radius: " + radius);
                    System.out.println("Area: " + circleArea);
                } else {
                    System.out.println("Invalid input. Radius must be positive.");
                }
                break;

            case 2:
                System.out.println("Enter length and breadth: ");
                double length = sc.nextDouble();
                double breadth = sc.nextDouble();
                if (length > 0 && breadth > 0) {
                    double rectangleArea = calculator.calculateArea(length, breadth);
                    System.out.println("Shape: Rectangle");
                    System.out.println("Length: " + length);
                    System.out.println("Breadth: " + breadth);
                    System.out.println("Area: " + rectangleArea);
                } else {
                    System.out.println("Invalid input. Length and breadth must be positive.");
                }
                break;

            case 3:
                System.out.println("Enter base and height: ");
                double base = sc.nextDouble();
                double height = sc.nextDouble();
                if (base > 0 && height > 0) {
                    double triangleArea = calculator.calculateArea(base, height);
                    System.out.println("Shape: Triangle");
                    System.out.println("Base: " + base);
                    System.out.println("Height: " + height);
                    System.out.println("Area: " + triangleArea);
                } else {
                    System.out.println("Invalid input. Base and height must be positive.");
                }
                break;

            default:
                System.out.println("Invalid choice. Please choose between 1 to 3.");
                break;
        }

        sc.close();
    }
}


class Complex {
    private double real;
    private double imaginary;

    // Constructor
    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Overloaded method for addition
    Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    // Overloaded method for multiplication
    Complex multiply(Complex other) {
        double realPart = (this.real * other.real) - (this.imaginary * other.imaginary);
        double imaginaryPart = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new Complex(realPart, imaginaryPart);
    }

    // Overloaded method to find magnitude
    double magnitude() {
        return Math.sqrt(this.real * this.real + this.imaginary * this.imaginary);
    }

    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + Math.abs(imaginary) + "i";
        }
    }
}

class ComplexNumberOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an operation:");
        System.out.println("1. Addition of Complex Numbers");
        System.out.println("2. Multiplication of Complex Numbers");
        System.out.println("3. Magnitude of a Complex Number");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter Complex Number 1 (real imaginary): ");
                Complex num1 = new Complex(sc.nextDouble(), sc.nextDouble());
                System.out.println("Enter Complex Number 2 (real imaginary): ");
                Complex num2 = new Complex(sc.nextDouble(), sc.nextDouble());
                Complex sum = num1.add(num2);
                System.out.println("Result: " + sum);
                break;

            case 2:
                System.out.println("Enter Complex Number 1 (real imaginary): ");
                Complex num3 = new Complex(sc.nextDouble(), sc.nextDouble());
                System.out.println("Enter Complex Number 2 (real imaginary): ");
                Complex num4 = new Complex(sc.nextDouble(), sc.nextDouble());
                Complex product = num3.multiply(num4);
                System.out.println("Result: " + product);
                break;

            case 3:
                System.out.println("Enter Complex Number (real imaginary): ");
                Complex num5 = new Complex(sc.nextDouble(), sc.nextDouble());
                double magnitude = num5.magnitude();
                System.out.println("Result: Magnitude = " + magnitude);
                break;

            default:
                System.out.println("Invalid choice. Please choose between 1 to 3.");
                break;
        }

        sc.close();
    }
}



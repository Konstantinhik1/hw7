public class Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(2, 3);
        ComplexNumber num2 = new ComplexNumber(1, 4);

        ComplexCalculator calculator = CalculatorFactory.createCalculator();
        CalculatorLogger logger = CalculatorLogger.getInstance();

        // Пример сложения
        ComplexNumber sum = calculator.add(num1, num2);
        logger.log("Результат сложения: " + sum);

        // Пример умножения
        ComplexNumber product = calculator.multiply(num1, num2);
        logger.log("Результат умножения: " + product);

        // Пример деления
        ComplexNumber quotient = calculator.divide(num1, num2);
        
        logger.log("Результат деления: " + quotient);
    }
}

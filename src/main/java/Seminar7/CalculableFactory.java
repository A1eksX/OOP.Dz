package Seminar7;

public class CalculableFactory implements IntCalculableFactory{
    Logger logger;

    public CalculableFactory(Logger logger) {
        this.logger = logger;
    }

    @Override
    public IntCalculations create(ComplexNumber complexNumber) {
        return new ComplexCalculator(complexNumber, logger);
    }
}
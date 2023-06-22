package Seminar7;


public class ComplexCalculator implements  IntCalculations{
    private final ComplexNumber complexNumber;
    private final Logger logger;

    public ComplexCalculator(ComplexNumber complexNumber, Logger logger) {
        this.complexNumber = complexNumber;
        this.logger = logger;
        logger.writeLog("Комплексное число: "  + complexNumber.getReal() + " + " + complexNumber.getImage() + "i");
    }
    public void sum(ComplexNumber number) {
        int newReal = complexNumber.getReal() + number.getReal();
        int newImage = complexNumber.getImage() + number.getImage();
        complexNumber.setReal(newReal);
        complexNumber.setImage(newImage);
        logger.writeLog("Комплексное число: " + number.getReal() + " + " + number.getImage() + "i");
    }

    public void multi(ComplexNumber number) {
        int newReal = complexNumber.getReal() * number.getReal() - complexNumber.getImage() * number.getImage(); // р - м  р + м  => р*р + р*м - м*р - м*м(р)
        int newImage = complexNumber.getReal() * number.getImage() + complexNumber.getImage() * number.getReal();
        complexNumber.setReal(newReal);
        complexNumber.setImage(newImage);
        logger.writeLog("Комплексное число: " + number.getReal() + " + " + number.getImage() + "i");
    }

    public ComplexNumber getResult() {
        logger.writeLog("Результат: " + complexNumber.getReal() + " + " + complexNumber.getImage() + "i");
        return complexNumber;
    }
}
package dev.abidino.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Insurance insurance = new InsuranceImpl();
        insurance = new CarAge(insurance, 10);
        print(insurance);
        insurance = new LivingCity(insurance, "IST");
        print(insurance);
    }

    public static void print(Insurance insuranceItem) {
        System.out.println("Insurance items list : " + insuranceItem.getInsuranceItems());
        System.out.println("Insurance total price : " + insuranceItem.calculatePrice());
    }
}

package creational.factory_method;

public class app {
    public static void main(String [] args){
        GetPlanFactory planFactory = new GetPlanFactory();

        String planName = "commercialplan";
        int billUnit = 500;

        Plan p = planFactory.getPlan(planName);

        System.out.println("Bill amount for " + planName + " of " + billUnit + " units is ");
        p.getRate();
        p.calculateBill(billUnit);
    }
}

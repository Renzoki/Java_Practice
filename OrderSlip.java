public class OrderSlip {
    public static void main(String[] Args){
        HaloHalo order = new HaloHalo("Small");
        order.setOrderNumber(18);

        System.out.println("Halo-Halo Order Slip");
        System.out.println("--------------------");
        System.out.println("Order   No. " + order.getOrderNumber());
        System.out.println("Order Size. " + order.getSize());
        System.out.println("Order Cost. " + order.getCost());
        System.out.println("--------------------");

        order.addSangkap(new Sangkap("Leche Flan"));
        order.addSangkap(new Sangkap("Kaong"));
        order.addSangkap(new Sangkap("Ube"));
        System.out.println("--------------------");
        System.out.println("Total Cost is " + order.getTotalCost());
    }
}

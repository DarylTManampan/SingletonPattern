public class PagibigOffice {
    public static void main(String[] args) {
        CentralizedQueuingSystem helpDesk = CentralizedQueuingSystem.getInstance();

        System.out.println("\n Pag-Ibig Help Desk Station");

        helpDesk.currentQueuingNumber();

        helpDesk.servingCustomer("Help Desk [1]");
        helpDesk.servingCustomer("Help Desk [2]");
        helpDesk.servingCustomer("Help Desk [3]");
        
        helpDesk.availableDesk("Help Desk [1]");
        helpDesk.availableDesk("Help Desk [3]");
        
        helpDesk.servingCustomer("Help Desk [1]");
        helpDesk.servingCustomer("Help Desk: [3]");

        helpDesk.currentQueuingNumber();

        System.out.println("--------------------------------\n");

        helpDesk.resetQueuingNumber(57);

        helpDesk.servingCustomer("Help Desk [1]");
        helpDesk.servingCustomer("Help Desk [2]");
        helpDesk.servingCustomer("Help Desk [3]");
    }
}
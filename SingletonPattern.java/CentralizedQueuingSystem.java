public class  CentralizedQueuingSystem{
    private static  CentralizedQueuingSystem instance;
    private int queueNumber = 0;
    
    private CentralizedQueuingSystem() {
    }

    public static synchronized  CentralizedQueuingSystem getInstance() {
        if (instance == null)
            instance = new CentralizedQueuingSystem();
        return instance;
    }

    public synchronized void currentQueuingNumber() {
        System.out.println("\n[Current Queue Number at " + queueNumber + "]\n");
    }

    public synchronized void servingCustomer(String deskStation) {
        queueNumber++;

        System.out.println("Now Serving: Customer Number [" + queueNumber + "] at " + deskStation);
    }

    public synchronized void availableDesk(String deskStation) {
        System.out.println(deskStation + " is now available");
    }

    public synchronized void resetQueuingNumber(int num) {
        queueNumber = num;
        
        System.out.println("**Queue Number Reset at " + queueNumber + "**\n");
    }
}
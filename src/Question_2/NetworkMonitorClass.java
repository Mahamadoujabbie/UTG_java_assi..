package Question_2;

public class NetworkMonitorClass {

    private NetworkStatus status;

    public NetworkStatus getStatus() {
        return status;
    }

    public void setStatus(NetworkStatus status) {
        this.status = status;
    }

   public void howAdvice(String device, NetworkStatus status){
        NetworkMonitorClass networkMonitorClass = new NetworkMonitorClass();
        networkMonitorClass.setStatus(status);
       System.out.println("The "+device+" is "+networkMonitorClass.getStatus());
   }

   // The main method for printing values
    static void main(String[] args) {
        NetworkMonitorClass nt = new NetworkMonitorClass();
        nt.howAdvice("laptop", NetworkStatus.DISCONNECTED);
        nt.howAdvice("phone", NetworkStatus.CONNECTING);
        nt.howAdvice("honder", NetworkStatus.DISCONNECTED);
        nt.howAdvice("generator", NetworkStatus.CONNECTED);
        nt.howAdvice("pen", NetworkStatus.LIMITED);
    }
}

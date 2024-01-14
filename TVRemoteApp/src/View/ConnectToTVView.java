package View;

public class ConnectToTVView {
    public void showConnectToTVScreen() {
        System.out.println("-----Connect To TV Screen-----");
        System.out.println("1. Search for TVs");
        System.out.println("2. Enter IP address");
        System.out.println("3. Scan QR code");
        System.out.println("4. Enter confirmation code");
    }
    
    public void searchTV() {
        System.out.println("Searching for available TVs...");
        // Реализация отображения списка доступных ТВ
    }
    
    public void enterIP(String ip) {
        System.out.println("Entered IP address: " + ip);
    }
    
    public void scanQRCode(String qrCode) {
        System.out.println("Scanned QR code: " + qrCode);
    }
    
    public void enterConfirmationCode(String code) {
        System.out.println("Entered confirmation code: " + code);
    }

}

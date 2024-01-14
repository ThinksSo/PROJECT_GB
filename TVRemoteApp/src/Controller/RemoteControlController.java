package Controller;

import Model.RemoteControl;
import Model.TV;
import View.ConnectToTVView;
import View.MainControlView;
import java.util.Scanner;

public class RemoteControlController {
    private TV tv;
    private RemoteControl remoteControl;

    public void createTV() {
        tv = new TV();
    }

    public void createRemoteControl() {
        remoteControl = new RemoteControl();
    }

    public void start() {
        handleConnectToTV();
    }

    public void handleConnectToTV() {
        ConnectToTVView connectToTVView = new ConnectToTVView();
        connectToTVView.showConnectToTVScreen();
        
        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();
        if (choice == 1) {
            connectToTVView.searchTV();
        } else if (choice == 2) {
            System.out.println("Enter IP address:");
            String ip = scanner.next();
            connectToTVView.enterIP(ip);
            tv.setIp(ip);
        } else if (choice == 3) {
            System.out.println("Scan QR code:");
            String qrCode = scanner.next();
            connectToTVView.scanQRCode(qrCode);
            // Code for handling actions on the first connection screen
        } else if (choice == 4) {
            System.out.println("Enter confirmation code:");
            String code = scanner.next();
            connectToTVView.enterConfirmationCode(code);
            remoteControl.setConfirmationCode(code);
        }
    }

    public void handleMainControl() {
        // Code for handling actions on the second main control screen
        MainControlView mainControlView = new MainControlView();
        mainControlView.power(true);

        Scanner scanner = new Scanner(System.in);

        boolean powerState = scanner.nextBoolean();
        mainControlView.setVolumeLevel();
        int volumeLevel = scanner.nextInt();
        mainControlView.mute(false);
        boolean muteState = scanner.nextBoolean();
        mainControlView.setChannel();
        int channel = scanner.nextInt();
        mainControlView.setBrightnessLevel();
        int brightnessLevel = scanner.nextInt();
        mainControlView.setContrastLevel();
        int contrastLevel = scanner.nextInt();

        // взаимодействие с представлением
        mainControlView.power(powerState);
        mainControlView.setVolumeLevel(volumeLevel);
        mainControlView.mute(muteState);
        mainControlView.setChannel(channel);
        mainControlView.setBrightnessLevel(brightnessLevel);
        mainControlView.setContrastLevel(contrastLevel);
        mainControlView.display();
    }

    public void handleAdvancedSettings() {
        // Code for handling actions on the third advanced settings screen
    }
}

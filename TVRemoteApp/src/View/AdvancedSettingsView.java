package View;

import java.util.Scanner;

public class AdvancedSettingsView {
    private Scanner scanner;
    private int profile;

    public AdvancedSettingsView() {
        scanner = new Scanner(System.in);
    }
    
    public void setDateAndTime(int year, int month, int day, int hour, int minute) {
        System.out.println("Please set the date and time:");
        System.out.println("Year: ");
        year = scanner.nextInt();
        System.out.println("Month: ");
        month = scanner.nextInt();
        System.out.println("Day: ");
        day = scanner.nextInt();
        System.out.println("Hour: ");
        hour = scanner.nextInt();
        System.out.println("Minute: ");
        minute = scanner.nextInt();
        // Logic to handle the date and time settings
    }
    
    // public void setSoundProfile(String profile) {
    //     System.out.println("Please select the sound profile:");
    //     // Display the available sound profiles
    //     System.out.println("1. Standard");
    //     System.out.println("2. Music");
    //     System.out.println("3. Movie");
    //     int profileNumber = scanner.nextInt();
    //     // Logic to handle the selected sound profile
    // }

    public void setSoundProfile() {
        System.out.println("Please select the sound profile:");
        // Display the available sound profiles
        System.out.println("1. Standard");
        System.out.println("2. Music");
        System.out.println("3. Movie");
        this.profile = scanner.nextInt();
        }
    
    public void setBrightnessAndContrast(int brightness, int contrast) {
        System.out.println("Please set the brightness and contrast levels:");
        System.out.println("Brightness (0-100): ");
        brightness = scanner.nextInt();
        System.out.println("Contrast (0-100): ");
        contrast = scanner.nextInt();
        // Logic to handle the brightness and contrast levels
    }
    
    public void setLanguage(String language) {
        System.out.println("Please select language: " + language);
        }
}

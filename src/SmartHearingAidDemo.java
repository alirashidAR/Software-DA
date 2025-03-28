import java.util.Scanner;

public class SmartHearingAidDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SmartHearingAid hearingAid = new SmartHearingAid();

        System.out.println("Initializing Smart Hearing Aid...");
        hearingAid.powerOn();

        System.out.println("Do you want to connect to the mobile app? (yes/no)");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            hearingAid.connectToMobileApp();
        }

        System.out.println("Select environment mode: 1. Quiet Room 2. Noisy Restaurant 3. Concert 4. Street");
        int choice = scanner.nextInt();
        Environment environment = switch (choice) {
            case 1 -> Environment.QUIET_ROOM;
            case 2 -> Environment.NOISY_RESTAURANT;
            case 3 -> Environment.CONCERT;
            case 4 -> Environment.STREET;
            default -> Environment.QUIET_ROOM;
        };
        hearingAid.changeModeBasedOnEnvironment(environment);

        System.out.println("Would you like to switch to a custom user profile? (yes/no)");
        scanner.nextLine(); // Consume newline
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            System.out.println("Enter user profile name:");
            String profileName = scanner.nextLine();
            UserProfile customProfile = new UserProfile(profileName);
            HearingLossProfile hearingLoss = new HearingLossProfile();
            hearingLoss.setLowFrequencyLoss(3);
            hearingLoss.setMidFrequencyLoss(5);
            hearingLoss.setHighFrequencyLoss(4);
            customProfile.setHearingLossProfile(hearingLoss);
            hearingAid.changeProfile(customProfile);
        }

        System.out.println("Powering off the hearing aid...");
        hearingAid.powerOff();
        scanner.close();
    }
}

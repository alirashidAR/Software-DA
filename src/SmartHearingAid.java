public class SmartHearingAid {
    private AudioProcessor audioProcessor;
    private SignalProcessor signalProcessor;
    private UserProfile currentProfile;
    private BluetoothConnector bluetoothConnector;
    private BatteryManager batteryManager;
    private ModeSelector modeSelector;

    public SmartHearingAid() {
        this.audioProcessor = new AudioProcessor();
        this.signalProcessor = new SignalProcessor();
        this.bluetoothConnector = new BluetoothConnector();
        this.batteryManager = new BatteryManager();
        this.modeSelector = new ModeSelector();
        this.currentProfile = new UserProfile("Default");
    }

    public void powerOn() {
        if (batteryManager.getBatteryLevel() > 10) {
            audioProcessor.initialize();
            signalProcessor.initialize(currentProfile.getAudioSettings());
            modeSelector.setMode(ListeningMode.NORMAL);
        }
    }

    public void powerOff() {
        audioProcessor.shutdown();
        signalProcessor.shutdown();
        bluetoothConnector.disconnect();
    }

    public void changeProfile(UserProfile profile) {
        this.currentProfile = profile;
        signalProcessor.updateSettings(profile.getAudioSettings());
    }

    public void connectToMobileApp() {
        bluetoothConnector.startDiscovery();
        bluetoothConnector.pairWithApp();
    }

    public void changeModeBasedOnEnvironment(Environment environment) {
        ListeningMode newMode = modeSelector.recommendMode(environment);
        modeSelector.setMode(newMode);
        signalProcessor.optimizeForMode(newMode);
    }
}
class BatteryManager {
    private int batteryLevel = 100;
    private boolean lowBatteryAlertIssued = false;

    public int getBatteryLevel() { return batteryLevel; }
    public void checkBatteryLevel() {
        batteryLevel -= (int)(Math.random() * 5);
        if (batteryLevel < 0) batteryLevel = 0;
        if (batteryLevel <= 20 && !lowBatteryAlertIssued) {
            issueLowBatteryAlert();
        }
    }
    private void issueLowBatteryAlert() { lowBatteryAlertIssued = true; }
}
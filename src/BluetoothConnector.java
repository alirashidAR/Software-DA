class BluetoothConnector {
    private boolean connected = false;
    private String connectedDeviceName = "";

    public void startDiscovery() { /* Start Bluetooth discovery */ }
    public boolean pairWithApp() {
        connected = true;
        connectedDeviceName = "SmartHearingApp";
        return true; // Simplified
    }
    public void disconnect() { connected = false; }
}
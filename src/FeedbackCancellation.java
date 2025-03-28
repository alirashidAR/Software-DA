class FeedbackCancellation {
    private int strength = 5;
    public void setStrength(int strength) { this.strength = strength; }
    public byte[] apply(byte[] audio) { return audio; } // Simplified
}

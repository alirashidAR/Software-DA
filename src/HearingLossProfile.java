class HearingLossProfile {
    private int lowFrequencyLoss = 1;
    private int midFrequencyLoss = 1;
    private int highFrequencyLoss = 1;

    public int getLowFrequencyLoss() { return lowFrequencyLoss; }
    public void setLowFrequencyLoss(int level) { this.lowFrequencyLoss = level; }
    public int getMidFrequencyLoss() { return midFrequencyLoss; }
    public void setMidFrequencyLoss(int level) { this.midFrequencyLoss = level; }
    public int getHighFrequencyLoss() { return highFrequencyLoss; }
    public void setHighFrequencyLoss(int level) { this.highFrequencyLoss = level; }
}
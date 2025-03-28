class AudioSettings {
    private int volume = 5;
    private int noiseReductionLevel = 5;
    private int feedbackCancellationLevel = 5;
    private boolean directionalityEnabled = true;
    private FrequencySettings frequencySettings = new FrequencySettings();

    public int getNoiseReductionLevel() { return noiseReductionLevel; }
    public void setNoiseReductionLevel(int level) { this.noiseReductionLevel = level; }
    public int getFeedbackCancellationLevel() { return feedbackCancellationLevel; }
    public void setFeedbackCancellationLevel(int level) { this.feedbackCancellationLevel = level; }

    public void adjustForHearingLoss(HearingLossProfile profile) {
        frequencySettings.setLowFrequencyGain(profile.getLowFrequencyLoss());
        frequencySettings.setMidFrequencyGain(profile.getMidFrequencyLoss());
        frequencySettings.setHighFrequencyGain(profile.getHighFrequencyLoss());
    }
}
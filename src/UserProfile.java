class UserProfile {
    private String name;
    private AudioSettings audioSettings = new AudioSettings();
    private HearingLossProfile hearingLossProfile = new HearingLossProfile();

    public UserProfile(String name) { this.name = name; }
    public String getName() { return name; }
    public AudioSettings getAudioSettings() { return audioSettings; }

    public void setHearingLossProfile(HearingLossProfile profile) {
        this.hearingLossProfile = profile;
        audioSettings.adjustForHearingLoss(profile);
    }
}
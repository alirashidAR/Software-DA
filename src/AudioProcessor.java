class AudioProcessor {

    private boolean intialized;
    private final int sampleRate = 44100;
    private final int bitDepth = 16;

    public void initialize(){
        this.intialized = true;
    }

    public void shutdown(){
        this.intialized = false;
    }

    public byte[] captureAudio(){
        return new byte[1024];
    }
}

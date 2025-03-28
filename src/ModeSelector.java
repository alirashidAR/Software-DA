class ModeSelector {
    private ListeningMode currentMode = ListeningMode.NORMAL;

    public void setMode(ListeningMode mode) { this.currentMode = mode; }

    public ListeningMode recommendMode(Environment environment) {
        switch (environment) {
            case QUIET_ROOM: return ListeningMode.NORMAL;
            case NOISY_RESTAURANT: return ListeningMode.CONVERSATION;
            case CONCERT: return ListeningMode.MUSIC;
            case STREET: return ListeningMode.OUTDOOR;
            default: return ListeningMode.NORMAL;
        }
    }
}

enum ListeningMode { NORMAL, CONVERSATION, MUSIC, OUTDOOR }
enum Environment { QUIET_ROOM, NOISY_RESTAURANT, CONCERT, STREET }
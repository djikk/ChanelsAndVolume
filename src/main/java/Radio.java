public class Radio {
    private int currentChanel;
    private int currentVolume;

    public void nextChanel() {
        if (currentChanel < 9) {
            currentChanel++;
        } else {
            currentChanel = 0;
        }
    }

    public void previousChanel() {
        if (currentChanel > 1) {
            currentChanel--;
        } else {
            currentChanel = 9;
        }
    }

    public void nextVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        } else {
            currentVolume = 10;
        }
    }

    public void previousVolume() {
        if (currentVolume > 1) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }
    public int getCurrentChanel() {
        return currentChanel;
    }

    public void setCurrentChanel(int currentChanel) {
        if (currentChanel < 0) {
            return;
        }
        if (currentChanel > 9) {
            return;
        }
        this.currentChanel = currentChanel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}

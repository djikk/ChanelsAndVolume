public class Radio {
    private int currentChanel;
    private int currentVolume;
    private int stationsCount;

    private int volumeCount;

    public Radio() {
        this.stationsCount = 10;

        this.volumeCount = 11;
    }
    public Radio(int stationsCount, int volumeCount) {
        this.stationsCount = stationsCount;

        this.volumeCount = volumeCount;
    }

    public void nextChanel() {
        if (currentChanel < stationsCount - 1) {
            currentChanel++;
        } else {
            currentChanel = 0;
        }
    }

    public void previousChanel() {
        if (currentChanel > 1) {
            currentChanel--;
        } else {
            currentChanel = stationsCount - 1;
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
        if (currentChanel > stationsCount - 1) {
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

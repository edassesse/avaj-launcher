package src.classes.Aircrafts;

public class Coordinates {
    private int longitude;
    private int latitude;
    private int height;

    Coordinates(int longitude, int latitude, int height) {
        this.height = Math.max(0, Math.min(100, height));
        this.longitude = Math.max(0, longitude);
        this.latitude = Math.max(0, latitude);
    }

    public int getLongitude() {
        return longitude;
    }

    public int getLatitude() {
        return latitude;
    }

    public int getHeight() {
        return height;
    }
}

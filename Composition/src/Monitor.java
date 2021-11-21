public class Monitor {
    private String name;
    private int size;
    private String resolution;

    public Monitor(String name, int size, String resolution) {
        this.name = name;
        this.size = size;
        this.resolution = resolution;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String getResolution() {
        return resolution;
    }
}

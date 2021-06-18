package web.model;

public class Car {
    private String model;
    private int series;
    private int releaseDate;

    public Car(String model, int series, int releaseDate) {
        this.model = model;
        this.series = series;
        this.releaseDate = releaseDate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "model = " + model + ", series=" + series + ", releaseDate=" + releaseDate + '}';
    }
}

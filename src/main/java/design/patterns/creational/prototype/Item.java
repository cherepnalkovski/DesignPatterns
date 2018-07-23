package design.patterns.creational.prototype;

public abstract class Item implements Cloneable{
    private String title;
    private double prioe;
    private String url;


    @Override
    protected  Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrioe() {
        return prioe;
    }

    public void setPrioe(double prioe) {
        this.prioe = prioe;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

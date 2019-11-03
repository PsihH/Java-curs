public class Animals {
    private String name;
    private int ves;
    private String color;
    private int vothrast;
    private String pol;
    private String zivotnoe;

    public void all_data( String zivotnoe, String name, int ves, String color, int vothrast, String pol) {
        setZivotnoe(zivotnoe);
        setName(name);
        setVes(ves);
        setColor(color);
        setVothrast(vothrast);
        setPol(pol);
    }

    public String getAll_data() {
        return "\nЖивотное-" + getZivotnoe() +"\nИмя-" + getName() + "\nВес-" + getVes() + "кг" + "\nОкрас-" + getColor() + "\nВозраст-" + getVothrast() + "\nПол-" + getPol();
    }

    public String getZivotnoe() {
        return zivotnoe;
    }
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public String getPol() {
        return pol;
    }
    public int getVes() {
        return ves;
    }
    public int getVothrast() {
        return vothrast;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setPol(String pol) {
        this.pol = pol;
    }
    public void setVes(int ves) {
        this.ves = ves;
    }
    public void setZivotnoe(String zivotnoe) {
        this.zivotnoe = zivotnoe;
    }
    public void setVothrast(int vothrast) {
        this.vothrast = vothrast;
    }
}

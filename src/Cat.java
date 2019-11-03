public class Cat {
    private String name;
    private int ves;
    private String color;
    private int vothrast;
    private String pol;

    public void all_data(String name, int ves, String color, int vothrast, String pol) {
        setName(name);
        setVes(ves);
        setColor(color);
        setVothrast(vothrast);
        setPol(pol);
    }

    public String getAll_data() {
        return "\nИмя кошки-" + getName() + "\nВес кошки-" + getVes() + "кг" + "\nОкрас шерсти кошки-" + getColor() + "\nВозраст кошки-" + getVothrast() + "года" + "\nПол кошки-" + getPol();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    public int getVes() {
        return ves;
    }

    public void setVes(int ves) {
        this.ves = ves;
    }

    public int getVothrast() {
        return vothrast;
    }

    public void setVothrast(int vothrast) {
        this.vothrast = vothrast;
    }
}

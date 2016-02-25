package design_patterns._01_creational._05_prototype._02_generic_example;

public abstract class Issue implements Cloneable {
    private Integer id;
    private String name;
    private int year;

    public Issue(Integer id, String name, int year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }

    @Override
    protected Issue clone() {
        Issue cloned = null;
        try {
            cloned = (Issue) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloned;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

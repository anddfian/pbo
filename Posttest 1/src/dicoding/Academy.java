package dicoding;

public class Academy {
    private int step;
    private String name;
    private String description;
    private String level;
    private int time;
    private String technology;

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public void tampil(int step, String name, String description, String level, int time, String technology) {
        System.out.println("Langkah ke-" + step);
        System.out.println("Nama Akademi : " + name);
        System.out.println("Deskripsi Akademi : " + description);
        System.out.println("Level : " + level);
        System.out.println("Estimasi : " + time + " jam");
        System.out.println("Teknologi : " + technology + "\n");
    }
}

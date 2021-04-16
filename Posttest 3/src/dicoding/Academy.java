package dicoding;

public class Academy extends LearningPath {
    private int step;
    private String level;
    private int time;
    private String technology;
    private static int countAcademy;

    public Academy(int step, String name, String description, String level, int time, String technology) {
        super(name, description);
        this.step = step;
        this.level = level;
        this.time = time;
        this.technology = technology;
        countAcademy++;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
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

    public static int getCountAcademy() {
        return countAcademy;
    }

    public static void setCountAcademy(int countAcademy) {
        Academy.countAcademy = countAcademy;
    }

    @Override
    public void show(int step, String name, String description, String level, int time, String technology) {
        System.out.println("Langkah ke-" + step);
        System.out.println("Nama Akademi : " + name);
        System.out.println("Deskripsi Akademi : " + description);
        System.out.println("Level : " + level);
        System.out.println("Estimasi : " + time + " jam");
        System.out.println("Teknologi : " + technology + "\n");
    }
}
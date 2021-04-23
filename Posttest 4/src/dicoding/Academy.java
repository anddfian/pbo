package dicoding;

public class Academy extends LearningPath {
    private int step;
    private String level;
    private int time;
    private String technology;
    private static int countAcademy;

    protected Academy(int step, String name, String description, String level, int time, String technology) {
        super(name, description);
        this.step = step;
        this.level = level;
        this.time = time;
        this.technology = technology;
        Academy.countAcademy++;
    }

    protected int getStep() {
        return step;
    }

    protected void setStep(int step) {
        this.step = step;
    }

    protected String getLevel() {
        return level;
    }

    protected void setLevel(String level) {
        this.level = level;
    }

    protected int getTime() {
        return time;
    }

    protected void setTime(int time) {
        this.time = time;
    }

    protected String getTechnology() {
        return technology;
    }

    protected void setTechnology(String technology) {
        this.technology = technology;
    }

    protected static int getCountAcademy() {
        return countAcademy;
    }

    protected static void setCountAcademy(int countAcademy) {
        Academy.countAcademy = countAcademy;
    }

    @Override
    protected void show(int step, String name, String description, String level, int time, String technology) {
        System.out.println("Langkah ke-" + step);
        System.out.println("Nama Akademi : " + name);
        System.out.println("Deskripsi Akademi : " + description);
        System.out.println("Level : " + level);
        System.out.println("Estimasi : " + time + " jam");
        System.out.println("Teknologi : " + technology + "\n");
    }
}
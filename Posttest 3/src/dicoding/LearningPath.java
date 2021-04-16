package dicoding;

public class LearningPath {
    protected String name;
    protected String description;
    private int classAcademy;
    private static int countLearningPath;

    public LearningPath(String name, String description, int classAcademy) {
        this.name = name;
        this.description = description;
        this.classAcademy = classAcademy;
        countLearningPath++;
    }

    public LearningPath(String name, String description) {
        this.name = name;
        this.description = description;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getDescription() {
        return description;
    }

    protected void setDescription(String description) {
        this.description = description;
    }

    public int getClassAcademy() {
        return classAcademy;
    }

    public void setClassAcademy(int classAcademy) {
        this.classAcademy = classAcademy;
    }

    public static int getCountLearningPath() {
        return countLearningPath;
    }

    public static void setCountLearningPath(int countLearningPath) {
        LearningPath.countLearningPath = countLearningPath;
    }

    public void show(String name, String description, int classAcademy) {
        System.out.println("Nama Alur Belajar : " + name);
        System.out.println("Deskripsi Alur Belajar : " + description);
        System.out.println("Jumlah Kelas Akademi : " + classAcademy + "\n");
    }

    protected void show(int step, String name, String description, String level, int time, String technology) {
        System.out.println(step);
        System.out.println(name);
        System.out.println(description);
        System.out.println(level);
        System.out.println(time);
        System.out.println(technology);
    }
}
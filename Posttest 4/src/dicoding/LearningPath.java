package dicoding;

public class LearningPath {
    private String name;
    private String description;
    private int classAcademy;
    private static int countLearningPath;

    protected LearningPath(String name, String description, int classAcademy) {
        this.name = name;
        this.description = description;
        this.classAcademy = classAcademy;
        LearningPath.countLearningPath++;
    }

    protected LearningPath(String name, String description) {
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

    protected int getClassAcademy() {
        return classAcademy;
    }

    protected void setClassAcademy(int classAcademy) {
        this.classAcademy = classAcademy;
    }

    protected static int getCountLearningPath() {
        return countLearningPath;
    }

    protected static void setCountLearningPath(int countLearningPath) {
        LearningPath.countLearningPath = countLearningPath;
    }

    protected void show(String name, String description, int classAcademy) {
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
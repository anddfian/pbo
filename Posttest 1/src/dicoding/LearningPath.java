package dicoding;

public class LearningPath {
    private String name;
    private String description;
    private int classAcademy;

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

    public int getClassAcademy() {
        return classAcademy;
    }

    public void setClassAcademy(int classAcademy) {
        this.classAcademy = classAcademy;
    }

    public void show(String name, String description, int classAcademy) {
        System.out.println("Nama Alur Belajar : " + name);
        System.out.println("Deskripsi Alur Belajar : " + description);
        System.out.println("Jumlah Kelas Akademi : " + classAcademy + "\n");
    }
}

package dicoding;

public class LearningPath {
    private String name;
    private String description;
    private int class_academy;

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

    public int getClass_academy() {
        return class_academy;
    }

    public void setClass_academy(int class_academy) {
        this.class_academy = class_academy;
    }

    public void tampil(String name, String description, int class_academy) {
        System.out.println("Nama Alur Belajar : " + name);
        System.out.println("Deskripsi Alur Belajar : " + description);
        System.out.println("Jumlah Kelas Akademi : " + class_academy + "\n");
    }
}

package StudentInfoSystem;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int matExamNote, int matOralNote, int fizikExamNote, int fizikOralNote, int kimyaExamNote, int kimyaOralNote) {

        if (matExamNote >= 0 && matExamNote <= 100 && matOralNote >= 0 && matOralNote <= 100) {
            this.mat.examNote = matExamNote;
            this.mat.oralNote = matOralNote;
        }

        if (fizikExamNote >= 0 && fizikExamNote <= 100 && fizikOralNote >= 0 && fizikOralNote <= 100) {
            this.fizik.examNote = fizikExamNote;
            this.fizik.oralNote = fizikOralNote;
        }

        if (kimyaExamNote >= 0 && kimyaExamNote <= 100 && kimyaOralNote >= 0 && kimyaOralNote <= 100) {
            this.kimya.examNote = kimyaExamNote;
            this.kimya.oralNote = kimyaOralNote;
        }

    }

    public void isPass() {
        if (this.mat.examNote == 0 || this.fizik.examNote == 0 || this.kimya.examNote == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (((this.fizik.examNote *0.8) + (this.fizik.oralNote * 0.2)) +
                ((this.kimya.examNote * 0.8) + (this.kimya.oralNote * 0.2)) +
                ((this.mat.examNote *0.8) + (this.mat.oralNote * 0.2))) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Sınav Notu : " + this.mat.examNote + " | Sözlü Notu : " + this.mat.oralNote);
        System.out.println("Fizik Sınav Notu : " + this.fizik.examNote + " | Sözlü Notu : " + this.fizik.oralNote);
        System.out.println("Kimya Sınav Notu : " + this.kimya.examNote + " | Sözlü Notu : " + this.kimya.oralNote);
    }

}

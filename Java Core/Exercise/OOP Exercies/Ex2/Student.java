package Ex2;

class Student {

    private int StudentCode;
    private String StudentName;
    private float ScoresLT;
    private float ScoresTH;

    public Student() {
        this.StudentCode = 0;
        this.StudentName = "";
        this.ScoresLT = 0;
        this.ScoresTH = 0;
    }

    public Student(int Code, String Name, float LT, float TH) {
        setStudentCode(Code);
        setStudentName(Name);
        setScoresLT(LT);
        setScoresTH(TH);
    }

    private float MediumScore() {
        return (this.ScoresLT + this.ScoresTH) / 2;
    }

    public String toString() {
        return getStudentCode() + " " + getStudentName() + " " + getScoresLT() + " " + getScoresTH() + " "
                + MediumScore();
    }

    public void setStudentCode(int Code) {
        this.StudentCode = Code;
    }

    public void setStudentName(String Name) {
        this.StudentName = Name;
    }

    public void setScoresLT(float LT) {
        this.ScoresLT = LT;
    }

    public void setScoresTH(float TH) {
        this.ScoresTH = TH;
    }

    public String getStudentCode() {
        return String.valueOf(this.StudentCode);
    }

    public String getStudentName() {
        return this.StudentName;
    }

    public String getScoresLT() {
        return String.valueOf(this.ScoresLT);
    }

    public String getScoresTH() {
        return String.valueOf(this.ScoresTH);
    }
}
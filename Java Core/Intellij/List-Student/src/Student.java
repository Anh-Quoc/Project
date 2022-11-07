public class Student extends CheckValueInput {
    private String Code;
    private String Name;
    private String Class;

    private double mathScores;
    private double physicalScores;
    private double chemistryScores;

    public Student() {
        setCode();
        setName();
        setClass();
        setMathScores();
        setPhysicalScores();
        setChemistryScores();
    }

    public void setCode() {
        boolean Condition = true;
        while (Condition) {
            System.out.print("Code : ");
            String CodeNeedCheck = sc.nextLine();
            if (CheckCodeSame(CodeNeedCheck)) {
                if(CheckStringIsNumber(CodeNeedCheck)){
                    this.Code = CodeNeedCheck;
                    Condition = false;
                } else {
                    System.out.println("Code is only number! Pleas import again.");
                }
            } else {
                System.out.println("Code is only! Please import again");
            }
        }
    }

    public void setName() {
        boolean Condition = true;
        while (Condition) {
            System.out.print("Name : ");
            String NameNeedCheck = sc.nextLine();
            if (NameNeedCheck.length() != 0) {
                if(CheckStringIsCharacter(NameNeedCheck)){
                    this.Name = NameNeedCheck;
                    Condition = false;
                } else {
                    System.out.println("Name is only string! Please import again");
                }
            } else {
                System.out.println("Name is not empty! Pleas import again");
            }
        }
    }

    public void setClass() {
        boolean Condition = true;
        while (Condition) {
            System.out.print("Class : ");
            String ClassNeedCheck = sc.nextLine();
            if (ClassNeedCheck.length() != 0 ) {
                if(CheckClass(ClassNeedCheck)){
                    this.Class = ClassNeedCheck;
                    Condition = false;
                } else {
                    System.out.println("Class is only string! Pleas import again");
                }
            } else {
                System.out.println("Class is not empty! Pleas impor again");
            }
        }
    }

    public void setMathScores() {
        boolean Condition = true;
        while (Condition) {
            System.out.print("Math Scores : ");
            String MathScoresNeedCheck = sc.nextLine();
            try {
                double MathScoresTest = Double.parseDouble(MathScoresNeedCheck);
                if (MathScoresTest >= 0 && MathScoresTest <= 20) {
                    this.mathScores = MathScoresTest;
                    Condition = false;
                } else {
                    System.out.println("Math Scores is less 20 and bigger 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("Math Scores is only number! Pleas import again.");
            }
        }
    }

    public void setPhysicalScores() {
        boolean Condition = true;
        while (Condition) {
            System.out.print("Physical Scores : ");
            String PhysicalScoresNeedCheck = sc.nextLine();
            try {
                double PhySicalScoresTest = Double.parseDouble(PhysicalScoresNeedCheck);
                if (PhySicalScoresTest >= 0 && PhySicalScoresTest <= 20) {
                    this.physicalScores = PhySicalScoresTest;
                    Condition = false;
                } else {
                    System.out.println("Physical Scores is less 20 and bigger 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("Physical Scores is only number! Pleas import again.");
            }
        }
    }

    public void setChemistryScores() {
        boolean Condition = true;
        while (Condition) {
            System.out.print("Chemistry Scores : ");
            String ChemistryScoresNeedCheck = sc.nextLine();
            try {
                double ChemistryScoresTest = Double.parseDouble(ChemistryScoresNeedCheck);
                if (ChemistryScoresTest >= 0 && ChemistryScoresTest <= 20) {
                    this.chemistryScores = ChemistryScoresTest;
                    Condition = false;
                } else {
                    System.out.println("Chemistry Scores is less 20 and bigger 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("Chemistry Scores is only number! Pleas import again.");
            }
        }
    }

    public void getInfo() {
        System.out.print(Code + " ");
        System.out.print(Name + " ");
        System.out.print(Class + " ");
        System.out.print(mathScores + " ");
        System.out.print(physicalScores + " ");
        System.out.println(chemistryScores + " ");
    }

    public String getCode() {
        return this.Code;
    }
}

package com.example.quizgames;

public class Question {

    private final int INDEX_QUESTION_TITLE = 1;
    private final int INDEX_OPTION_A = 2;
    private final int INDEX_OPTION_B = 3;
    private final int INDEX_OPTION_C = 4;
    private final int INDEX_OPTION_D = 5;

    private String questionTitle;
    private String option_A;
    private String option_B;
    private String option_C;
    private String option_D;

    public Question(String data){
        setQuestionTitle(data);
        setOption_A(data);
        setOption_B(data);
        setOption_C(data);
        setOption_D(data);
    }

    public void setQuestionTitle(String data) {
        this.questionTitle = DataProcess.cutStringDataFrom(data, INDEX_QUESTION_TITLE);
    }

    public void setOption_A(String data) {
        this.option_A = DataProcess.cutStringDataFrom(data, INDEX_OPTION_A);
    }

    public void setOption_B(String data) {
        this.option_B = DataProcess.cutStringDataFrom(data, INDEX_OPTION_B);
    }

    public void setOption_C(String data) {
        this.option_C = DataProcess.cutStringDataFrom(data, INDEX_OPTION_C);
    }

    public void setOption_D(String data) {
        this.option_D = DataProcess.cutStringDataFrom(data, INDEX_OPTION_D);
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public String getOption_A() {
        return option_A;
    }

    public String getOption_B() {
        return option_B;
    }

    public String getOption_C() {
        return option_C;
    }

    public String getOption_D() {
        return option_D;
    }
}

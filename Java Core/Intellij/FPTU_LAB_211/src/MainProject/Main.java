package MainProject;

public class Main {

    public static void main(String[] args) {
        System.out.print("Name exercise: ");
        String nameExercise = Localized.sc.nextLine();
        nameExercise = "run_" + nameExercise.toUpperCase();
        for(int i = 0; i < Localized.listSolution.length; ++i){
            if(Localized.listSolution[i].run_SolutionByName(nameExercise)){
                break;
            }
        }

    }

}

package J1LP0025;

import MainProject.Localized;
import MainProject.SolutionExercise;

public class Solution extends SolutionExercise {
    public void run_J1LP0025() {
        Document textDocument = new Document();
        textDocument.processDocument();
        textDocument.printDataTo(Localized.fileOutputPath);
    }
}

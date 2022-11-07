package MainProject;

import java.lang.reflect.Method;

public class SolutionExercise {

    public boolean run_SolutionByName(String funcName) {
        try {
            Method method = getClass().getDeclaredMethod(funcName);
            method.invoke(this);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}


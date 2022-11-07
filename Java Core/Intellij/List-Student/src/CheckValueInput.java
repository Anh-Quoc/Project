
public class CheckValueInput implements ListStudent{
    public static boolean CheckStringIsNumber(String stringInput){
        for(int i = 0 ; i < stringInput.length() ; ++i){
           if(stringInput.charAt(i) < 48 || stringInput.charAt(i) > 57){
               return false;
           }
        }
        return true;
    }

    public static boolean CheckStringIsCharacter(String stringInput){
        for(int i = 0 ; i < stringInput.length() ; ++i){
            if(!Character.isLetter(stringInput.charAt(i)) && stringInput.charAt(i) != ' '){
                return false;
            }
        }
        return true;
    }

    public static boolean CheckCodeSame(String CodeNeedCheck){
        for(Student student : listStudent){
            if(student.getCode().equals(CodeNeedCheck)) {
                return false;
            }
        }
        return true;
    }

    public static boolean CheckClass(String ClassNeedCheck){
        for(int i = 0 ; i < ClassNeedCheck.length() ; ++i){
            int CodeAcciiForCharInClass = ClassNeedCheck.charAt(i);

            if(CodeAcciiForCharInClass > 33 && CodeAcciiForCharInClass < 47){
                return false;
            }
            if(CodeAcciiForCharInClass > 58 && CodeAcciiForCharInClass < 64){
                return false;
            }
            if(CodeAcciiForCharInClass > 91 && CodeAcciiForCharInClass < 96){
                return false;
            }
            if(CodeAcciiForCharInClass > 123 && CodeAcciiForCharInClass < 126){
                return false;
            }
        }
        return true;
    }
}

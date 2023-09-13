package passwordmanagement;

public class Validator {

    private static String mustChars[] = {"!", "@", "$", "%", "&"};
    private static int length = 8;

    public Boolean isValid(String password){
        if((password.length() >= length)){
            for(String character : mustChars){
                if(!(password.contains(character))){
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }
}

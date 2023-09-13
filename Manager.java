package passwordmanagement;

import java.util.LinkedHashMap;

public class Manager {
    private LinkedHashMap<String, String> passwordMap = new LinkedHashMap<String, String>();

    public LinkedHashMap<String, String> getMap(){
        return passwordMap;
    }

    public void setMap(LinkedHashMap<String, String> passwordMap){
        this.passwordMap = passwordMap;
    }    
}

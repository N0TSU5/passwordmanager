package passwordmanagement;

import java.util.LinkedHashMap;

// data class for the passwords
public class Manager {

    // Linked preserves the order in which they are added (sorting by date added)
    private LinkedHashMap<String, String> passwordMap = new LinkedHashMap<String, String>();

    public LinkedHashMap<String, String> getMap(){
        return passwordMap;
    }

    public void setMap(LinkedHashMap<String, String> passwordMap){
        this.passwordMap = passwordMap;
    }    
}

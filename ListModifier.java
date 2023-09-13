package passwordmanagement;

import java.util.LinkedHashMap;

public class ListModifier {
    private Manager manager;
    private Validator validator = new Validator();

    public ListModifier(Manager manager) {
        this.manager = manager;
    }

    public void addPassword(String service, String password) {
        LinkedHashMap<String, String> passwordMap = manager.getMap();
        if (validator.isValid(password)) {
            passwordMap.put(service, password);
        }
        manager.setMap(passwordMap);
    }

    public void removePassword(String service) {
        LinkedHashMap<String, String> passwordMap = manager.getMap();
        passwordMap.remove(service);
        manager.setMap(passwordMap);
    }

    public void updatePassword(String service, String password) {
        addPassword(service, password);
    }

}
package passwordmanagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public class ListRetriever{
    private Manager manager;

    public ListRetriever(Manager manager){
        this.manager = manager;
    }

    public String getForService(String service){
        LinkedHashMap<String, String> passwordMap = manager.getMap();
        return passwordMap.get(service);
    }

    public String listServices(){
        LinkedHashMap<String, String> passwordMap = manager.getMap();
        String listString = "";

        for(String service : passwordMap.keySet()){
            listString += service + " : " + passwordMap.get(service) + "\n";
        }

        return listString;
    } 

    public String sortServices(Boolean inReverse){
        LinkedHashMap<String, String> passwordMap = manager.getMap();
        String listString = "";

        Set<String> services = passwordMap.keySet();
        List<String> serviceList = new ArrayList<String>(services);
        Collections.sort(serviceList);

        if(inReverse){
            Collections.reverse(serviceList);
        }

        for(String service : serviceList){
            listString += service + " : " + passwordMap.get(service) + "\n";
        }

        return listString;
    }
}
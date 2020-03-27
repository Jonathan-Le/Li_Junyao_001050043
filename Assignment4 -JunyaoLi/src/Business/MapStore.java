/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author junyaoli
 */
public class MapStore {
    
    
    private static MapStore mapstore;
    private Map<Integer, Airliners> airlinerMap;
   
    MapStore(){
        
        airlinerMap= new HashMap<>();
    }
    
    public static MapStore getInstance(){
        if(mapstore == null)
            mapstore = new MapStore();
        return mapstore;
    }

    public static MapStore getMapstore() {
        return mapstore;
    }

    public static void setMapstore(MapStore mapstore) {
        MapStore.mapstore = mapstore;
    }
    

    public Map<Integer, Airliners> getAirlinerMap() {
        return airlinerMap;
    }

    public void setAirlinerMap(Map<Integer, Airliners> airlinerMap) {
        this.airlinerMap = airlinerMap;
    }
    
    
    
}

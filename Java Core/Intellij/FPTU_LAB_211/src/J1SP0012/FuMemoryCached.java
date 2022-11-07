package J1SP0012;

import java.util.Date;
import java.util.HashMap;

public class FuMemoryCached {
    private static HashMap<String, FuCached> cached = new HashMap<>();

    public boolean putObject(String key, Object object, int timeToLive){

        cached.put(key, new FuCached(object, timeToLive));
        return true;
    }

    public static Object getObject(String key){
        FuCached obj = cached.get(key);
        Date date = new Date();
        if(obj.getExpiredDate().getTime() < date.getTime()){
            return obj.getObject();
        } else {
            cached.remove(key);
            return null;
        }
    }

    public static boolean clean(String key){
        try{
            cached.remove(key);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public static boolean cleanAll(){
        try{
            cached.clear();
            return true;
        } catch (Exception e){
            return false;
        }
    }

}

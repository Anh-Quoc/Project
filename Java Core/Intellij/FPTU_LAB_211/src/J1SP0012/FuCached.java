package J1SP0012;

import java.util.Date;

public class FuCached {

    private Object object;
    private Date expiredDate;

    public FuCached(Object object, int timeToLive){
        setObject(object);
        setExpiredDate(timeToLive);
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public void setExpiredDate(int timeToLive) {
        Date date = new Date();
        this.expiredDate = new Date(date.getTime() + timeToLive);
    }

    public Object getObject() {
        return object;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }


}

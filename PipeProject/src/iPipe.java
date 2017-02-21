import java.util.List;

/**
 * Created by Yui on 2017/2/21.
 */
public class iPipe<T> {

    public List<iFilter<T>> filters = null;

    public void registerFilter(List<iFilter<T>> filter){
        for(iFilter<T> ifilter : filter) {
            filters.add(ifilter);
        }
    }

    public  List<T> doFilter(List<T> list){
        return list;
    }
}
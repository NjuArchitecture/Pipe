import java.util.List;

/**
 * Created by Yui on 2017/2/21.
 */
public class iPipe {

    public List<iFilter> filters;

    public iPipe() {}

    public void registerFilter(List<iFilter> filter){
        for(iFilter ifilter : filter) {
            filters.add(ifilter);
        }
    }

    public <T> List<T> doFilter(List<T> list){
        return list;
    }
}
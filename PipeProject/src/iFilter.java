import java.util.List;

/**
 * Created by Yui on 2017/2/21.
 */
public interface iFilter<T> {
    public  List<T> doFilter(List<T> list);
}

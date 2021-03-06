package services.interfaces;

/**
 * Created by Gemtastic on 2015-03-06.
 */
public interface CRUDServices<T> {
    
    public void create();
    
    public T read(String t);
    
    public void delete();
    
    public void update();
}

package services.interfaces;

/**
 * Created by Gemtastic on 2015-03-06.
 */
public interface EntityServices <T> {
    
    public void edit();
    
    public T show();
    
    public void delete();
}
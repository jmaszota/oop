package design.patterns.structural.bridge;

/**
 * Created by jacek.maszota on 26.07.2015.
 */
/**
 * Implementor Interface
 */
public interface PersistenceImplementor {
    public long saveObject(Object object);

    public void deleteObject(long objectId);

    public Object getObject(long objectId);
}

package design.patterns.structural.bridge;

/**
 * Created by jacek.maszota on 26.07.2015.
 */
/**
 * Persistence Interface
 * Abstraction Interface
 */
public interface Persistence {
    /**
     * @param object
     * @return returns objectID
     */
    public String persist(Object object);

    /**
     *
     * @param objectId
     * @return persisted Object
     */
    public Object findById(String objectId);

    /**
     *
     * @param id
     */
    public void deleteById(String id);
}

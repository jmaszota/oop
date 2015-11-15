package design.patterns.structural.bridge;

/**
 * Created by jacek.maszota on 26.07.2015.
 */
public class DabatasePersistenceImplementor implements PersistenceImplementor{

    public DabatasePersistenceImplementor() {

        // load database driver


    }

    @Override
    public void deleteObject(long objectId) {

        // open database connection
        // remove record
        System.out.println("Deleting from DB objectid: " + objectId);

    }

    @Override
    public Object getObject(long objectId) {

        // open database connection
        // read records
        // create object from record
        return null;
    }

    @Override
    public long saveObject(Object object) {

        // open database connection
        // create records for fields inside the object

        return 0;
    }

}

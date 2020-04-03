package gt.edu.umg.ingenieria.sistemas.ingsoftware.dependencias;

import java.util.*;

/**
 * 
 */
public class ServicePerson {

    /**
     * Default constructor
     */
    public ServicePerson() {
    }

    /**
     * 
     */
    private Ipersistence persistence;

    /**
     * @param persistence
     */
    public ServicePerson(Ipersistence persistence) {
		this.persistence = persistence;
	}

    /**
     * @param person 
     * @return
     */
   public void savePerson(Person person) {
		persistence.save(person);
	}

}
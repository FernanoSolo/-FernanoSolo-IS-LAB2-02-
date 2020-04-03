package gt.edu.umg.ingenieria.sistemas.ingsoftware.dependencias;

import java.util.*;

/**
 * 
 */
public class Mysql implements Ipersistence {

    /**
     * Default constructor
     */
    public Mysql() {
    }


    /**
     * @param object
     */
    @Override
    public void save(Object object) {
        System.out.println("Save in MYSQL");
    }

}
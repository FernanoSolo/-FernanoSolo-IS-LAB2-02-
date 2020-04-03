package gt.edu.umg.ingenieria.sistemas.ingsoftware.dependencias;

import java.util.*;

/**
 * 
 */
public class App {

    /**
     * Default constructor
     */
    public App() {
    }



    /**
     * @param args
     */
    public static void main(String[] args) {
    
        Person person = new Person();
        person.setName("Juan");
        Mysql mysql = new Mysql();
        
        ServicePerson per = new ServicePerson(mysql);
        per.savePerson(person);
        
  
  } 

}
/*
 * The following imports come from the hibernate library and allow us to access the XML files necessary to write our object
 * to the database. This way new employees can be added to the database. 
 */
import org.hibernate.*; 
import org.hibernate.cfg.Configuration;  

public class StoreData {  
public static void main(String[] args) {  
     try { 
    //creating configuration object that populates the data from our XML file.
    Configuration cfg=new Configuration();  
    cfg.configure("hibernate.cfg.xml");

      
    //creating session factory object
    SessionFactory factory=cfg.buildSessionFactory();  
      
    //Using the session object we will open a session with the 
    Session session=factory.openSession();  
      
    //creating transaction object that will handle our transactions in the application with the database.
    Transaction t=session.beginTransaction();  
         
    //Create a new employee
    Employee e1=new Employee();  
    e1.setId(24);  
    e1.setFirstName("Zach");  
    e1.setLastName("Gay");  
    e1.setMiddleInitial("R");
    e1.setPosition("Village Idiot");
      
    session.persist(e1);//persisting the object so that when we commit the transaction it is saved to the database.
    
    t.commit();//transaction is committed to the database.
    
    session.close();  //close the transaction.
    System.out.println("Transaction was successful!");
     }catch (Exception e) {
    	 System.out.println("Ugh.. Try agian");
     }
     
      
}  
} 


package employeeDAOinterface;



import java.util.List;
import java.util.Optional;
//import modelobject.EmployeeObject;


public interface DAOInterface<Object> {
        
        public List<Object> getAllObjects();
        
        public Object getCertainObject(Integer id);
        
        public List<Object> addNewObject(Object obj);
        
        public List<Object> updateObjectInfo(Object obj);
        
        public List<Object> deleteObject(Integer id);
    
}
 


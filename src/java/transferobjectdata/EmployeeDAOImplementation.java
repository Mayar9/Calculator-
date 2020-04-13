
package transferobjectdata;

import employeeDAOinterface.DAOInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import modelobject.EmployeeObject;


public class EmployeeDAOImplementation implements DAOInterface<EmployeeObject>
{

    static EmployeeDAOImplementation dao = new EmployeeDAOImplementation();
    
    private List<EmployeeObject> employees;
    
    public static EmployeeDAOImplementation getDao ()
    {
        return dao;
    }
    
    
    public EmployeeDAOImplementation(){
        
        employees = new ArrayList<>();
        //Testing Class constructor
        EmployeeObject emp1 = new EmployeeObject(1,"Ahmed","01115860927",3000f,"CEO");
        employees.add(emp1);
        EmployeeObject emp2 = new EmployeeObject(2,"Mohamed","0111541111927",3400f,"CAO");
        employees.add(emp2);
        
    }
    
    @Override
    public List<EmployeeObject> getAllObjects() {
        return employees;
    }

    @Override
    public EmployeeObject getCertainObject(Integer id) 
    {
        id-=1;
        if (id >= 0 && id < employees.size())
        {
            return employees.get(id);
        }
        else 
        {
            return null;
        }
        
    }

    @Override
    public List<EmployeeObject> addNewObject(EmployeeObject obj) {
        employees.add(obj);
        return employees;
    }

    @Override
    public List<EmployeeObject> updateObjectInfo(EmployeeObject obj) {
        
        EmployeeObject carrier;
        for(EmployeeObject selectedobj : employees)
        {
            if(selectedobj.getId().equals(obj.getId()))
            {
                employees.remove(selectedobj);
                employees.add(obj);
//                selectedobj.setName(obj.getName());
//                selectedobj.setPhone(obj.getPhone());
//                selectedobj.setSalary(obj.getSalary());
//                selectedobj.setPosition(obj.getPosition());
//                employees.add(selectedobj);
            }
        } 
        return employees;
    }

    @Override
    public List<EmployeeObject> deleteObject(Integer id) {
        EmployeeObject deletedEmployee = employees.get(id);
        employees.remove(deletedEmployee);
        return employees;
    }
    
}

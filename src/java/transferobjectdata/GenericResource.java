package transferobjectdata;

import java.util.List;
import java.util.Optional;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import modelobject.EmployeeObject;


@Path("generic")
public class GenericResource {
    
//    EmployeeDAOImplementation dao = new EmployeeDAOImplementation();
    EmployeeDAOImplementation dao = EmployeeDAOImplementation.getDao();
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<EmployeeObject> getAllEmployee(){  
        return dao.getAllObjects();
    }
    
    @GET
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public EmployeeObject getEmployee(@PathParam("id") String id){
//        String EmployeeId = String.format("%d",id);
//        return dao.getCertainObject(EmployeeId);
        return dao.getCertainObject(Integer.parseInt(id));
    }
    
    
    @DELETE
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public List<EmployeeObject> deleteEmployee(@PathParam("id") String id){
        
            return dao.deleteObject(Integer.parseInt(id));
    }
    
    
    @POST
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public List<EmployeeObject> addEmployee(EmployeeObject newEmployee){
            return dao.addNewObject(newEmployee);
    }
    
    
//    @Produces({MediaType.APPLICATION_JSON})
    @PUT
    @Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public List<EmployeeObject> updateEmployeeInfo(EmployeeObject selectedEmployee){
        return dao.updateObjectInfo(selectedEmployee);
    }
}


package modelobject;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "EmployeeObject")
public class EmployeeObject {
    
    private Integer id;
    private String name;
    private String phone;
    private Float salary;
    private String position;
    
    public EmployeeObject(){
    }
    
    public EmployeeObject(Integer _id,String _name,String _phone,Float _salary,String _position){
        this.id = _id;
        this.name = _name;
        this.phone = _phone;
        this.salary = _salary;
        this.position = _position;   
    }
    
    public void setId(Integer _id){
        this.id = _id;
    }
    
    public void setName(String _name){
        this.name = _name;
    }
    
    public void setPhone(String _phone){
        this.phone = _phone;
    }
    
    public void setSalary(Float _salary){
        this.salary = _salary;
    }
    
    public void setPosition(String _position){
        this.position = _position;
    }
    
    public Integer getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public Float getSalary(){
        return salary;
    }
    
    public String getPosition(){
        return position;
    }
}

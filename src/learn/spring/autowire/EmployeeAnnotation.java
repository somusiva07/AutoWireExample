package learn.spring.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeAnnotation {
    private int eid;
    private String ename;
    @Autowired
    private DepartmentAnnotation department;

    public EmployeeAnnotation() {

    }

    /**
     * This constructor is used for autowire by constructor
     * @param department
     */
    //@Autowired
    public EmployeeAnnotation(DepartmentAnnotation department) {
        System.out.println("*** Autowiring by using constructor ***");
        this.department = department;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public DepartmentAnnotation getDepartment() {
        return department;
    }

    //@Autowired
    public void setDepartment(DepartmentAnnotation department) {
    	System.out.println("*** Autowiring by using setter ***");
        this.department = department;
    }

    /**
     * Prints employee details to the console
     */
    public void showEmployeeDetails(){
        System.out.println("Employee Id : " + eid);
        System.out.println("Employee Name : " + ename);
        department.setDeptName("Autowiring department");
        System.out.println("Department : " + department.getDeptName());
    }
}
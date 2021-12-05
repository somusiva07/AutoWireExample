package learn.spring.autowire;

import org.springframework.stereotype.Component;

@Component
public class DepartmentAnnotation {
    private String deptName;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
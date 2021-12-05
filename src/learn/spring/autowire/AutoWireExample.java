package learn.spring.autowire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class AutoWireExample {

		public static void main(String[] args) {
			ConfigurableApplicationContext ctx = SpringApplication.run(AutoWireExample.class, args);
			ApplicationContext context = new ClassPathXmlApplicationContext("autoWire.xml");
			
			
			
			/*
			 * System.out.println("*** Example Using byName autowiring mode ***"); Employee
			 * emp = context.getBean("employeeByName", Employee.class); emp.setEid(101);
			 * emp.setEname("Spring Framework Guru"); emp.showEmployeeDetails();
			 */
			 
			 
			 

			
				
			
			/*
			 * System.out.println("\n*** Example Using byType autowiring mode ***");
			 * Employee emp1 = context.getBean("employeeByType", Employee.class);
			 * emp1.setEid(102); emp1.setEname("Java Framework Guru");
			 * emp1.showEmployeeDetails();
			 */
			 
				 
			  
				
			/*
			 * System.out.println("\n*** Example Using constructor autowiring mode ***");
			 * Employee emp2 = context.getBean("employeeConstructor", Employee.class);
			 * emp2.setEid(103); emp2.setEname("AWS Framework Guru");
			 * emp2.showEmployeeDetails();
			 */
				 
			 

			System.out.println("\n*** Example Using @Autowire annotation on property ***");
			EmployeeAnnotation employeeBean = ctx.getBean(EmployeeAnnotation.class);
			employeeBean.setEid(104);
			employeeBean.setEname("Spring Framework Guru");
			employeeBean.showEmployeeDetails();
		}


}

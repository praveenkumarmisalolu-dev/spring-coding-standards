package com.brinta.tutumridez;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.brinta.tutumridez.entity.bank.User;
import com.brinta.tutumridez.repository.UserRepository;

@SpringBootApplication
public class SpringCodingStandardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCodingStandardsApplication.class, args);
	}

	@Autowired
	UserRepository userRepository;

	@Bean
	CommandLineRunner loadData() {

		return args -> {

//			BankAccount bankAccount = new BankAccount();
//			bankAccount.setAccountNumber("SBI123456789");
//			bankAccount.setBalance(1000000000.00d);

//			for (int i = 0; i < 100; i++) {
			User user = new User();
			user.setName("Praveen Kumar Misalolu_");
			userRepository.save(user);

//				Optional<User> byId = userRepository.findById(1l);
//				user.setId(byId.get().getId());
//				user.setName("Praveen Kumar");
//				userRepository.save(user);
//			}

		};
	}

//	
//	@Autowired
//	private DepartmentRepository departmentRepository;
//    
//	@Bean
//
//	public CommandLineRunner loadData() {
//
//		return args ->{
//			
//			
//			Department department = new Department();
//			department.setName("Logistics");
//
//			Employee employee = new Employee();
//			employee.setName("Veeresh");
//			employee.setDepartment(department);
//			
//			Employee employee2 = new Employee();
//			employee2.setName("Eeshwar");
//			employee.setDepartment(department);
//
//			Employee employee3 = new Employee();
//			employee3.setName("Vignesh");
//			employee.setDepartment(department);
//
//			Employee employee4 = new Employee();
//			employee4.setName("Mrunal");
//			employee.setDepartment(department);
//			
//			List<Employee> listOfEmployees = List.of(employee,employee2,employee3,employee4);
//			
//			department.setEmployee(listOfEmployees);
//
//			departmentRepository.save(department);
//		};
//	}

}

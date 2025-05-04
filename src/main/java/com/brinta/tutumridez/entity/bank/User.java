package com.brinta.tutumridez.entity.bank;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Users",catalog = "Employee_Systems")
public class User {		
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
//	@Column(length = 10, name = "id" )
	private Long id;
	
		
	@Column(name = "user_name")
	private String name;
	
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "account_id",referencedColumnName = "id")
//	private BankAccount bankAccount;

}

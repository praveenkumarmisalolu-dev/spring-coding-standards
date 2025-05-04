package com.brinta.tutumridez.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Passport {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String passportNumber;
//
//    @OneToOne(mappedBy = "passport", cascade = CascadeType.ALL)
//    private Citizen citizen;

    // Getters and Setters
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String passportNumber;
    
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "passport")
    private Citizen citizen;
    
    
    
    
    
}

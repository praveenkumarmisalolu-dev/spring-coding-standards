package com.brinta.tutumridez.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brinta.tutumridez.entity.bank.User;


public interface UserRepository extends JpaRepository<User, Long> {

}

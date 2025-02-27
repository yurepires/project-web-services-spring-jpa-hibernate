package com.educandoweb.course.repositories;

import com.educandoweb.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

// @Repository não é necessário, pois a interface UserRepository já está herdando do JpaRepository que já está registrada como Component do Spring
public interface UserRepository extends JpaRepository<User, Long> {

}

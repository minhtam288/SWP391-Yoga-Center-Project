package com.fptyoga.yogacenter.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fptyoga.yogacenter.Entity.User;



@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    List<User> findByRole_RoleidAndStatus(Long roleId, Boolean status);
    
    User findByEmailAndPassword(String email, String password);

    List<User> findByStatus(Boolean status);

    boolean existsByEmail(String email);
}

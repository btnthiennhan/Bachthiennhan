/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra.KT.repository;

/**
 *
 * @author Admin
 */
import kiemtra.KT.model.User;
import org.springframework.data.jpa.repository.JpaRepository; 
public interface UserRepository extends JpaRepository<User, Long> { 
    User findByUsername(String username); 
} 
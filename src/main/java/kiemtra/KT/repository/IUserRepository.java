/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra.KT.repository;

/**
 *
 * @author Admin
 */
 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import java.util.Optional; 
import kiemtra.KT.model.User;
@Repository 
public interface IUserRepository extends JpaRepository<User, String> { 
Optional<User> findByUsername(String username); 
}
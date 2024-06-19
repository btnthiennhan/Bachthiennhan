/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra.KT.repository;

/**
 *
 * @author Admin
 */
import kiemtra.KT.model.Role;
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
@Repository 
public interface IRoleRepository extends JpaRepository<Role, Long>{ 
Role findRoleById(Long id); 
} 
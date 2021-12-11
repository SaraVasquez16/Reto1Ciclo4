/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto1_C4;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author User
 */
public interface UserCrudRepository extends CrudRepository <User, Integer>{
    Optional <User> findByEmail (String email);
    Optional <User> findByEmailAndPassword (String email, String password);
    
}

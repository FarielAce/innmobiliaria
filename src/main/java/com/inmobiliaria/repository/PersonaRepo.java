
package com.inmobiliaria.repository;

import com.inmobiliaria.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**

 * @author fernando
 */
@Repository
public interface PersonaRepo extends JpaRepository<Persona, Integer>{
    
}

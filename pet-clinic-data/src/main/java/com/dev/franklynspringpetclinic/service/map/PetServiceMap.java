/**
 * Created by Franklyn Agboma
 */
package com.dev.franklynspringpetclinic.service.map;

import com.dev.franklynspringpetclinic.model.Pet;
import com.dev.franklynspringpetclinic.service.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceMap
        extends AbstractMapService<Pet, Long>
        implements PetService {
    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }
}

/**
 * Created by Franklyn Agboma
 */
package com.dev.franklynspringpetclinic.service.map;

import com.dev.franklynspringpetclinic.model.Pet;
import com.dev.franklynspringpetclinic.service.CrudService;

import java.util.Set;

public class PetServiceMap
        extends AbstractMapService<Pet, Long>
        implements CrudService<Pet, Long> {
    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
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

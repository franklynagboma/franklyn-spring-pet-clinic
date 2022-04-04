/**
 * Created by Franklyn Agboma
 */
package com.dev.franklynspringpetclinic.service;

import com.dev.franklynspringpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}

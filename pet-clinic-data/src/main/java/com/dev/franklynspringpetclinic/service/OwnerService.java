/**
 * Created by Franklyn Agboma
 */
package com.dev.franklynspringpetclinic.service;

import com.dev.franklynspringpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}

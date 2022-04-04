/**
 * Created by Franklyn Agboma
 */
package com.dev.franklynspringpetclinic.service;

import com.dev.franklynspringpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}

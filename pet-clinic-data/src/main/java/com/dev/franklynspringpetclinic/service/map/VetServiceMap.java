/**
 * Created by Franklyn Agboma
 */
package com.dev.franklynspringpetclinic.service.map;

import com.dev.franklynspringpetclinic.model.Vet;
import com.dev.franklynspringpetclinic.service.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap 
        extends AbstractMapService<Vet, Long>
        implements VetService {
    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }
}

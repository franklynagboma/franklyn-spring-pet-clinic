/**
 * Created by Franklyn Agboma
 */
package com.dev.franklynspringpetclinic.service.map;

import com.dev.franklynspringpetclinic.model.Owner;
import com.dev.franklynspringpetclinic.service.CrudService;

import java.util.Set;

public class OwnerServiceMap
        extends AbstractMapService<Owner, Long>
        implements CrudService<Owner, Long> {

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }
}

/**
 * Created by Franklyn Agboma
 */
package com.dev.franklynspringpetclinic.service;

import com.dev.franklynspringpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}

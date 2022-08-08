package com.adotar.adoteumpet.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adotar.adoteumpet.core.Exceptions.PetNotFoundException;
import com.adotar.adoteumpet.core.models.Pet;

public interface PetRepository extends JpaRepository<Pet, Long> {

    default Pet findByIdOrElseThrow(Long id){
    return findById(id)
    .orElseThrow(PetNotFoundException:: new);
    }

}

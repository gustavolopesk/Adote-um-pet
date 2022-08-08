package com.adotar.adoteumpet.api.pet.mappers;


import org.springframework.stereotype.Component;

import com.adotar.adoteumpet.api.pet.dtos.PetRequest;
import com.adotar.adoteumpet.api.pet.dtos.PetResponse;
import com.adotar.adoteumpet.core.models.Pet;

@Component
public class PetMapper {
    
    public PetResponse toResponse(Pet pet) {
        return PetResponse.builder()
        .id(pet.getId())
        .nome(pet.getNome())
        .historia(pet.getHistoria())
        .foto(pet.getFoto())
        .build();
    }       
    
    public Pet toModel(PetRequest petRequest){
        return Pet.builder()
        .nome(petRequest.getNome())
        .historia(petRequest.getHistoria())
        .foto(petRequest.getFoto())
        .build();
    }
    
}

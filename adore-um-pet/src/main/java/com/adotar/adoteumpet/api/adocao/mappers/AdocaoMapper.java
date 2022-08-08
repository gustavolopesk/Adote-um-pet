package com.adotar.adoteumpet.api.adocao.mappers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.adotar.adoteumpet.api.adocao.dtos.AdocaoRequest;
import com.adotar.adoteumpet.api.adocao.dtos.AdocaoResponse;
import com.adotar.adoteumpet.api.pet.mappers.PetMapper;
import com.adotar.adoteumpet.core.models.Adocao;
import com.adotar.adoteumpet.core.repositories.PetRepository;

@Component
public class AdocaoMapper {

    @Autowired
    private PetRepository petRepository;

    @Autowired
    private PetMapper petMapper;
    
    public Adocao toModel(AdocaoRequest adocaoRequest){
        return Adocao.builder()
        .email(adocaoRequest.getEmail())
        .valor(adocaoRequest.getValor())
        .pet(petRepository.findByIdOrElseThrow(adocaoRequest.getPetId()))
        .build();

    }

    public AdocaoResponse toResponse(Adocao adocao){
        return AdocaoResponse.builder()
        .id(adocao.getId())
        .email(adocao.getEmail())
        .valor(adocao.getValor())
        .pet(petMapper.toResponse(adocao.getPet()))
        .build();
    }
}

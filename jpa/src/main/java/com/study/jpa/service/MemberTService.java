package com.study.jpa.service;

import com.study.jpa.domain.entity.MemberTEntity;
import com.study.jpa.domain.repository.MemberTRepository;
import com.study.jpa.dto.MemberDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberTService {

    private final MemberTRepository memberTRepository;

    private final ModelMapper modelMapper;

//    public MemberDTO selectMemberList(){
//        List< memberTRepository.findAll();
//        modelMapper.map();
//        return
//    }

    public MemberDTO selectMemberById(String userId){
        MemberTEntity entity = memberTRepository.findBymId(userId);
        return modelMapper.map(entity, MemberDTO.class);
    }

}

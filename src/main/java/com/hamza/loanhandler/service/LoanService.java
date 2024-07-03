package com.hamza.loanhandler.service;

import com.hamza.loanhandler.dto.LoanDTO;
import com.hamza.loanhandler.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class LoanService {

    private final LoanRepository loanRepository;

    @Autowired
    public LoanService(LoanRepository loanRepository){
        this.loanRepository = loanRepository;
    }

    public Mono<LoanDTO> getLoanDetails(String caseId){
        LoanDTO loanDTO = loanRepository.findByCaseId(caseId);
        return loanDTO != null ? Mono.just(loanDTO) : Mono.empty();
    }

    //simulate fetching details based on caseId
//    public LoanDTO getLoanDetails(String caseId){
//        return new LoanDTO("Mock Deal Name", "Mock Deal ID", caseId, "Mock R ID");
//    }
}

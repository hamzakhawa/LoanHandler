package com.hamza.loanhandler.controller;
import com.hamza.loanhandler.dto.LoanDTO;
import com.hamza.loanhandler.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.Date;

@RestController
@RequestMapping("/api/loans")
public class LoanController {

    private final LoanService loanService;

    @Autowired
    public LoanController(LoanService loanService){
        this.loanService = loanService;
    }
    @GetMapping("/{caseId}")
    public Mono<ResponseEntity<LoanDTO>> getLoanByCaseId(@PathVariable String caseId){
        return loanService.getLoanDetails(caseId).map(ResponseEntity::ok).defaultIfEmpty(ResponseEntity.notFound().build());

    }

//    public ResponseEntity<LoanDTO> getLoanByCaseId(@PathVariable String caseId){
//        //logic to fetch loan details based on caseId
//        LoanDTO loanDetails = loanService.getLoanDetails((caseId));
//        return ResponseEntity.ok(loanDetails);
//    }





}

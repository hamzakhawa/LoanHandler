package com.hamza.loanhandler.repository;
import com.hamza.loanhandler.dto.LoanDTO;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class LoanRepository {

    private final Map<String, LoanDTO> loanData = new HashMap<>();

    public LoanRepository(){
        loanData.put("675849", new LoanDTO("Mariott2024", "153380","675849", "r433" ));
        loanData.put("109283", new LoanDTO("Trek2024", "783305","109283", "r007" ));

    }

    public LoanDTO findByCaseId(String caseId){
        return loanData.get(caseId);
    }

}

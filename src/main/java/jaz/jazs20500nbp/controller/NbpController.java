package jaz.jazs20500nbp.controller;

import jaz.jazs20500nbp.service.NbpService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NbpController {
    private final NbpService nbpService;

    public NbpController(NbpService nbpService) {
        this.nbpService = nbpService;
    }

    @GetMapping("/nbp/{currency}/{startDate}/{endDate}")
    public ResponseEntity<Double> getAvgCurrency(@PathVariable String currency,@PathVariable String startDate, @PathVariable String endDate){
        return ResponseEntity.ok(nbpService.getAvgCurrency(currency,startDate,endDate));
    }

}

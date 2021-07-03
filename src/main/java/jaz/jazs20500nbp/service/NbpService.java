package jaz.jazs20500nbp.service;

import jaz.jazs20500nbp.model.Rate;
import jaz.jazs20500nbp.model.Root;
import jaz.jazs20500nbp.repository.NbpRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class NbpService {
    private RestTemplate restTemplate;
    private final NbpRepository nbpRepository;

    public NbpService(RestTemplate restTemplate, NbpRepository nbpRepository) {
        this.restTemplate = restTemplate;
        this.nbpRepository = nbpRepository;
    }

    public Root getAvgList(String currency, String startData, String endData){
        String url = String.format("https://api.nbp.pl/api/exchangerates/rates/a/%d/%s/%s/?format=json",currency,startData,endData);
        return restTemplate.getForObject(url,Root.class);
    }

    public double getAvgCurrency(String currency,String startData, String endData){
        Root root = getAvgList(currency,startData,endData);
        List<Rate> rates = root.getRates();
        double sum=0;
        for(Rate rat :rates){
            sum +=rat.getMid();
        }
        double avg = sum/rates.size();
        return avg;
    }



}

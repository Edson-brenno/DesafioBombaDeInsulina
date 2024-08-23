package com.spring.Service;

import java.util.Random;

/**
 * This service it's responsible to simulate a work of a sensor
 * Este servico procura simular o funcionamento de um sensor de glicose*/
public class SensorService {

    // This static method it'll generate random information of the sugar information
    // Este metodo vai gerar nivéis diferentes do nivel de açucar
    public int obterInformacoesAcucarNoSangue(){
        return new Random().nextInt(80,350);
    }
}

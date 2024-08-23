package com.spring.Service;

/**
 * This class is an abstraction of insulin pump
 * Esta classe abistrai um bomba de insulina */
public class PumpService {

    // Method to inject insulin
    // Metodo para simular injeção de insulina
    public void injectInsulin(float totalOfInsulin){
        System.out.printf("Injetando %.2f ml de insulina \n", totalOfInsulin);
    }
}

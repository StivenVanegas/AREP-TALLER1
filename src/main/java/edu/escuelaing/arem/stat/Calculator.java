/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.stat;

import java.util.List;

/**
 *
 * @author StivenVanegas
 */
public class Calculator {
    
    public static Double mean(List<Double> list){
        
        Double mean = 0.0;
        for(Double d : list){
            mean += d;
        }
        return mean / list.size();
    }
    
    public static Double stdDev(){
        return 0.0;
    }
    
}

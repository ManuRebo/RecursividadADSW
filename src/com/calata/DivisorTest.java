package com.calata;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class DivisorTest {

    List<Integer> dividendosPrueba = new ArrayList<>();
    List<Integer> divisoresPrueba = new ArrayList<>();

    @Before
    public void setUp(){

        //Llenamos las listas
        for(Integer i = new Integer(1);i < 10000;i++){
            dividendosPrueba.add(i);
            if(i <= 1000){
                divisoresPrueba.add(i);
            }
        }

    }


    @Test
    public void dividir() throws Exception {
        for(Integer dividendos : dividendosPrueba){
            for(Integer divisores : divisoresPrueba){
                assertEquals((int)(dividendos/divisores),Divisor.dividir(dividendos,divisores));
            }
        }

    }

}
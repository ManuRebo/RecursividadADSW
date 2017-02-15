package com.calata;

/**
 * Created by jcala on 15/02/2017.
 */
public class Divisor{

    public static int dividir(int dividendo, int divisor){
        int resto = dividendo-divisor;
        if(resto < 0){
            return 0;
        }
        if(resto < divisor){
            return 1;
        }else{
            return 1 + dividir(resto,divisor);
        }
    }

    /*public static Integer dividirInteger(Integer dividendo, Integer divisor){
        int divi = dividendo;
    }*/
}

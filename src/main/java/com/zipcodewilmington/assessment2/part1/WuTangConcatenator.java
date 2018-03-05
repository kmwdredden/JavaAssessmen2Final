package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    Integer input;

    public WuTangConcatenator(Integer input){

        this.input = input;
    }

    public boolean isWu(){
        //PseudoCode
        //find multiples of input 3 and
        if(input%3==0){
            return true;
        }
        return false;


    }

    public boolean isTang(){
        if(input%5==0){
            return true;
        }
        return false;
    }

    public boolean isWuTang(){

        if(input%3==0 & input%5==0){
            return true;
        }
        return false;
    }
}

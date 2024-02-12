package com.careerit.day11;

public class Retrievecsv {
    public String state;
    public String county;
    public int cases;
    public Retrievecsv(){
        System.out.println("hello package");
    }
    public Retrievecsv(String state,String county,int cases){
        this.state=state;
        this.county=county;
        this.cases=cases;

    }

    public void showDetails(){
        System.out.println(state+" "+county+" "+cases);
    }
}

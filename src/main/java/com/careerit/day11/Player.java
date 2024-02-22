package com.careerit.day11;

public class Player {

        private String state;
        private String country;
        private int cases;

        public Player(String state,String country, int cases){
            this.state=state;
            this.country = country;
            this.cases = cases;//this
        }
        public void showDetails(){
            System.out.println(state + " "+country + " "+cases);
        }


    }


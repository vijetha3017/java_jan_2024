package com.careerit.day11;


public class PlayerStats {
    public static void main(String[] args) {
        String line1= "Ohio,Hamilton,3288";
        String line2= "Arizona,Maricopa,6766";
        String line3= "Georgia,Clarke,6391";


        Player player1 = converRowToPlayer(line1);
        Player player2 = converRowToPlayer(line2);
        Player player3 = converRowToPlayer(line3);


        Player players[]=new Player[]{player1,player2,player3};
        for(Player player : players)
        {
            player.showDetails();
        }
    }
    private static Player converRowToPlayer(String row){
        String arr[]=row.split(",") ;
        String state = arr[0];
        String country = arr[1];
        int cases=Integer.parseInt(arr[2]);
        Player player= new Player(state,country,cases);
        return player;


    }
}

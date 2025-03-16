package zad28;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        List<Furniture> furnitures = new ArrayList<>();
        String[] input = inp.nextLine().split(" ");

        while(!input[0].equals("END")){
            if(input[0].equals("table")){
                Table table = new Table(input[0], Double.parseDouble(input[1]));
                furnitures.add(table);
            }

            if(input[0].equals("cabinet")){
                Cabinet cabinet = new Cabinet(input[0], Double.parseDouble(input[1]), Integer.parseInt(input[2]));
                furnitures.add(cabinet);
            }
            input = inp.nextLine().split(" ");
        }


        System.out.println("All tables:");
        for(Furniture furniture:furnitures){
            if(furniture instanceof Table)System.out.println(furniture.toString());
        }

        System.out.println("All cabinets:");
        for(Furniture furniture:furnitures){
            if(furniture instanceof Cabinet)System.out.println(furniture.toString());
        }
    }


}

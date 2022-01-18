package com.company;
import java.util.Scanner;

public class Application {


    public boolean startApp(){
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Fitness Kalendář:");
        System.out.println();
        System.out.println("Vyber si možnost");
        System.out.println();
        System.out.println("1) Zapís nové události\n2) Čtení diáře\n3) Editace diáře\n4) Smazání událostí\n5) Vypnutí aplikace");

        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                System.out.println("Vytvoření zápisu");
                System.out.println();
                new Application().createEvent();
                break;
            case 2:
                System.out.println("Čtení zápisu");
                System.out.println();
                new Application().readEvent();
                break;
            case 3:
                System.out.println(" ");
                break;
            case 4:
                System.out.println(" ");
                break;
            case 5:
                System.exit(5);
                break;
        }

        System.out.println();

        return false;
    }

    public boolean createEvent(){

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Jaké časové období chceš editovat");
        System.out.println();
        System.out.println("1) Ráno\n2) Dopoledne\n3) Poledne\n4) Odpoledne\n5) Večer");

         switch(scanner.nextInt()){
             case 1:
                 System.out.println("Název cviku");
                 TimeLine.MORNING.setName(scanner2.nextLine());
                 System.out.println("Počet spálených kalorií");
                 TimeLine.MORNING.setCal(scanner.nextInt());
                 break;
             case 2:
                 System.out.println("Název cviku");
                 TimeLine.FORENOON.setName(scanner2.nextLine());
                 System.out.println("Počet spálených kalorií");
                 TimeLine.FORENOON.setCal(scanner.nextInt());
                 break;
             case 3:
                 System.out.println("Název cviku");
                 TimeLine.NOON.setName(scanner2.nextLine());
                 System.out.println("Počet spálených kalorií");
                 TimeLine.NOON.setCal(scanner.nextInt());
                 break;
             case 4:
                 System.out.println("Název cviku");
                 TimeLine.AFTERNOON.setName(scanner2.nextLine());
                 System.out.println("Počet spálených kalorií");
                 TimeLine.AFTERNOON.setCal(scanner.nextInt());
                 break;
             case 5:
                 System.out.println("Název cviku");
                 TimeLine.EVENING.setName(scanner2.nextLine());
                 System.out.println("Počet spálených kalorií");
                 TimeLine.EVENING.setCal(scanner.nextInt());
                 break;
         }
         return startApp();

    }

    public boolean readEvent() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Z jaké části dne si přeješ vypsat záznamy");
        System.out.println();
        System.out.println("1) Ráno\n2) Dopoledne\n3) Poledne\n4) Odpoledne\n5) Večer");
        switch (scanner.nextInt()) {
            case 1:
                System.out.println(TimeLine.MORNING);
                break;
            case 2:
                System.out.println(TimeLine.FORENOON);
                break;
            case 3:
                System.out.println(TimeLine.NOON);
                break;
            case 4:
                System.out.println(TimeLine.AFTERNOON);
                break;
            case 5:
                System.out.println(TimeLine.EVENING);
                break;
        }
        return startApp();
    }

}

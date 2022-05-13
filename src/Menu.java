import Character.Character;
import Character.Warrior;
import Character.Wizard;


import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);



    public void beginGame() {
        System.out.println("\n" +
                " (                                                                                      \n" +
                " )\\ )                                           )    (                                  \n" +
                "(()/(                 (                  (   ( /(    )\\ )  (       )  (  (              \n" +
                " /(_))   (    (       )\\   (    (       ))\\  )\\())  (()/(  )(   ( /(  )\\))(  (    (     \n" +
                "(_))_    )\\   )\\ )   ((_)  )\\   )\\ )   /((_)(_))/    ((_))(()\\  )(_))((_))\\  )\\   )\\ )  \n" +
                " |   \\  ((_) _(_/(  _ | | ((_) _(_/(  (_))  | |_     _| |  ((_)((_)_  (()(_)((_) _(_/(  \n" +
                " | |) |/ _ \\| ' \\))| || |/ _ \\| ' \\)) / -_) |  _|  / _` | | '_|/ _` |/ _` |/ _ \\| ' \\)) \n" +
                " |___/ \\___/|_||_|  \\__/ \\___/|_||_|  \\___|  \\__|  \\__,_| |_|  \\__,_|\\__, |\\___/|_||_|  \n" +
                "                                                                     |___/              \n");


        System.out.println("Bienvenue aventurier.re dans le jeu 'DONJON ET DRAGON'. ");


        System.out.println("Avant tout, tu as le choix de tes actions.");




        System.out.println("Avant tout, tu peux choisir les charactéristiques de ton personnage. Pour cela, c'est très simple. Il te suffit de suivre les consignes qui te sont indiqués.");




    }


    public Character chooseTypeOfHero() {


        System.out.println("Quel hero es tu? (g = guerrier, m = magicien )");
        String choice = sc.nextLine();

        while (!choice.equals("g") && !choice.equals("m")) {

            System.out.println("Quel hero es tu? (g = guerrier.re, m = magicien.ne )");
            choice = sc.nextLine();


        }
        System.out.println("Comment tu t'appelle? Si tu décide ne pas choisir, tu auras un nom par défault");
        String nameHero = setNameHero();


        System.out.println("quelle est ta force? Ta force doit être comprise entre 5 et 10 (je te conseille fortement de suivre cette règle)");


        int strongHero = setStrongHero();

        if (strongHero > 10 || strongHero < 5) {
            System.out.println("Dommage le pouilleux...");
            nameHero = "Pouilleux";
        }


        System.out.println("combien de vies à tu? Tu dois choisir une valeur entre 3 et 6");


        int life = setLifeHero();

        if (life < 3 || life > 6) {
            System.out.println("Oups tes mains ont glissés je crois...");
            System.out.println("Recommence? Tu dois choisir une valeur entre 3 et 6");

            System.out.println("Ma patience a des limites.");
            nameHero = "Connard";


        }



        if (choice.equals("m")) {

            System.out.println("Tu es un.e  magicien.ne. La magie n'a aucun secret pour toi. ");

            Wizard hero = new Wizard(nameHero, strongHero, life);
            System.out.println("Bonjour " + hero.getName() + " , tu as une force de " + hero.getStrong() + " , tu as " + hero.getLifeLevel() + " vies");
            return hero;

        } else if (choice.equals("g")) {

            System.out.println("Tu n'es pas du genre à faire des marches pacifistes pour le climat. Tu es un.e guerrier.re. ");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

            Warrior hero = new Warrior(nameHero, strongHero, life);
            System.out.println("Tu t'appelle " + hero.getName() + ". Tu as une force de " + hero.getStrong() + " et tu as " + hero.getLifeLevel() + " vies");
            return hero;

        }
        Warrior hero = new Warrior("Harry", 8, 7);
        return hero;

    }

    public void exit() {

        Exit exit = new Exit();
        exit.chooseExit();
    }

    public String setNameHero() {


        String nameHero = sc.nextLine();
        return nameHero;

    }



    public int setStrongHero() {

        try {
            int strong = Integer.parseInt(sc.nextLine());
            return strong;
        } catch (NumberFormatException e) {
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Le caractère choisit n'est pas un chiffre, une valeur par défaut sera attribué");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        }
        int strong = 5;
        return strong;

    }

    public int setLifeHero() {


        try {
            int life = Integer.parseInt(sc.nextLine());
            return life;
        } catch (NumberFormatException e) {
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Le caractère choisit n'est pas un chiffre, une valeur par défaut sera attribué");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            int life = 5;
            return life;
        }


    }


}

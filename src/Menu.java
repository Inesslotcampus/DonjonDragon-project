import Character.Character;
import Character.Warrior;
import Character.Wizard;



import java.util.Scanner;

/**
 * la classe menu, qui permet de choisir personnage, sortir du jeu

 */

public class Menu {

    /**
    * premier attribut sc de type Scanner qui instancie l'objet Scanner

 */
    Scanner sc = new Scanner(System.in);
    JDBC jdbc = new JDBC();

    /**
     * la méthode beginGame qui permet d'afficher le début du jeu
     */

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

    /**
     * la méthode chooseTypeOfHero permet de choisir le type de héro, changer ses caractéristiques et instancier un hero;
     * @return
     */



    public Character chooseTypeOfHero() {


        System.out.println("Quel hero es tu? (g = guerrier.re, m = magicien.ne )");
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

            strongHero =5;

            nameHero = "Pouilleux";
        }


        System.out.println("combien de vies à tu? Tu dois choisir une valeur entre 3 et 6");


        int life = setLifeHero();

        if (life < 3 || life > 6) {
            System.out.println("Oups tes mains ont glissés je crois...");
            System.out.println("Recommence? Tu dois choisir une valeur entre 3 et 6");

            System.out.println("Ma patience a des limites.");
            life = 3;
            nameHero = "Connard";


        }



        if (choice.equals("m")) {

            System.out.println("Tu es un.e  magicien.ne. La magie n'a aucun secret pour toi. ");

            Wizard hero = new Wizard(nameHero, strongHero, life);
            System.out.println("Bonjour " + hero.getName() + " , tu as une force de " + hero.getStrong() + " , tu as " + hero.getLifeLevel() + " vies");
            jdbc.connectToBDD("Wizard", nameHero, life, strongHero);
            return hero;

        } else if (choice.equals("g")) {

            System.out.println("Tu n'es pas du genre à faire des marches pacifistes pour le climat. Tu es un.e guerrier.re. ");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

            Warrior hero = new Warrior(nameHero, strongHero, life);
            System.out.println("Tu t'appelle " + hero.getName() + ". Tu as une force de " + hero.getStrong() + " et tu as " + hero.getLifeLevel() + " vies");
            jdbc.connectToBDD("Warrior", hero.getName(), hero.getLifeLevel(), hero.getStrong());
            return hero;



        }
        Warrior hero = new Warrior("Harry", 8, 7);
        return hero;

    }

    /**
     * la méthode exit permet au personnage de sortir du jeu
     */

    public void exit() {

        Exit exit = new Exit();
        exit.chooseExit();
    }

    /**
     * La methode setNameHero permet de modifier le nom du personnage avec la variable nameHero qui prend le résultat qu'il a appelé
     * @return String nameHero
     */

    public String setNameHero() {


        String nameHero = sc.nextLine();
        return nameHero;

    }

    /**
     * La methode setStrongHero permet de modifier la force  du personnage avec la variable Strong qui prend le résultat qu'il a appelé
     * @throws NumberFormatException
     * @return int strong
     */

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

    /**
     * La methode setLevelHero permet de modifier le niveau de vie  du personnage avec la variable level qui prend le résultat qu'il a appelé
     * @throws NumberFormatException
     * @return int level
     */

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

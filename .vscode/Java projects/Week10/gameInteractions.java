package Week10;
import java.util.Scanner;

public class gameInteractions {

    // variables set to private

    private String inputChoice;

    private String inputCharacter;

    private String inputWeapon;

    // character options

    Character gardenerGill = new Character("Gardener Gill", 1, 1, 1, "Secateurs");

    Character explorerEric = new Character("Explorer Eric", 1, 1, 0, "Sharp Spade");

    Character daringDelilah = new Character("Daring Delilah", 2, 1, 3, "Extra Plant poison");

    // start of the game

    public void start() {

        System.out.println(
                "Welcome to the Gory Gardens Game! In secret the RHS has been developing a new type of plant food"
                        + "\n"
                        + " for their public gardens, but the new engineered food has had unexpected effects." + "\n"
                        + " The plants have now grown out of control! Many have become carnivorous and" + "\n"
                        + " are dangerous to human life.  Unfortunately some gardeners and lab assistants" + "\n"
                        + " have been trapped inside the garden and we need you to get to them and help them find the way out!"
                        + "\n"
                        + " You will need to try to avoid the dangerous plants but rest assured that some plants" + "\n"
                        + " may help you with your quest and build your strength!" + "\n");

        explorerEric.printDetails();

        gardenerGill.printDetails();

        daringDelilah.printDetails();
    }

    // Asking the user to select the character

    public void characterSelect() {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n" + "Which character would you like to play as: ?" + "\n"
                + "1) Gardener Gill 2) Explorer Eric or 3) Daring Delilah?" + "\n"
                + "Select 1,2 or 3? ");

        inputCharacter = sc.nextLine();

        if (inputCharacter.equals("1")) {

            System.out.println("\n" + "You have chosen to play as " + gardenerGill.getName());
            gardenerGill.printDetails();

        } else if (inputCharacter.equals("2")) {

            System.out.println("\n" + "You have chosen to play as " + explorerEric.getName());
            explorerEric.printDetails();

        } else {

            System.out.println("\n" + "You have chosen to play as " + daringDelilah.getName());
            daringDelilah.printDetails();
        }
    }

    // Battle event at the Rose Garden

    public void roseGarden() {

        System.out.println("You have entered the rose garden." + "\n"
                + " The scent from the newly engineered roses has a drug like effect and you start to feel very dizzy."
                + "\n"
                + " You lose your balance and the nearby climbing rose traps you in it's stems." + "\n");

        Scanner sc = new Scanner(System.in);

        System.out.println(" Do you want to try to use your weapon against it? y/n : ");

        inputWeapon = sc.nextLine();

        // if they chose to use a weapon then depending on the character chosen they
        // will have a different outcome

        if (inputWeapon.equals("y")) {

            if (inputCharacter.equals("1")) {

                System.out.println("You used your secateurs to cut the rose and poured in your poison " + "\n"
                        + "so you successfully escaped the rose garden!" + "\n"
                        + "You have used a poison point.");

                gardenerGill.setPoison(gardenerGill.getPoison() - 1); // losing points from character
                gardenerGill.printDetails();

            } else if (inputCharacter.equals("2")) {

                System.out.println("You used your sharp spade but the stems were too thick" + "\n"
                        + "and the spade is too large to handle in close combat." + "\n"
                        + "You have lost a health point. Now continue trying to locate the trapped gardners!");

                explorerEric.setHealth(explorerEric.getHealth() - 1); // losing points from character
                explorerEric.printDetails();

            } else {

                System.out.println("You used your specialised plant poison and managed" + "\n"
                        + "to nullify part of the plant.  You have successfully escaped the rose garden!" + "\n"
                        + "You have used a poison point. Now continue trying to locate the trapped gardners!");

                daringDelilah.setPoison(daringDelilah.getPoison() - 1); // losing points from character
                daringDelilah.printDetails();

                // if they select not to use their weapon then they lose a life
            }
        } else if (inputWeapon.equals("n")) {

            System.out.println("You have not defeated the rose and you have failed in your quest.  GAME OVER");

            daringDelilah.setLives(daringDelilah.getLives() - 1); // losing points from character
            daringDelilah.printDetails();

            gardenerGill.setLives(gardenerGill.getLives() - 1); // losing points from character
            gardenerGill.printDetails();

            explorerEric.setLives(explorerEric.getLives() - 1); // losing points from character
            explorerEric.printDetails();

        }

    }

    // New Battle event Greenhouse

    public void Greenhouse() {

        System.out.println("You have entered the greenhouse.  You spot the trapped lab assistants and gardeners" + "\n"
                + " and see several large tropical plants down each side of the path." + "\n"
                + " As you watch they are already growing bigger... They have hairs all down the stems " + "\n"
                + " and there is a poinsonous liquid dripping from the flowers! " + "\n");

        // game options for the user

        Scanner sc = new Scanner(System.in);

        System.out.println(" You can choose to:" + "\n"
                + "	a) Run along the path and use your weapon to attack." + "\n"
                + " b) Look around the greenhouse and see if there is a way around. " + "\n");

        inputChoice = sc.nextLine();

        // depending on choice made the outcome will be different depending on the
        // character chosen

        if (inputChoice.equals("a")) {

            if (inputCharacter.equals("1")) {

                System.out.println(
                        "You tried to attack using the sacetuers but they were too small to do any real damage." + "/n"
                                + "Unfortuantely you have lost a life");

                gardenerGill.setLives(gardenerGill.getLives() - 1);
                gardenerGill.printDetails();

            } else if (inputCharacter.equals("2")) {

                System.out.println("You used your sharp spade and used your kung fu moves." + "\n"
                        + " You successfully killed the plants got past to rescue the team!" + "\n"
                        + " Now you need to find the way out of the garden." + "/n"
                        + " This dangerous battle cost you a health point, but you escaped with your life!");

                explorerEric.setHealth(explorerEric.getHealth() - 1);
                explorerEric.printDetails();

            } else if (inputCharacter.equals("3")) {

                System.out.println("You used your specialised plant poison and managed to nullify each plant." + "\n"
                        + " You successfully got past to rescue the team!" + "\n"
                        + " Now you need to find the way out of the garden!");

                daringDelilah.setPoison(daringDelilah.getPoison() - 1);
                daringDelilah.printDetails();

            }

            // option 2 for the user

        } else if (inputChoice.equals("b")) {

            System.out.println("You look around the greenhouse for something useful" + "\n"
                    + " and think if there is another way around" + "\n"
                    + " On your way through you notice a spray bottle on the floor and you also see a camomile plant nearby."
                    + "\n"
                    + " Knowing that this has a calming effect, you pick off the petals" + "\n"
                    + " to make a spray potion to use on the plants! You have earned a poison point!" + "\n"
                    + " You now make your way back to the main path");

            // Gaining poison points

            if (inputCharacter.equals("1")) {

                gardenerGill.setPoison(gardenerGill.getPoison() + 1);
                gardenerGill.printDetails();

            } else if (inputCharacter.equals("2")) {

                explorerEric.setPoison(explorerEric.getPoison() + 1);
                explorerEric.printDetails();

            } else if (inputCharacter.equals("3")) {

                daringDelilah.setPoison(daringDelilah.getPoison() + 1);
                daringDelilah.printDetails();

            }
        }
    }

    public void Points() {

        if (daringDelilah.getLives() == 0) {

            System.out.println("You have failed in your quest. G.A.M.E O.V.E.R ");
            System.exit(0);

        } else if (gardenerGill.getLives() == 0) {

            System.out.println("You have failed in your quest. G.A.M.E O.V.E.R ");
            System.exit(0);

        } else if (explorerEric.getLives() == 0) {

            System.out.println("You have failed in your quest. G.A.M.E O.V.E.R ");
            System.exit(0);

        } else if (daringDelilah.getHealth() == -1) {

            System.out.println("You have failed in your quest. G.A.M.E O.V.E.R ");
            System.exit(0);

        } else if (gardenerGill.getHealth() == -1) {

            System.out.println("You have failed in your quest. G.A.M.E O.V.E.R ");
            System.exit(0);

        } else if (explorerEric.getHealth() == -1) {

            System.out.println("You have failed in your quest. G.A.M.E O.V.E.R ");
            System.exit(0);

        } else if (daringDelilah.getPoison() == -1) {

            System.out.println("You have failed in your quest. G.A.M.E O.V.E.R ");
            System.exit(0);

        } else if (gardenerGill.getPoison() == -1) {

            System.out.println("You have failed in your quest. G.A.M.E O.V.E.R ");
            System.exit(0);

        } else if (explorerEric.getPoison() == -1) {

            System.out.println("You have failed in your quest. G.A.M.E O.V.E.R ");
            System.exit(0);
        }
    }
}

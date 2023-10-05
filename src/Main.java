
import java.util.Scanner;
public class Main {
    private static int fire = 0;
    private static int flash = 0;
    private static int icicle = 0;
    private static int blade = 0;
    private static int mob = 0;
    private static int cut = 0;
    private static int enemy1HP = 5;
    private static int enemy2HP = 3;
    private static int enemy3HP = 8;
    private static int enemy4HP = 10;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Please enter your username: ");
        String userName = scanner.nextLine();
        greeting(userName);

        // StoryLine + Ability board...
        System.out.println("You are being trapped in a dungeon, but it seems like it is guarded by horrible monsters...");
        System.out.println("You try to call for help, but no one responded.");
        System.out.println("You suddenly see lights coming in from the window of the dungeon.");
        System.out.println("You are not sure how you ended up here, as if your memory is being stolen.");
        System.out.println("But you have a feeling that this isn't a place to stay");
        Thread.sleep(3000);
        System.out.println("You slowly approach the door of your cell and saw a key hole.");
        System.out.println("Do you want to open it (yes or no): ");
        String openCellDecision = scanner.nextLine();
        if (openCellDecision.equals("no")) {
            System.out.println("brave soul search for freedom. But respect is given to those who choose to be a caged bird forever...");
            System.exit(0);
        }
        System.out.println("You opened the cell and saw two giant monsters staring at you in the darkness. You regret your jailbreak instantly.");
        System.out.println("Luckily, you recall that you knew some magic.");
        Thread.sleep(3000);
        System.out.println("Here is the list of magic you recall:");
        System.out.println("1. fireball: deal 1 damage to all enemies");
        System.out.println("2. flash:  deal 2 damage.If you kill an enemy with a flash spell, you will get two extra flash spells");
        System.out.println("*to cast a spell, simply write the name of the spell. Lower cased");
        System.out.println("*to select a target, write the name of the enemy. No space and lower cased (e.g. enemy1).");
        Thread.sleep(3000);
        System.out.println("You feel like you are ready to fight the two monsters. The battle starts");
        //First battle:
        Thread.sleep(5000);
        while (true) {
            enemy1HP = 5;
            enemy2HP = 3;
            System.out.println("Enemy 1 HP = " + enemy1HP + "\nEnemy 2 HP =" + enemy2HP);
            System.out.println("You have 1 fireball and 1 flash, and your goal is to kill all the enemy.");
            fire = 1;
            flash = 1;
            System.out.println("Please enter your first spell: ");
            String firstSpell = scanner.nextLine();
            firstBattle(firstSpell);
            System.out.println("Please enter your second spell: ");
            String secondSpell = scanner.nextLine();
            firstBattle(secondSpell);
            System.out.println("Please enter your third spell: ");
            String thirdSpell = scanner.nextLine();
            firstBattle(thirdSpell);
            System.out.println("Please enter your fourth spell: ");
            String fourthSpell = scanner.nextLine();
            firstBattle(fourthSpell);
            if ((enemy1HP != 0) || (enemy2HP != 0)) {
                System.out.println("You have no spells and enemies are not fully defeated.");
                System.out.println("Do you want to retry (yes or no): ");
                String retryStatus = scanner.nextLine();
                if (retryStatus.equals("no")) {
                    System.out.println("You Lost...");
                    System.exit(0);
                }
            } else {
                break;
            }
        }
        Thread.sleep(3000);
        System.out.println("You defeated the two monsters and saw a jade amulet in one of the monster's pocket.");
        System.out.println("You slowly approached it and took a closer look.");
        System.out.println("Do you want to grab the amulet (yes or no):");
        String grabDecision = scanner.nextLine();
        if (grabDecision.equals("no")) {
            System.out.println("It is the most important item in the game... ARE YOU SURE YOU WANT TO LEAVE IT??");
            Thread.sleep(1000);
            System.out.println("Do you want to grab the amulet (yes or no):");
            String grabDecision2 = scanner.nextLine();
            if (grabDecision2.equals("no")) {
                System.out.println("You Lose... It is impossible to win without this item");
                System.exit(0);
            }
        }
        System.out.println("The amulet glistened in your hands...");
        Thread.sleep(3000);
        System.out.println("Suddenly, it penetrates into your body. You feel power transmitting through your veins. From your hands to your toes, intelligence and peace fills up your body.");
        Thread.sleep(2000);
        System.out.println("You obtained the spell \"icicle\" ");
        Thread.sleep(3000);
        System.out.println("Here is the list of magic you have:");
        System.out.println("1. fireball: deal 1 damage to all enemies");
        System.out.println("2. flash:  deal 2 damage.If you kill an enemy with a flash spell, you will get two extra flash spells");
        System.out.println("3. icicle: deal 3 damage and add a" + "\"mob\" spell to your hand");
        Thread.sleep(5000);
        System.out.println("As you walked towards the dark end of the Dungeon, you confronts a long canal");
        System.out.println("As you looked closer, a ferryman rolls the boat towards you");
        System.out.println("He said that in order for him to carry you, you must answer his questions:");
        System.out.println("What are booleans, integers, double, and characters called (no plural)? ");
        String ansOne = scanner.nextLine();
        if (!ansOne.equals("primitive type")) {
            System.out.println("An interesting, but wrong answer. Try again:");
            String ansOne2 = scanner.nextLine();
            if (!ansOne2.equals("primitive type")) {
                System.out.println("You wasted the second chance...You lose...");
                System.exit(0);
            }
        }
        System.out.println("You answered the riddle correctly, and the ferryman sent you to the other side of the canal.");
        Thread.sleep(3000);
        System.out.println("However, you quickly noticed two giants standing beside the canal.");
        System.out.println("The battle starts again...");
        Thread.sleep(5000);
        //Second Battle:
        while (true) {
            System.out.println("You have 1 fireball, 1 icicle. Your goal is again to defeat all enemies.");
            fire += 1;
            icicle += 1;
            enemy1HP = 4;
            enemy3HP = 8;
            System.out.println("Enemy 1 HP = " + enemy1HP + "\nEnemy 3 HP =" + enemy3HP);
            System.out.println("Please enter your first spell: ");
            String firstSpell2 = scanner.nextLine();
            secondBattle(firstSpell2);
            System.out.println("Please enter your second spell: ");
            String secondSpell2 = scanner.nextLine();
            secondBattle(secondSpell2);
            System.out.println("Please enter your third spell: ");
            String thirdSpell2 = scanner.nextLine();
            secondBattle(thirdSpell2);
            if ((enemy1HP != 0) || (enemy3HP != 0)) {
                System.out.println("You have no spells and enemies are not fully defeated. You lost.");
                System.out.println("Do you want to retry (yes or no): ");
                String retryStatus = scanner.nextLine();
                if (retryStatus.equals("no")) {
                    System.exit(0);
                }
            } else {
                break;
            }
        }
        System.out.println("Behind the giants, you saw a chest glistening in the darkness");
        System.out.println("Open it our not (yes or no): ");
        String openChestDecision = scanner.nextLine();
        if (openChestDecision.equals("no")) {
            System.out.println("It is the second most important item in the game... ARE YOU SURE YOU WANT TO LEAVE IT??");
            Thread.sleep(1000);
            System.out.println("Do you want to open it (yes or no):");
            String grabDecision2 = scanner.nextLine();
            if (grabDecision2.equals("no")) {
                System.out.println("You Lose... It is impossible to win without this item");
                System.exit(0);
            }
        }
        System.out.println("There are two amulets inside, which hovers beside your waist and penetrates into your body");
        Thread.sleep(3000);
        System.out.println("Your fireball and icicle spells are upgraded, and you obtained spell \"blade\"");
        Thread.sleep(3000);
        System.out.println("Here is the list of magic you have:");
        System.out.println("1. upgraded fireball: deals 3 damage to all enemies");
        System.out.println("2. flash: deal 2 damage.If you kill an enemy with a flash spell, you will get two extra flash spells");
        System.out.println("3. upgraded icicle: deals 3 damage and gives you a " + "\"cut\" spell (destroy any enemy with 2 HP)");
        System.out.println("4. blade: deals 3 damage. Deals double damage if target is already injured");

        // Third Battle:
        while (true) {
            System.out.println("You have 1 upgraded fireball, 1 upgraded icicle, 1 blade");
            fire = 1;
            icicle = 1;
            blade = 1;
            enemy1HP = 3;
            enemy2HP = 5;
            enemy3HP = 6;
            enemy4HP = 9;
            System.out.println("Enemy 1 HP = " + enemy1HP + "\nEnemy 2 HP =" + enemy2HP + "\nEnemy 3 HP =" + enemy3HP + "\nEnemy 4 HP =" + enemy4HP);
            System.out.println("Please enter your first spell: ");
            String firstSpell3 = scanner.nextLine();
            thirdBattle(firstSpell3);
            System.out.println("Please enter your second spell: ");
            String secondSpell3 = scanner.nextLine();
            thirdBattle(secondSpell3);
            System.out.println("Please enter your third spell: ");
            String thirdSpell3 = scanner.nextLine();
            thirdBattle(thirdSpell3);
            System.out.println("Please enter your fourth spell: ");
            String fourthSpell3 = scanner.nextLine();
            thirdBattle(fourthSpell3);
            if ((enemy1HP != 0) || (enemy3HP != 0) || (enemy4HP != 0) || (enemy2HP != 0)) {
                System.out.println("You have no spells and enemies are not fully defeated. You lost.");
                System.out.println("Do you want to retry (yes or no): ");
                String retryStatus = scanner.nextLine();
                if (retryStatus.equals("no")) {
                    System.exit(0);
                }
            } else {
                break;
            }
        }
        System.out.println("You saw a key shinnying in the pocket of the monster\n" +
                "Do you want to take it or not (yes or no): ");
        String takeKey = scanner.nextLine();
        if (takeKey.equals("no")) {
            System.out.println("You are not winning without the key...DO YOU WANT TO TAKE IT OR NOT:");
            String takeKey2 = scanner.nextLine();
            if (takeKey2.equals("no")) {
                System.out.println("You Lose...");
                System.exit(0);
            }
        }
        System.out.println("You walk towards the darkness, and finally reached a wooden door.\n" +
                "You used the key to open the door. You Win!!!");
    }

    public static void fireDamage() {
        enemy1HP -= 1;
        enemy2HP -= 1;
        enemy3HP -= 1;
        enemy4HP -= 1;
    }


    public static void flashDamage(String target) {
        if (target.equals("enemy2")) {
            enemy2HP -= 2;
            if (enemy2HP == 0) {
                flash += 2;
            }
        } else if (target.equals("enemy1")) {
            enemy1HP -= 2;
            if (enemy1HP == 0) {
                flash += 2;
            }
        }
    }

    // Spell Methods

    public static void mobDamage() {
        if (enemy1HP == 0) {
            enemy3HP = 0;
        } else if (enemy3HP > enemy1HP) {
            enemy1HP = 0;
        }
    }

    public static void cutDamage() {
        if (enemy1HP == 2) {
            enemy1HP = 0;
        }
        if (enemy2HP == 2) {
            enemy2HP = 0;
        }
    }

    public static void upgradedFireDamage() {
        enemy1HP -= 3;
        enemy2HP -= 3;
        enemy3HP -= 3;
        enemy4HP -= 3;
    }

    public static void icicleDamage(String target) {
        if (target.equals("enemy3")) {
            enemy3HP -= 3;
        } else if (target.equals("enemy1")) {
            enemy1HP -= 3;
        } else if (target.equals("enemy2")) {
            enemy2HP -= 3;
        } else if (target.equals("enemy4")) {
            enemy4HP -= 3;
        }
    }


    public static void bladeDamage(String target) {
        if (target.equals("enemy3")) {
            if (enemy3HP < 12) {
                enemy3HP -= 6;
            } else {
                enemy3HP -= 3;
            }
        } else if (target.equals("enemy1")) {
            if (enemy1HP < 3) {
                enemy1HP -= 6;
            } else {
                enemy1HP -= 3;
            }
        } else if (target.equals("enemy2")) {
            if (enemy2HP < 8) {
                enemy2HP -= 6;
            } else {
                enemy2HP -= 3;
            }
        } else if (target.equals("enemy4")) {
            if (enemy4HP < 9) {
                enemy4HP -= 6;
            } else {
                enemy4HP -= 3;
            }
        }
    }


    // Battle Methods

    public static void firstBattle(String Spell) {
        if (Spell.equals("fireball")) {
            if (fire == 0) {
                System.out.println("You do not have enough of this spell");
            } else if (fire >= 0) {
                fire -= 1;
                fireDamage();
                System.out.println("Enemy 1 HP = " + enemy1HP + "\nEnemy 2 HP =" + enemy2HP);
            }
        }
        if (Spell.equals("flash")) {
            if (flash == 0) {
                System.out.println("You do not have enough of this spell");
            } else if (flash >= 0) {
                flash -= 1;
                System.out.println("Please enter your target: ");
                String targetFirstWar = scanner.nextLine();
                flashDamage(targetFirstWar);
                System.out.println("Enemy 1 HP = " + enemy1HP + "\nEnemy 2 HP =" + enemy2HP);
            }
        }

    }

    public static void secondBattle(String Spell) {
        if (Spell.equals("fireball")) {
            if (fire >= 1) {
                fire -= 1;
                fireDamage();
                System.out.println("Enemy 1 HP = " + enemy1HP + "\nEnemy 3 HP =" + enemy3HP);
            } else if (fire == 0) {
                System.out.println("You do not have enough of this spell");
            }
        } else if (Spell.equals("icicle")) {
            if (icicle >= 1) {
                icicle -= 1;
                System.out.println("Please enter your target: ");
                String targetSecondWar = scanner.nextLine();
                icicleDamage(targetSecondWar);
                System.out.println("Enemy 1 HP = " + enemy1HP + "\nEnemy 3 HP =" + enemy3HP);
                System.out.println("You have obtained a \"mob\" spell, this spell will destroy the enemy with lowest health");
                mob += 1;
            } else if (icicle == 0) {
                System.out.println("You do not have enough of this spell");
            }
        } else if (Spell.equals("mob")) {
            if (mob >= 1) {
                mob -= 1;
                mobDamage();
                System.out.println("Enemy 1 HP = " + enemy1HP + "\nEnemy 3 HP =" + enemy3HP);
            }
            else if (mob == 0) {
                System.out.println("You do not have enough of this spell");
            }
        }
    }

    public static void thirdBattle(String Spell) {
        if (Spell.equals("fireball")) {
            if (fire >= 1) {
                fire -= 1;
                upgradedFireDamage();
                if (enemy1HP <= 0) {
                    enemy1HP = 0;
                }
                if (enemy2HP <= 0) {
                    enemy2HP = 0;
                }
                System.out.println("Enemy 1 HP = " + enemy1HP + "\nEnemy 2 HP =" + enemy2HP + "\nEnemy 3 HP =" + enemy3HP + "\nEnemy 4 HP =" + enemy4HP);
            } else if (fire == 0) {
                System.out.println("You do not have enough of this spell");
            }
        } else if (Spell.equals("icicle")) {
            if (icicle >= 1) {
                icicle -= 1;
                System.out.println("Please enter your target: ");
                String targetThirdWar = scanner.nextLine();
                icicleDamage(targetThirdWar);
                if (enemy1HP <= 0) {
                    enemy1HP = 0;
                }
                if (enemy2HP <= 0) {
                    enemy2HP = 0;
                }
                System.out.println("Enemy 1 HP = " + enemy1HP + "\nEnemy 2 HP =" + enemy2HP + "\nEnemy 3 HP =" + enemy3HP + "\nEnemy 4 HP =" + enemy4HP);
                System.out.println("You have obtained a \"cut\" spell, this spell will destroy any enemies with two health");
                cut += 1;
            } else if (icicle == 0) {
                System.out.println("You do not have enough of this spell");
            }
        } else if (Spell.equals("cut")) {
            cut -= 1;
            cutDamage();
            if (enemy1HP <= 0) {
                enemy1HP = 0;
            }
            if (enemy2HP <= 0) {
                enemy2HP = 0;
            }
            System.out.println("Enemy 1 HP = " + enemy1HP + "\nEnemy 2 HP =" + enemy2HP + "\nEnemy 3 HP =" + enemy3HP + "\nEnemy 4 HP =" + enemy4HP);
        } else if (Spell.equals("blade")) {
            if (blade >= 1) {
                blade -= 1;
                System.out.println("Please enter your target: ");
                String targetThirdWar = scanner.nextLine();
                bladeDamage(targetThirdWar);
                System.out.println("Enemy 1 HP = " + enemy1HP + "\nEnemy 2 HP =" + enemy2HP + "\nEnemy 3 HP =" + enemy3HP + "\nEnemy 4 HP =" + enemy4HP);
            }else if (blade == 0) {
                System.out.println("You do not have enough of this spell");
            }
        }
    }

    public static void greeting(String name) {
        System.out.println("Hello " + name + "!");
    }
}









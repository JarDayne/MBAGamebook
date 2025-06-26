package the_gamebook.main;

import java.util.Scanner;

public class MbaGame {

    public static void main(String[] args) {

        Scanner userInputScanner = new Scanner(System.in);

        System.out.println("You are the main character here! You are called Alex. Alex, meet yourself.");
        System.out.println("\nYou are the entrepreneurial type and start a company.");

        System.out.println("\nType anything to continue. Press Enter.");
        userInputScanner.nextLine();
        System.out.println("\n\n\n\n\n");

        System.out.println("\nAs Alex, you will be asked to make decisions, and these decisions will have \n" +
                "consequences.");
        System.out.println("\nThe consequences will take the shape of points being rewarded to or deducted \n" +
                "from your score.");

        System.out.println("\nType anything to continue. Press Enter.");
        userInputScanner.nextLine();
        System.out.println("\n\n\n\n\n");

        System.out.println("\nThe game currency is, of course, Money, Productivity, and Prestige. Depending \n" +
                "on the relevance of the decision, points will be rewarded to or deducted from \n" +
                "these accordingly.");
//        System.out.println("\nTo keep track of your progress, you can use the provided “Score sheet” in the \n" +
//                "resource section. Alternatively, you can use whatever other means you find \n" +
//                "suitable and most pleasant to use.");
        System.out.println("\n\nGood luck and good game!");

        System.out.println("\nType anything to continue. Press Enter.");
        userInputScanner.nextLine();
        System.out.println("\n\n\n\n\n");




        int promptNumber = 1;
        String promptInformation = "The Intergalactic Federation just finished the 11-Delta-X Entrepreneurship summit. As members of the \n" +
                "Federation are pouring out of the Headquarters, you can hear an excited murmur. They are discussing \n" +
                "a pale blue dot of a planet in the Orion Arm of the Milky Way Galaxy. It has been voted the most suitable \n" +
                "planet to launch a business venture. Earth.  \n" +
                "Earth, with its constantly emerging business accelerators and crowdfunding campaigns. With its mass \n" +
                "quantities of inspired educated young people. With its engineering talent. Earth, your home planet.  \n" +
                "You were born there 29 years ago, and your name is Alex Field. As it also happens, you are the main \n" +
                "character here. \n" +
                "\"I should go back\" -- you think -- \"I should go back, and build a legacy. Tari has been wanting to return \n" +
                "to Earth for a while now, ever since Ari was born.\"  \n" +
                "\"We can start something meaningful.\"";

        String[] promptDecisions = {"You go back to the Pale Blue Dot."};

        int money=0,
            productivity=0,
            prestige=0;
        StringBuilder resourceView;

        String deltaMoney="+0",
                deltaProductivity="+0",
                deltaPrestige="+0";

        boolean online;
        //current Prompt object, changes on every decision

        do {
            resourceView = new StringBuilder();
            resourceView
                    .append("Money: ").append(money)
                    .append("   Productivity: " ).append(productivity)
                    .append("   Prestige: ").append(prestige);
            System.out.println(resourceView);

            //use the current Prompt object
            String promptBuilder = "\n" + promptNumber + ".\n\t" + promptInformation;
            System.out.println(promptBuilder);

            System.out.println("\nType anything to continue. Press Enter.");
            userInputScanner.nextLine();

            StringBuilder promptDecisionsBuilder = (new StringBuilder()).append("Decisions: \n");
            for (int decisionNum=0; decisionNum < promptDecisions.length; decisionNum++) {
                promptDecisionsBuilder.append("\n").append(decisionNum).append("\t").append(promptDecisions[decisionNum]);
            }

            System.out.println(promptDecisionsBuilder);
            System.out.println("\ntype 'exit' to close the window.\n");

            //use scanner to get user's decision


            // ...
            //userInputScanner.next();
            String userDecision = userInputScanner.nextLine(); //exit, 0, 1, 2, ...
            //System.out.println(userDecision);
            //userInputScanner.nextLine();
            //do input validation

            // check if enough resources to stay online
            // record progress

            online = !(userDecision.equals("exit"));
            //System.out.println(online + "\n");

            //calculate decision
            if(online) {
                System.out.println("Resources: Money("+deltaMoney+")   Productivity("+deltaProductivity+")   Prestige("+deltaPrestige+")");
                System.out.println("\nType anything to continue. Press Enter.");
                userInputScanner.nextLine();
            }

            System.out.println("Saved.\n\n\n");
        } while (online);

    }

}

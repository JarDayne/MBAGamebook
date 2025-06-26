package the_gamebook.game_elements.prompts;

public class Prompt {

    private int promptNumber;
    private String promptInformation;
    private String[] promptDecisions;

    public Prompt(int number, String information, String[] decisions) {

        this.promptNumber = number;
        this.promptInformation = information;
        this.promptDecisions = decisions;
    }

    public int getPromptNumber() {
        return promptNumber;
    }

    public String getPromptInformation() {
        return promptInformation;
    }

    public String[] getPromptDecisions() {
        return promptDecisions;
    }



}

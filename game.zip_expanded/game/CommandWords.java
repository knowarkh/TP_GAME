/**
 * This class is part of the "World of Advenrture" application. This class holds
 * an enumeration of all command words known to the game. It is used to
 * recognise commands as they are typed in.
 */

public class CommandWords {
    private CommandWord cw;

    /**
     * Constructor - initialise the command words.
     */
    public CommandWords() {
        // nothing to do at the moment...
    }

    /**
     * Check whether a given String is a valid command word.
     * 
     * @return true if a given string is a valid command, false if it isn't.
     */
    public boolean isCommand(String str) {
        boolean rep = false;
        if (getCommandWord(str) != CommandWord.UNKNOWN) {
            rep = true;
        }
        return rep;
        // if we get here, the string was not found in the commands
    }

    public CommandWord getCommandWord(String str) {
        CommandWord rep = null;
        switch (str) {
        case "go":
            rep = CommandWord.GO;
            break;
        case "quit":
            rep = CommandWord.QUIT;
            break;
        case "help":
            rep = CommandWord.HELP;
            break;
        case "look":
            rep = CommandWord.LOOK;
            break;
        default:
            rep = CommandWord.UNKNOWN;
            break;
        }
        return rep;
    }

}

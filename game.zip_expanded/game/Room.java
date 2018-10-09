import java.util.HashMap;
import java.util.Set;

/**
 * Class Room - a room in an adventure game. A "Room" represents one location in
 * the scenery of the game. It is connected to other rooms via exits. The exits
 * are labelled north, east, south, west. For each direction, the room stores a
 * reference to the neighboring room, or null if there is no exit in that
 * direction.
 */
public class Room {

    private HashMap<String, Room> exits;
    private String description;

    /**
     * Create a room described "description". Initially, it has no exits.
     * "description" is something like "a kitchen" or "an open court yard".
     * 
     * @param description
     *            The room's description.
     */
    public Room(String description) {
        this.description = description;
        this.exits = new HashMap<String, Room>();
    }

    /**
     * Getter retournant la pièce située dans une direction de sortie
     * 
     * @param direction
     * @return Room
     */
    public Room getExit(String direction) {
        Room rep = null;
        if (this.exits != null) {
            rep = this.exits.get(direction);
        }
        return rep;
    }

    /**
     * Setter ajouter les pièces et leur sorties dans la HashMap
     * 
     * @param direction
     * @param neighbor
     */
    public void setExit(String direction, Room neighbor) {
        this.exits.put(direction, neighbor);
    }

    /**
     * Méthode donnant les différentes direction possible d'une Room
     * 
     * @return String chaine
     */
    public String getExitString() {
        String rep = "Exits : ";
        Set<String> datas = this.exits.keySet();
        for (String e : datas) {
            rep += e + " ";
        }
        return rep;
    }

    /**
     * @return The description of the room.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Méthode retournant la description complète d'une pièce
     * 
     * @return String
     */
    public String getLongDescription() {
        return "You are " + description + "\r\n" + this.getExitString();
    }
}

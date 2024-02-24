package dungeon;

//------------ IMPORT ------------//
import java.util.ArrayList;
import java.util.List;
import entities.Room;


//import entities.Hero;

//------------ CLASS  ------------//
public class Dungeon {
    private List<Room> rooms;
    private boolean displayCreationInfo;

    // Le constructeur initialise les pièces et détermine les monstres qu'elles contiennent.
    public Dungeon(int numberOfRooms, boolean displayCreationInfo) {
        this.rooms = new ArrayList<>();
        this.displayCreationInfo = displayCreationInfo;

        for (int i = 0; i < numberOfRooms; i++) {
            // Ajoutez des pièces et initialisez les monstres ici selon les règles spécifiées.
           
            rooms.add(new Room(i)); 
        }

        if (displayCreationInfo) {
            displayCreationInfo();
        }
    }

    private void displayCreationInfo() {
        for (Room room : rooms) {
            System.out.println("Room " + room.getNumber() + ": " + room.getMonsterType());
        }
    }

    public void greetHeros(Hero hero) {
        System.out.println("Welcome, hero!");
    }

    // donjon a mettre 
}

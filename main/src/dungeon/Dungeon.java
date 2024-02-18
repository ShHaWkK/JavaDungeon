package dungeon;

import java.util.ArrayList;
import java.util.List;

import entities.Room;
//import entities.Hero;
public class Dungeon {
    private List<Room> rooms;
    private boolean displayCreationInfo;

    // Le constructeur initialise les pièces et détermine les monstres qu'elles contiennent.
    public Dungeon(int numberOfRooms, boolean displayCreationInfo) {
        this.rooms = new ArrayList<>();
        this.displayCreationInfo = displayCreationInfo;

        for (int i = 0; i < numberOfRooms; i++) {
            // Ajoutez des pièces et initialisez les monstres ici selon les règles spécifiées.
            // Exemple : rooms.add(new Room(i, determineMonsterType(i)));
            rooms.add(new Room(i)); // Vous devez implémenter la logique pour déterminer le type de monstre.
        }

        if (displayCreationInfo) {
            displayCreationInfo();
        }
    }

    // Méthode pour afficher les informations de création des pièces et des monstres.
    private void displayCreationInfo() {
        // Implémentez la logique pour afficher les informations de création ici.
        for (Room room : rooms) {
            System.out.println("Room " + room.getNumber() + ": " + room.getMonsterType());
        }
    }

    public void greetHeros(Hero hero) {
        // Implémentez la logique d'introduction et de commencement du jeu ici.
        System.out.println("Welcome, hero!");
    }

    // ... Autres méthodes et logique du donjon ...
}

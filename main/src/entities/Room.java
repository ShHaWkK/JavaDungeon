package entities;

public class Room {
    private int number;
    private Monster monster; // mettre la classe monster 

    public Room(int number) 
    {
        this.number = number;
        //implémenter la logique pour créer et placer un monstre dans la pièce.
    }

    // Méthode pour entrer dans la pièce. La logique de combat sera implémentée
    public void enter(Hero hero) 
    {
        // Implémentez la logique de rencontre avec le monstre et le combat 
        System.out.println("Entering room " + number);
    }

    public int getNumber() 
    {
        return number;
    }

   // une logique pour obtenir le type de monstre.
    public String getMonsterType()
    {
        // Retourne le type de monstre dans la pièce. Vous devez implémenter cette logique.
        return "MonsterTypePlaceholder";
    }

   //D'autres codes a mettre 
}

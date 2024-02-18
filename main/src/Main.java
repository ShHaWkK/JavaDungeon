import dungeon.Dungeon;

public class Main {
    public static void main(String[] args) {
        Dungeon dungeon = new Dungeon(10, true);
        Hero hero = new Hero();

        dungeon.greetHeros(hero);
    }
}

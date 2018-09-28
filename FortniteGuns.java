import java.util.Scanner;

public class FortniteGuns {
    private String name;
    private String gunType;
    private String rarity;
    private String damage;

    public FortniteGuns(){
        name = "Default gun";
        gunType = "pistol";
        rarity = "common";
        damage = "8";
    }

    public FortniteGuns(String newName, String newGunType, String newRarity, String newDamage) {
        name = newName;
        gunType = newGunType;
        rarity = newRarity;
        damage = newDamage;
    }

    public String getName() {
        return name;
    }

    public String getGunType() {
        return gunType;
    }

    public String getRarity() {
        return rarity;
    }

    public String getDamage() {
        return damage;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setGunType(String newGunType) {
        gunType = newGunType;
    }

    public void setRarity(String newRarity) {
        rarity = newRarity;
    }

    public void setDamage(String newDamage) {
        damage = newDamage;
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.println("What do you want to name your gun?");
        String setGunName = k.nextLine();

        System.out.println("What do you want the gun type to be called?");
        String setGunType = k.nextLine();

        System.out.println("What do you want the gun rarity to be?");
        String setGunRariry = k.nextLine();

        System.out.println("What do you want the gun damage to be?");
        String setDamage = k.nextLine();

        FortniteGuns gun1 = new FortniteGuns(setGunName, setGunType, setGunRariry, setDamage);

        System.out.println("A new gun has been created named the \"" + gun1.name + "\" with the gun type \"" + gun1.gunType + "\".");
        System.out.println("The gun's rarity is " + gun1.rarity + " with a damage stat of " + gun1.damage);

    }
}

// check if constructors have a public before them in the book
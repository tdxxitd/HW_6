public class Main {
    public static void main(String[] args) {
        Weapon SWORD = new Weapon(WeaponType.SWORD, "Excalibur");
        Weapon AXE = new Weapon(WeaponType.AXE, "Iron Axe");
        Weapon BOW = new Weapon(WeaponType.BOW, "Bone Bow");


        Boss boss = new Boss(500, 50, SWORD);
        System.out.println("Boss Info: \n" + boss.printInfo());

        Skeleton skeleton1 =  new Skeleton(120, 20, AXE, 20);
        Skeleton skeleton2  =  new Skeleton(120, 20, BOW, 30);
        System.out.println("Skeleton 1 Info: \n" + skeleton1.printInfo());
        System.out.println("Skeleton 2 Info: \n" + skeleton2.printInfo());
    }
}
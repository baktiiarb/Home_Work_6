public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(150, 15);
        boss.weapon.setNameWeapon("katana");
        boss.weapon.setTypeWeapon("sai");
        System.out.println(boss.info());
    }


}
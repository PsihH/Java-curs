public class Limb {
    public static void main(String[] args) {
        Dog vin = new Dog();
        vin.all_data("Кузя", 14, "Рыжий", 15, "М");
        System.out.println(vin.getAll_data());
        Cat bin = new Cat();
        bin.all_data("Офелия", 3, "Серая", 2, "Ж");
        System.out.println(bin.getAll_data());
    }
}

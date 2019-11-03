public class Limb {
    public static void main(String[] args) {
       Animals lip = new Animals();
       lip.all_data("Кошка", "Офелия",2 , "Серый",3 , "Ж");
       System.out.println(lip.getAll_data());

        Animals kil = new Animals();
        kil.all_data("Собака", "Кузя", 12, "Рыжий", 15, "М");
        System.out.println(kil.getAll_data());

        Animals dip = new Animals();
        dip.all_data("Жираф", "Гоша", 400, "Оранжевый", 20 , "Ж");
        System.out.println(dip.getAll_data());

        Animals rip = new Animals();
        rip.all_data("Суслик", "Вася", 4, "Серо-желтый", 5, "М");
        System.out.println(rip.getAll_data());

        Animals lin = new Animals();
        lin.all_data("Кабан", "Петр",23 , "Бардовый ", 16 , "М");
        System.out.println(lin.getAll_data());
    }
}

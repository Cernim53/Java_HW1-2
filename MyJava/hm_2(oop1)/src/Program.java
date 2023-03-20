import myClasses.*;

public class Program {
    public static void main(String[] args) {

        //#region Task_1


        Person p = new Person();
        p.setLastName("White");
        p.setName("Leo");
        //System.out.println(p);

        //#endregion

        //#region Task_2


        Garden g1 = new Garden(25.5, "Apple Trees");
        Garden g2 = new Garden(25.5, "Bananas");
        Garden g3 = new Garden(60, "Rise");
        /*System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
        System.out.println("ares equals g2 and g1: "+g2.equals(g1));
        System.out.println("ares equals g3 and g1: "+g3.equals(g1));*/

        //#endregion

        //#region Task_3

        Country country = new Country("Canada",37590000,"Canada is a country in North America");
        //System.out.println(country);
        //#endregion

        //#region Task_4

        Fraction fraction1 = new Fraction(4,7);
        Fraction fraction2 = new Fraction(2,5);

        /*System.out.println(fraction1.add(fraction2));
        System.out.println(fraction1.divide(fraction2));
        System.out.println(fraction1.multiply(fraction2));
        System.out.println(fraction1.subtract(fraction2));*/
        //#endregion

        //#region Task_5


        Book book = new Book();
        book.setName("CLR via C#");
        book.setAuthor("Рихтер Дж.(Jeffrey Richter)");
        book.setNamePublisher("Питер, 4-е издание");
        book.setGendre("Техническая литература");;
        book.setDatePublish(2013);
        book.setPages(896);

        //System.out.println(book);
        //#endregion

        //#region Task_6


        Car car = new Car("Zafira", "Opel", 2004, 2.2);
        System.out.println(car);

        car.setYear(2003);
        System.out.println(car);
        //#endregion
    }
}

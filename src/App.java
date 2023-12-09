public class App {
    public static void main(String[] args) {

        System.out.println();

        Author bulgakov = new Author("Михаил", "Булгаков");
        System.out.println("bulgakov = " + bulgakov);

        Author fray = new Author("Макс", "Фрай");
        System.out.println("fray = " + fray);

        Author gomer = new Author("Гомер");
        System.out.println("gomer = " + gomer);

        System.out.println();

        Book master = new Book("Мастер и Маргарита", bulgakov, 2000);
        System.out.println("master = " + master);

        Book eho = new Book("Хроники Ехо", fray, 2013);
        System.out.println("eho = " + eho);

        Book odisseya = new Book("Одиссея", gomer, 1989);
        System.out.println("odisseya = " + odisseya);

        System.out.println();

        master.setPublicationYear(2007);
        System.out.println("master = " + master);
    }
}

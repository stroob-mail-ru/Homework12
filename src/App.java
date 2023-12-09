public class App {
    public static void main(String[] args) {

        System.out.println();

        Author bulgakov = new Author("Михаил", "Булгаков");
        System.out.println("bulgakov = " + bulgakov.getAuthor());

        Author fray = new Author("Макс", "Фрай");
        System.out.println("fray = " + fray.getAuthor());

        Author gomer = new Author("Гомер");
        System.out.println("gomer = " + gomer.getAuthor());

        System.out.println();

        Book master = new Book("Мастер и Маргарита", bulgakov, 2000);
        System.out.println("master = " + "\"" + master.getBookTitle() + "\", " + master.getAuthor().getAuthor() + ", " + master.getPublicationYear() + "г.");

        Book eho = new Book("Хроники Ехо", fray, 2013);
        System.out.println("eho = " + "\"" + eho.getBookTitle() + "\", " + eho.getAuthor().getAuthor() + ", " + eho.getPublicationYear() + "г.");

        Book odisseya = new Book("Одиссея", gomer, 1989);
        System.out.println("odisseya = " + odisseya.getBookTitle() + "\", " + odisseya.getAuthor().getAuthor() + ", " + odisseya.getPublicationYear() + "г.");

        System.out.println();

        master.setPublicationYear(2007);
        System.out.println("master = " + "\"" + master.getBookTitle() + "\", " + master.getAuthor().getAuthor() + ", " + master.getPublicationYear() + "г.");
    }
}

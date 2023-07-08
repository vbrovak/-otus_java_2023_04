package composite_files;

public class DemoDirShow {
    public static StringBuffer compositeBuilder = new StringBuffer();

    public static void main(String[] args) {
        Directory books = new Directory("books");
        Directory russian = new Directory("RUSSIAN");
        Directory foreign = new Directory("FOREIGN");

        File file1 = new File("readme.txt");
        File file2 = new File("Turgenev_Mumu.fb2");
        File file3 = new File("Kuprin_Poedinok.pdf");
        File file4 = new File("Gete_Faust.txt");
        File file5 = new File("Azimov_Fond.fb2");

        books.add(file1);
        books.add(russian);
        books.add(foreign);
        russian.add(file2);
        russian.add(file3);
        foreign.add(file4);
        foreign.add(file5);
        books.ls();
    }
}

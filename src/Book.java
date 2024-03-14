public class Book extends Item{
    public Book(String name, String description, String id, float price, String author, int numberofpages, String genre) {
        super(name, description, id, price);
        this.author = author;
        this.numberofpages = numberofpages;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberofpages() {
        return numberofpages;
    }

    public void setNumberofpages(int numberofpages) {
        this.numberofpages = numberofpages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    private String author;
    private int numberofpages;
    private String genre;

    @Override
    public void showInfo(){
        System.out.println("Tên của sản phẩm là: " + name);
        System.out.println("Mô tả: " + description);
        System.out.println("ID: " + id);
        System.out.println("Giá: " + price);
        System.out.println("Tác giả: " + author);
        System.out.println("Số trang: " + numberofpages);
        System.out.println("Thể loại: " + genre);
    }
}

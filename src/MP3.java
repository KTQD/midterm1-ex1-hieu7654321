public class MP3 extends Item{
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public MP3(String name, String description, String id, float , int duration) {
        super(name, description, id, price);
        this.duration = duration;
    }

    private int duration;

    @Override
    public void showInfo(){
        System.out.println("Tên của sản phẩm là: " + name);
        System.out.println("Mô tả: " + description);
        System.out.println("ID: " + id);
        System.out.println("Giá: " + price);
        System.out.println("Thời lượng: " + duration);
    }
}

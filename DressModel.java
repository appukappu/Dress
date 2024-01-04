public class DressModel {
   private String colour;
   private String size;

    public DressModel(String colour, String size) {
        this.colour = colour;
        this.size = size;
    }

    @Override
    public String toString() {
        return "DressModel{" +
                "colour='" + colour + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}

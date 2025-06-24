public class Restaurant {
    private int restaurant_id;
    private String Rname;
    private String location;
    private String Type;
    private double rating;
    public Restaurant(int restaurant_id, String rname, String location, String type, double rating) {
        this.restaurant_id = restaurant_id;
        Rname = rname;
        this.location = location;
        Type = type;
        this.rating = rating;
    }
    public int getRestaurant_id() {
        return restaurant_id;
    }
    public String getRname() {
        return Rname;
    }
    public String getLocation() {
        return location;
    }
    public String getType() {
        return Type;
    }
    public double getRating() {
        return rating;
    }
}

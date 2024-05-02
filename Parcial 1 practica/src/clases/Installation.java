package clases;

public class Installation {//instalacion
    private String category;
    private String location;
    private String name;
    private String type;

    public Installation(String category, String location, String name, String type) {
        this.category = category;//categoria
        this.location = location;//localizacion
        this.name = name;//nombre
        this.type = type;//tipo
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

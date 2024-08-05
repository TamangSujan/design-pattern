package structural.flyweight.implementation;

public class FlyWeightImage {
    private final String imageLocation;
    private final String image;
    public FlyWeightImage(String imageLocation){
        this.imageLocation = imageLocation;
        image = imageLocation;
    }

    public String getImage(){
        return image;
    }

    public String getImageLocation(){
        return imageLocation;
    }
}

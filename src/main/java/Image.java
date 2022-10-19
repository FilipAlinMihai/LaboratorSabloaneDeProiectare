public class Image implements Element {

    private String imageName;

    public Image(String name)
    {
        imageName=name;
    }

    public void print()
    {
        System.out.println("Image with name: "+imageName);
    }
}

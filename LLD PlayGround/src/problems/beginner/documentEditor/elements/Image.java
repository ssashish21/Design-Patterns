package problems.beginner.documentEditor.elements;

public class Image implements DocumentElement{
    private String imagePath;

    public Image(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public void render() {
        System.out.println("Rendering image from path : " + imagePath);
    }
}

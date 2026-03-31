package problems.beginner.documentEditor.elements;

public class Text implements DocumentElement{
    private String content;

    public Text(String content) {
        this.content = content;
    }

    @Override
    public void render() {
        System.out.println("Simple text : " + content);
    }
}

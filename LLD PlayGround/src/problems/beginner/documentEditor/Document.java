package problems.beginner.documentEditor;

import problems.beginner.documentEditor.elements.DocumentElement;

import java.util.List;

public class Document {
    List<DocumentElement> elements;

    public Document(List<DocumentElement> elements) {
        this.elements = elements;
    }

    public List<DocumentElement> getElements() {
        return elements;
    }

    public void addElement(DocumentElement element) {
        elements.add(element);
    }

    public void removeElement(DocumentElement element) {
        elements.remove(element);
    }

    public void render() {
        for (DocumentElement element : elements) {
            element.render();
        }
    }
}

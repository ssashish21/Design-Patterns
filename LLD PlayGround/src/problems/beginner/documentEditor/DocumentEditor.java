package problems.beginner.documentEditor;

import problems.beginner.documentEditor.elements.DocumentElement;
import problems.beginner.documentEditor.elements.Image;
import problems.beginner.documentEditor.elements.Text;
import problems.beginner.documentEditor.persistance.Persistance;

public class DocumentEditor {
    Document document;

    public DocumentEditor(Document document) {
        this.document = document;
    }

    public void addText(String text) {
        document.addElement(new Text(text));
    }

    public void addImage(String imagePath) {
        // For simplicity, we are treating images as text elements
        document.addElement(new Image("Image: " + imagePath));
    }

    public void saveDocument(Persistance persistance) {
        persistance.save(document);
    }

    public void renderDocument() {
        for(DocumentElement element : document.getElements()) {
            element.render();
        }
    }

}

package problems.beginner.documentEditor;

import problems.beginner.documentEditor.persistance.Persistance;
import problems.beginner.documentEditor.persistance.SaveToDB;
import problems.beginner.documentEditor.persistance.SaveToFile;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Document document = new Document(new ArrayList<>());
        Persistance saveToFile = new SaveToFile();
        Persistance saveToDatabase = new SaveToDB();

        DocumentEditor editor = new DocumentEditor(document);
        editor.addText("Hello, World!");
        editor.addImage("/path/to/image.png");
        editor.renderDocument();

        editor.saveDocument(saveToFile);

    }
}

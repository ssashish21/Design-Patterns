package problems.beginner.documentEditor.persistance;

import problems.beginner.documentEditor.Document;

public class SaveToFile implements Persistance{
    @Override
    public void save(Document document) {
        // Logic to save the document to a file
        System.out.println("Document saved to file.");
    }
}

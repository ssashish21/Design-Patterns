package problems.beginner.documentEditor.persistance;

import problems.beginner.documentEditor.Document;

public class SaveToDB implements Persistance{
    @Override
    public void save(Document document) {
        // Logic to save the document to a database
        System.out.println("Document saved to database.");
    }
}

public abstract class Application {
    public void newDocument() {
        Document document = createDocument();
        document.open();
        // Additional logic for a new document
    }

    public void saveDocument(Document document) {
        document.save();
        // Additional logic for saving a document
    }

    protected abstract Document createDocument();
}
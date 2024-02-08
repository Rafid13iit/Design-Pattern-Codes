public class Client {
    public static void main(String[] args) {
        Application drawingApp = new DrawingApplication();
        Application textApp = new TextApplication();

        Document drawingDoc = drawingApp.createDocument();
        Document textDoc = textApp.createDocument();

        drawingApp.newDocument();
        drawingApp.saveDocument(drawingDoc);

        textApp.newDocument();
        textApp.saveDocument(textDoc);
    }
}
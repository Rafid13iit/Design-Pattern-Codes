public class TextApplication extends Application {
    @Override
    protected Document createDocument() {
        return new TextDocument();
    }
}
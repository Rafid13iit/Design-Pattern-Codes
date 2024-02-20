package ConcreteCreators;

import AbstractProduct.*;
import ConcreteProducts.*;
import Creator.*;

public class TextApplication extends Application {
    @Override
	public Document createDocument() {
        return new TextDocument();
    }
}

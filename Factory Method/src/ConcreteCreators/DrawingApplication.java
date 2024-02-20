package ConcreteCreators;

import AbstractProduct.*;
import ConcreteProducts.*;
import Creator.*;

public class DrawingApplication extends Application {
    @Override
	public Document createDocument() {
        return new DrawingDocument();
    }
}
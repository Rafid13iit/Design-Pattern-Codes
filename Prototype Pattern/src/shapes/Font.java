package shapes;

public class Font {
    private String fontFace;

    public Font(String fontFace) {
        this.fontFace = fontFace;
    }

    public String getFontFace() {
        return fontFace;
    }

    public void setFontFace(String fontFace) {
        this.fontFace = fontFace;
    }

    @Override
    public String toString() {
        return "Font: " + fontFace;
    }
}

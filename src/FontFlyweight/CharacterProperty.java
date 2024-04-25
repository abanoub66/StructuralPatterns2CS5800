package FontFlyweight;


import FontFlyweight.Enums.Color;
import FontFlyweight.Enums.Font;

public class CharacterProperty {
    private Font font;
    private Color color;
    private int size;

    public CharacterProperty(Font font, Color color, int size) {
        this.font = font;
        this.color = color;
        this.size = size;
    }

    public Font getFont() {
        return font;
    }

    public Color getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

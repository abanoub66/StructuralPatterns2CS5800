package FontFlyweight;


import FontFlyweight.Enums.Color;
import FontFlyweight.Enums.Font;

public class Character {

    private final char CHARACTER;
    private final int INDEX;


    public Character(char character, int index) {
        this.CHARACTER = character;
        this.INDEX = index;
    }



    public void setFont(Font font, CharacterFactory context) {
        CharacterProperty g = context.getCharacterProperty(INDEX);
        g.setFont(font);
        context.setCharacterProperty(g, INDEX);
    }


    public Font getFont(CharacterFactory context) {
        return context.getCharacterProperty(INDEX).getFont();
    }


    public void setColor(Color color, CharacterFactory context) {
        CharacterProperty g = context.getCharacterProperty(INDEX);
        g.setColor(color);
        context.setCharacterProperty(g, INDEX);
    }


    public Color getColor(CharacterFactory context) {
        return context.getCharacterProperty(INDEX).getColor();
    }


    public void setSize(int size, CharacterFactory context) {
        CharacterProperty g = context.getCharacterProperty(INDEX);
        g.setSize(size);
        context.setCharacterProperty(g, INDEX);
    }

    public char getCharacter() {
        return CHARACTER;
    }

    public int getIndex() {
        return INDEX;
    }

    public int getSize(CharacterFactory context) {
        return context.getCharacterProperty(INDEX).getSize();
    }


    public String toString() {
        return CHARACTER + "";
    }
}

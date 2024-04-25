import FontFlyweight.Character;
import FontFlyweight.CharacterFactory;
import FontFlyweight.CharacterProperty;
import FontFlyweight.Enums.Color;
import FontFlyweight.Enums.Font;

import java.util.ArrayList;
import java.util.List;

public class FlyweightDriver {

    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();
        List<Character> string = new ArrayList<>();
        CharacterProperty first = new CharacterProperty(Font.TIMES_NEW_ROMAN, Color.RED, 12);
        CharacterProperty second = new CharacterProperty(Font.TIMES_NEW_ROMAN, Color.BLACK, 12);
        CharacterProperty third = new CharacterProperty(Font.ARIAL, Color.BLUE, 13);
        CharacterProperty fourth = new CharacterProperty(Font.VERDANA, Color.BLUE, 13);
        string.add(new Character('H', 0));
        string.add(new Character('e', 1));
        string.add(new Character('l', 2));
        string.add(new Character('l', 3));
        string.add(new Character('o', 4));
        string.add(new Character('W', 5));
        string.add(new Character('o', 6));
        string.add(new Character('r', 7));
        string.add(new Character('l', 8));
        string.add(new Character('d', 9));
        string.add(new Character('C', 10));
        string.add(new Character('S', 11));
        string.add(new Character('5', 12));
        string.add(new Character('8', 13));
        string.add(new Character('0', 14));
        string.add(new Character('0', 15));
        for (int i = 0; i < string.size(); i++) {
            if (i % 4 == 0) {
                characterFactory.setCharacterProperty(first, i);
            } else if (i % 3 == 0) {
                characterFactory.setCharacterProperty(second, i);
            } else if (i % 2 == 0) {
                characterFactory.setCharacterProperty(third, i);
            } else {
                characterFactory.setCharacterProperty(fourth, i);
            }
        }

        for (Character character : string) {
            System.out.println(character.getCharacter() + " using font " + character.getFont(characterFactory) +
                    " with the color " + character.getColor(characterFactory) +
                    " at size " + character.getSize(characterFactory));
        }
    }
}

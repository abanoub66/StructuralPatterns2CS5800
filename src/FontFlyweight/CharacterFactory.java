package FontFlyweight;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharacterFactory {

    private Map<CharacterProperty, Set<Integer>> characterProperties;

    public CharacterFactory() {
        characterProperties = new HashMap<>();
    }

    public CharacterProperty getCharacterProperty(int index) {
        for (CharacterProperty characterProperty : characterProperties.keySet()) {
            if (this.characterProperties.get(characterProperty).contains(index)) {
                return characterProperty;
            }
        }
        return null;
    }

    public void setCharacterProperty(CharacterProperty characterProperty, int index) {
        Set<Integer> indices;
        if (this.characterProperties.containsKey(characterProperty)) {
            indices = this.characterProperties.get(characterProperty);
        } else {
            indices = new HashSet<>();
        }
        indices.add(index);
        this.characterProperties.put(characterProperty, indices);
    }
}

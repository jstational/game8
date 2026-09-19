package game8.world.blocks.production.crafters;

import mindustry.world.*;
import mindustry.gen.*;
import game8.struct.*;
import arc.struct.*;

/** multiple crafting recipes, set by the player */
public class MultiCrafter extends Block {
    public Seq<Recipe> recipes;

    public MultiCrafter(String name) {
        super(name);
    }

    public class MultiCrafterBuild extends Building {
        public Recipe recipe;
        public MultiCrafter block;
    }
}
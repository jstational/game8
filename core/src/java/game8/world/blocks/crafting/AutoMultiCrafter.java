package game8.world.blocks.production.crafters;

import mindustry.world.*;
import mindustry.gen.*;
import game8.struct.*;
import arc.struct.*;

/** multiple crafting recipes, selected automatically
 * must not contain two of the same recipe
 */
public class AutoMultiCrafter extends Block {
    public Seq<Recipe> recipes;

    public AutoMultiCrafter(String name) {
        super(name);
    }

    public class AutoMultiCrafterBuild extends Building {
        public AutoMultiCrafter block;
    }
}
package game8.world.blocks.distribution.items;

import mindustry.world.blocks.distribution.*;
import mindustry.type.*;
import arc.struct.*;

public class FilterDuctJunction extends DuctJunction {
    public Seq<Item> allowedItems;

    public class FilterDuctJunctionBuild extends DuctJunctionBuild {
        public FilterDuctJunction block;
    }
}
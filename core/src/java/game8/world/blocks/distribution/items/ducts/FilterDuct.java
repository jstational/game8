package game8.world.blocks.distribution.items;

import mindustry.world.blocks.distribution.*;
import mindustry.type.*;
import arc.struct.*;

/** Duct that only allows allowedItems to pass */
public class FilterDuct extends Duct {
    public Seq<Item> allowedItems;

    public FilterDuct(String name) {
        super(name);
    }

    public class FilterDuctBuild extends DuctBuild {
        public FilterDuct block;
    }
}
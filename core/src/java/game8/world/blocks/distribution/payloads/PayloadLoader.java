package game8.world.blocks.distribution.payloads;

import mindustry.world.*;
import mindustry.gen.*;

public class PayloadLoader extends Block {
    public PayloadLoader(String name) {
        super(name);
    }

    public class PayloadLoaderBuild extends Building {
        public PayloadLoader block;
    }
}
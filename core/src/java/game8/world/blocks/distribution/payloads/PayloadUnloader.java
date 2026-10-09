package game8.world.blocks.distribution.payloads;

import mindustry.world.*;
import mindustry.gen.*;

public class PayloadUnloader extends Block {
    public PayloadUnloader(String name) {
        super(name);
    }

    public class PayloadUnloaderBuild extends Building {
        public PayloadUnloader block;
    }
}
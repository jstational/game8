package game8.world.blocks.distribution.payloads;

import mindustry.world.*;
import mindustry.gen.*;

public class PayloadBridge extends Block {
    public TextureRegion bridgePoint, bridge;

    public PayloadBridge(String name) {
        super(name);
    }

    public class PayloadBridgeBuild extends Building {
        public PayloadBridge block;
    }
}
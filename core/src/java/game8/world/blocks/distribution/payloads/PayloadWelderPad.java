package game8.world.blocks.distribution.payloads;

import mindustry.world.*;
import mindustry.gen.Building;
import mindustry.world.blocks.payloads.*;

/** welds payloads on a pad that can be brought into a PayloadDuctAcceptor or collected by a PayloadCrane */
public class PayloadWelderPad extends Block {
    public PayloadWelderPad(String name) {
        super(name);
    }

    public class PayloadWelderPadBuild extends Building {
        public PayloadWelderPad block;
        
        public int weldPercent;
        public Payload payload;
    }
}
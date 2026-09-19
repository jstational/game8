package game8.world.blocks.distribution.payloads;

import mindustry.world.*;
import mindustry.gen.Building;
import mindustry.world.blocks.payloads.*;

/** an output for PayloadDucts */
public class PayloadPad extends Block {
    public PayloadPad(String name) {
        super(name);
    }

    public class PayloadPadBuild extends Building {
        public PayloadPad block;

        public Payload payload;
    }
}
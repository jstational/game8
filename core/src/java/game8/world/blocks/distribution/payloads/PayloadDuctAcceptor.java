package game8.world.blocks.distribution.payloads;

import mindustry.world.*;
import mindustry.gen.Building;
import mindustry.world.blocks.payloads.*;

/** accepts payloads and sends them forward */
public class PayloadDuctAcceptor extends Block {
    public float moveDelay = 0f;

    public PayloadDuctAcceptor(String name) {
        super(name);
    }

    public class PayloadDuctAcceptorBuild extends Building {
        public PayloadDuctAcceptor block;

        public Payload payload;
    }
}
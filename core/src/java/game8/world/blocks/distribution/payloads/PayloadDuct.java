package game8.world.blocks.distribution.payloads;

import mindustry.world.*;
import mindustry.gen.Building;
import mindustry.world.blocks.payloads.*;

/** moves payloads forward */
public class PayloadDuct extends Block {
    public float moveSpeed = 0f;

    public PayloadDuct(String name) {
        super(name);
    }

    public class PayloadDuctBuild extends Building {
        public PayloadDuct block;

        public Payload payload;
    }
}
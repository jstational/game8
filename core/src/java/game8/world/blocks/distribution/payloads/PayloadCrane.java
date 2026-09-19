package game8.world.blocks.distribution.payloads;

import mindustry.gen.Building;
import arc.math.geom.*;
import arc.graphics.g2d.*;
import mindustry.world.*;
import game8.struct.*;
import java.lang.Integer;

/** brings blocks, units, or payloads on PayloadPad into another location */
public class PayloadCrane extends Block {
    public TextureRegion extensionMidRegion;
    public TextureRegion extensionRegion;
    public TextureRegion clawRegion;
    public TextureRegion extensionClawRegion;

    public PayloadCrane(String name) {
        super(name);
    }

    public class PayloadCraneBuild extends Building {
        public PayloadCrane block;
    }
}
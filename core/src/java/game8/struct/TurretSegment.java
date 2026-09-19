package game8.struct;

import arc.graphics.g2d.*;
import arc.struct.*;

public class TurretSegment {
    public float x, y, scale = 0f;
    public Seq<TurretSegment> turretSegments;
    public Seq<Bullet> bullets;
    public Seq<Effect> ejectEffects, shootEffects;
    public boolean flipSprite = false;
    public int layer = 0;
    public IntSeq shootOrders;
    public Seq<DrawPart> parts;
    public TextureRegion texture;

    public TurretSegment(float x, float y, float scl, Seq<TurretSegmentSegment> ts, Seq<Bullet> blts, Seq<Effect> ejfx, Seq<Effect> sofx, boolean flip, int lr, IntSeq soor, Seq<DrawPart> dps, TextureRegion txt, boolean fs) {
        this.x = x;
        this.y = y;
        this.scale = scl;
        this.turretSegments = ts;
        this.bullets = blts;
        this.ejectEffects = ejfx;
        this.shootEffects = sofx;
        this.flipSprite = fs;
        this.layer = lr;
        this.shootOrders = soor;
        this.parts = dps;
        this.texture = txt;
    }

    public void draw(float x, float y, float rot) {}
}
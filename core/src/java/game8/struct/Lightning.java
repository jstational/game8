package game8.struct;

import mindustry.type.*;
import arc.graphics.*;
import arc.math.Mathf;

public class Lightning {
    public float maxLength;
    public float minLength;
    public int maxSegments;
    public int minSegments;
    
    public float damage;

    public StatusEffect status;

    public Color color;

    public Lightning(float mxl, float mnl, int mxs, int mns, float d, StatusEffect stat, Color c) {
        this.maxLength = mxl;
        this.minLength = mnl;
        this.maxSegments = mxl;
        this.minSegments = mnl;
        this.damage = d;
        this.status = stat;
        this.color = c;
    }

    public float randLen() {
        return Mathf.random(this.minLength, this.maxLength);
    }

    public int randSeg() {
        return Mathf.random(this.minSegments, this.maxSegments);
    }
}
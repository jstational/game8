package game8.struct;

import mindustry.type.*;
import mindustry.ctype.*;
import arc.struct.Seq;

public class Recipe {
    private Seq<ItemStack> items;
    private Seq<LiquidStack> liquids;
    private Seq<PayloadStack> payloads;
    private int power;

    private Seq<UnlockableContent> outs;
}
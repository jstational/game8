package game8.world.blocks.production;

import mindustry.world.blocks.environment.Floor;
import mindustry.world.blocks.environment.StaticWall;
import arc.struct.Seq;
import mindustry.world.blocks;

public class PressureGenerator extends Block {
  public Seq<Floor> tileboost = new Seq<>();
  public Seq<StaticWall> wallboost = new Seq<>();
}

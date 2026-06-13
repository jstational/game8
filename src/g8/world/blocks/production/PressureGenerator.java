package game8.blocks.production

import mindustry.world.blocks.environment.Floor;
import mindustry.world.blocks.environment.StaticWall;
import arc.struct.Seq;
import game8.blocks;

public class PressureGenerator extends g8b {
  private Seq<Floor> tileboost = new Seq<>();
  private Seq<StaticWall> wallboost = new Seq<>();
}

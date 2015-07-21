import java.util.List;

public interface Mover{
     // センサーの距離を受け取り、移動
     List<Vec2D> getMoveInfo(double distance);
}

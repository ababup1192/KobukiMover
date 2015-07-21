import java.util.List;
import java.util.ArrayList;

public class Follow implements Mover{

    public List<Vec2D> getMoveInfo(double distance){
        List<Vec2D> list = new ArrayList<Vec2D>();
        // distance情報から、どれくらい近づけるかの計算をする。 listに追加。
        list.add(new Vec2D(0.0, 0.0));

        return list;
    }

}

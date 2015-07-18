import java.util.List;
import java.util.ArrayList;

public class Dance implements Mover{

    public List<Vec2D> getMoveInfo(double distance){
        // time情報から今のするべき動きを取り出す。 ファイル？ データベースから決められた動きを選択。
        List<Vec2D> list = new ArrayList<Vec2D>();
        list.add(new Vec2D(0.0, 0.0));
        list.add(new Vec2D(0.0, 0.0));
        list.add(new Vec2D(0.0, 0.0));
        list.add(new Vec2D(0.0, 0.0));

        return list;
    }

}

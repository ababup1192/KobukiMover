import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class MoverSelector{
    private HashMap<GestureCode, Mover> moverMap;

    // 動作の登録をするコンストラクタ。
    public MoverSelector(){
        moverMap = new HashMap<GestureCode, Mover>();
        // 動作が増えると、ここが増えるだけ。
        moverMap.put(GestureCode.LEFT_HAND_UP, new Dance());
        moverMap.put(GestureCode.RIGHT_HAND_UP, new Follow());
        // moverMap.put(GestureCode.BOTH_HANDS_UP, new Singing());
    }

    public void execute(GestureCode gestureCode, double distance){
        Mover mover = moverMap.get(gestureCode);
        if(mover != null){
            List<Vec2D> moveInfo = mover.getMoveInfo(distance);
            System.out.println(mover.getClass().getSimpleName());
            // 実際には、Kobukiコンポーネントへ書き出し。
            for(Vec2D info: moveInfo){
                System.out.println(info);
            }
        }
    }

    public static void main(String args[]){
        // 実際は、Kinectコンポーネントから来る、シグナルで判断。
        MoverSelector selector = new MoverSelector();
        selector.execute(GestureCode.LEFT_HAND_UP, 5.5);
        selector.execute(GestureCode.RIGHT_HAND_UP, 6);
    }

}

public class Vec2D{

    // 角速度
    public final double va;
    // 加速度
    public final double vx;

    public Vec2D(double va, double vx){
        this.va = va;
        this.vx = vx;
    }

    @Override
    public String toString(){
        return "角速度: " + va + ", 加速度: " + vx;
    }
}

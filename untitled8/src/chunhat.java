public class chunhat {
    private int x;
    private int y;

    public chunhat(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public float getchuVi() {
        return (x + y)*2;
    }
    public float getdienTich() {
        return (x*y);
    }
}

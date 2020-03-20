public class Demo {

    private int x;
    private int y;

    Demo (int x, int y){this.x = x; this.y = y;};

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZbir(){
        int zbir = getX() + getY();
        zbir /= 2;
        return zbir;
    }

    public static void main(String[] args){
       Demo d = new Demo(10,20);
       d.setX(20);
       d.setY(30);
       System.out.println(d.getZbir());
    }

}


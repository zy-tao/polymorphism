package Class;

/**
 * @className: Pet
 * @author: Tao_zy
 * @date: 2023/3/29
 **/
public abstract class Pet {
    //健康值
    protected int health;

    public static int a;
    //亲密度
    protected int love;
    //性别
    protected String sex;


    //无参构造方法
    public Pet() {
    }


    //含参构造方法
    public Pet(int health, int love, String sex) {
        this.health = health;
        this.love = love;
        this.sex = sex;
    }

    public int getHealth() {
        return health;
    }

    public int getLove() {
        return love;
    }

    public String getSex() {
        return sex;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void show() {
        System.out.println("健康值是：" + health + "亲密度是：" + love);
    }

    public abstract void goHospital();

}

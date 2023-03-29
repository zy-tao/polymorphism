package Class;

/**
 * @className: Dog
 * @author: Tao_zy
 * @date: 2023/3/29
 **/
public class Dog extends Pet{

    //品种
    private String strain;

    //无参构造方法


    public Dog() {
    }

    //含参构造方法


    public Dog(int health, int love, String sex, String strain) {
        super(health, love, sex);
        this.strain = strain;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    public void method(){
        System.out.println(super.health);
    }
    public void show(){
        System.out.println("健康值是：" + health + "亲密度是：" + love + "性别是：" + sex + "品种是：" + strain);
    }

    public void goHospital(){

        setHealth(getHealth() + 5);
        System.out.println("狗狗打针吃药。。。");
    }

    public void play(){
        System.out.println("狗狗在玩。。。");
    }
}
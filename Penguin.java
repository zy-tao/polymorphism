package Class;

/**
 * @className: Penguin
 * @author: Tao_zy
 * @date: 2023/3/29
 **/
public class Penguin extends Pet{

    private String hobby;

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void goHospital(){

        setHealth(getHealth() + 10);
        System.out.println("企鹅生病吃饭疗养。。。");
    }

    public void toHospital(Penguin penguin){
        if (penguin.getHealth() < 70){
            penguin.goHospital();
        }else {
            System.out.println("企鹅很健康！");
        }
    }

    public void swimming(){
        System.out.println("企鹅在游泳。。。");
    }
}

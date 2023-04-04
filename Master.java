package Class;

/**
 * @className: Mster
 * @author: Tao_zy
 * @date: 2023/3/29
 **/
public class Master {

    /*带狗狗去医院*/

    public void toHospital(Pet pet){

        if (pet.getHealth() < 70){
            pet.goHospital();
        }else {
            System.out.println("宠物很健康！");
        }
    }

    public void goPlay(Pet pet){
        if (pet instanceof Dog){
            Dog dog = (Dog) pet;
            dog.play();
        } else if (pet instanceof  Penguin) {
            ((Penguin) pet).swimming();
        }
    }
}

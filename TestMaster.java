package Class;

/**
 * @className: TestMaster
 * @author: Tao_zy
 * @date: 2023/3/29
 **/
public class TestMaster {

    public static void main(String[] args) {

/*        Master master = new Master();

        Dog dog = new Dog();

        dog.setHealth(60);

        master.toHospital(dog);
        System.out.println(dog.getHealth());*/

        Master master = new Master();

        //父类的引用指向子类的实例
        //编译看左边，运行看右边
        Pet pet = new Penguin();
        pet.setHealth(60);
        master.toHospital(pet);
        System.out.println(pet.getHealth());

        master.goPlay(pet);
    }


}

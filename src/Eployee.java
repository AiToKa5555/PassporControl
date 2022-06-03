public class Eployee extends People{
    private String workPass;
    public Eployee(String passport, String name, String age, String workPass){
        super(passport, name , age);
        this.workPass = workPass;

    }
    @Override
    public String toString() {
        return  " Пасспорт:" + this.getPassport() + "\n" +
                " Имя:" + this.getName() + "\n" +
                " Возраст:" + this.getAge() + "\n" +
                " Разришение работы в коипании:" + workPass + "\n";
 //               "id " + this.setId() + "\n";
    }
}

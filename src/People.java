public class People {
    private String passport;
    private String name;
    private String age;
    private int id = 0;
    public People(String passport, String name, String age){
        this.passport = passport;
        this.name = name;
        this.age = age;
        this.id += 1;
        setId(id);
    }

    public void setId(int id) {
        this.id +=1;
    }


    public String getPassport() {
        return passport;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return  " Пасспорт:" + passport + "\n" +
                " Имя:" + name + "\n" +
                " Возраст:" + age + "\n" +
                "id " + id + "\n";
    }
}

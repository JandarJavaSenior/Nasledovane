public class Person {
    private String name;
    private String profesiya;

    public Person(String name, String profesiya) {
        this.name = name;
        this.profesiya = profesiya;
    }
    public Person(){}
    public String zan (String ucheba){
        return ucheba;
    }
    public String dopZan (String dopUcheba){
        return dopUcheba;
    }
    public String est (String estEdu){
        return estEdu;
    }

    @Override
    public String toString() {
        return "Person: " +
                "Имя: " + name + "\n" +
                "Наименование: " + profesiya ;
    }
}

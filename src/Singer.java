public class Singer extends Person{
    private String nameBang;
    public Singer(String name, String profesiya,String nameBang) {
        super(name, profesiya);
    }

    public String getNameBang() {
        return nameBang;
    }

    public void setNameBang(String nameBang) {
        this.nameBang = "Название Группы : "+nameBang;

    }

    public String poet(){
        return "Он сегиз жaaaaaаш,\n" +
                "Тоодо тунук булак белең?\n" +
                "Болбосо андан учкан бубак белеeeң?\n" +
                "Кайрылбай кайда кеттиң, айтчы дегииии?\n" +
                "Адашып айлыңды мен сурап келееем.\n" +
                "Он сегиз жааааАААААааааААААААаааааш,\n" +
                "Жайдын жарык таңы белең?\n" +
                "Болбосо боз туйгундун шамы белең?\n" +
                "Бир жолу кайрылбастай тамшандырган,\n" +
                "Жылт эткен жаштыгымдын шамы белең?\n" +
                "Он сегиз жаААААААААААААААААш,\n" +
                "Күндө беле сенин серең?\n" +
                "Болбосо жүрөгүмдүн деми белеЕЕЕң.\n" +
                "Кош эми, өкүнсөм да унутпаймын,\n" +
                "Өткөргөн өмүрүмдү сени менеЕЕЕЕн.\n\n";
    }
    public String gitara(){
        return "Играет на гитрае!" +
                " \n" +
                "А дубы-колдуны\n" +
                "Что-то шепчут в тумане,\n" +
                "У поганых болот\n" +
                "Чьи-то тени встают...\n" +
                "Косят зайцы траву,\n" +
                "Трын-траву на поляне,\n" +
                "И от страха все быстрее\n" +
                "Песенку поют:\n" +
                "\n" +
                "А нам всё равно,\n" +
                "А нам всё равно,\n" +
                "Пусть боимся мы волка и сову.\n" +
                "Дело есть у нас -\n" +
                "В самый жуткий час\n" +
                "Мы волшебную\n" +
                "Косим трын-траву.\n" +
                "\n" +
                "А нам всё равно,\n" +
                "А нам всё равно,\n" +
                "Твёрдо верим мы\n" +
                "В древнюю молву.\n" +
                "Храбрым станет тот,\n" +
                "Кто три раза в год\n" +
                "В самый жуткий час\n" +
                "Косит трын-траву.\n" +
                "\n" +
                "А нам всё равно,\n" +
                "А нам всё равно,\n" +
                "Станем мы храбрей\n" +
                "И отважней льва.\n" +
                "Устоим хоть раз\n" +
                "В самый жуткий час,\n" +
                "Все напасти нам\n" +
                "Будут трын-трава. \n" +
                "\n" +
                "А нам всё равно,\n" +
                "А нам всё равно,\n" +
                "Твёрдо верим мы\n" +
                "В древнюю молву.\n" +
                "Храбрым станет тот,\n" +
                "Кто три раза в год\n" +
                "В самый жуткий час\n" +
                "Косит трын-траву.\n";
    }
}
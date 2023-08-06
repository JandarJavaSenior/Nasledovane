public class Main {
    public static void main(String[] args) {
        Prorammer prorammer = new Prorammer("Jandar","Progaammer!");
        prorammer.setNameKompnya("JandarMedia");

        Danser danser = new Danser("Albina","Бийчи");
        danser.setNameGrup("Chgulgan");

        Singer singer = new Singer("Мирбек","Ырчы!","");
        singer.setNameBang("Кыргыз Обондору");
        System.out.println(prorammer);
        System.out.println();
        System.out.println(prorammer.getNameKompnya());
        System.out.println();
        System.out.println(prorammer.zan("Учиться каждый день программированию"));
        System.out.println();
        System.out.println(prorammer.dopZan("Ходить на дополнительные занятия"));
        System.out.println();
        System.out.println(prorammer.est("Есть умеренно, но из-за сильной мозговой активности голодает"));
        System.out.println();
        System.out.println(prorammer.kodin());
        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println();
        System.out.println(danser);
        System.out.println();
        System.out.println(danser.getNameGrup());
        System.out.println();
        System.out.println(danser.zan("Каждый день танцует на публику, чтобы заработать деньги"));
        System.out.println();
        System.out.println(danser.dopZan("Ходит на дополнительные уроки по программированию," +
                " так как не подобает женщине танцевать перед другими мужчинами"));
        System.out.println();
        System.out.println(danser.est("Ест мало, так как хочет сэкономить деньги"));
        System.out.println();
        System.out.println(danser.tansu());

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(singer);
        System.out.println();
        System.out.println(singer.getNameBang());
        System.out.println();
        System.out.println(singer.zan("Учиться красиво петь"));
        System.out.println();
        System.out.println(singer.dopZan("Ходит на курсы лечения k психологу, так как чувствует себя неуверенным"));
        System.out.println();
        System.out.println(singer.est("Ест много, так этим гасит чувство грусти"));
        System.out.println();
        System.out.println(singer.poet());
        System.out.println();
        System.out.println(singer.gitara());
    }
}
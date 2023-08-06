public class Prorammer extends Person{
    private String nameKompnya;
    public Prorammer(String name, String profesiya) {
        super(name, profesiya);
    }

    public String getNameKompnya() {
        return nameKompnya;
    }

    public void setNameKompnya(String nameKompnya) {
        this.nameKompnya ="Название комапании : "+ nameKompnya;
    }

    public String kodin(){
        return "Пишет какой-то код: "+"public class Factorial {\n" +
                "    public static int factorial(int n) {\n" +
                "        if (n == 0 || n == 1) {\n" +
                "            return 1;\n" +
                "        } else {\n" +
                "            return n * factorial(n - 1);\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    public static void main(String[] args) {\n" +
                "        int number = 5;\n" +
                "        int result = factorial(number);\n" +
                "        System.out.println(\"Факториал числа \" + number + \" равен \" + result);\n" +
                "    }\n" +
                "}\n";

    }

}

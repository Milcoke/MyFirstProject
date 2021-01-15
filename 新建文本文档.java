public class Test {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("h\\wllo");
        Matcher matcher = pattern.matcher("123hello456");
        if (matcher.matches()){
            System.out.println(matcher.group());
        }else {
            System.out.println("不匹配");
        }
    }

    private static void test01() {
        System.out.println("123456789\rabc");
        System.out.println("123456789\nabc");
        System.out.println("123456789\n\rabc");
        System.out.println("123456789\fabc");//换页符
    }
}

package day02;
/**
 * 将字符串"123abc456def789ghi"中的英文部分替换为"#char#"
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {
        String s1 = "123abc456def789ghi";
        String regEx = "[a-z]+";
        s1 = s1.replaceAll(regEx,"#char#");
        System.out.println(s1);
    }
}

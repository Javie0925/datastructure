package broken;

/**
 * @author javie
 * @date 2019/8/3 15:54
 */
public class SimpleObject {

    static {
        System.out.println("hello world");
    }

    public String hello(){
        return "hello world";
    }
}

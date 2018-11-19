
package chapter4.demo2;

/**
 * 获取request对象参数和返回此对象到response
 *
 * Date 2018/11/16 上午9:21
 * Author muse
 */
public class DemoObj {

    private Long id;

    private String name;

    public DemoObj() { // jackson对Object和json做相互转换的时候，一定需要一个空的构造方法
        super();
    }

    public DemoObj(Long id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

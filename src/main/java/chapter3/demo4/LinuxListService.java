
package chapter3.demo4;

/**
 * Linux下的列表命令
 *
 * Date 2018/11/8 下午1:43
 * Author muse
 */
public class LinuxListService implements ListService {

    @Override
    public String showListConmand() {
        return "ls";
    }
}


package chapter3.demo4;

/**
 * Windows下的列表命令
 *
 * Date 2018/11/8 下午1:43
 * Author muse
 */
public class WindowsListService implements ListService {

    @Override
    public String showListConmand() {
        return "dir";
    }
}

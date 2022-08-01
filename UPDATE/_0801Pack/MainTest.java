package HomeWork.UPDATE._0801Pack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MainTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("CN", "中国");
        map.put("USA", "美国");
        map.put("EU", "欧洲");

        Set<String> set = map.keySet();

        System.out.println("迭代器遍历__________________");
        //迭代器遍历
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = map.get(key);
            System.out.println(key + "  " + value);
        }

        System.out.println("增强for__________________");
        //增强for
        for (String key : set) {
            String value = map.get(key);
            System.out.println(key + "  " + value);
        }

        System.out.println("Entry遍历__________________");
        //Entry遍历
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }

        System.out.println("Lambda表达式__________________");
        //Lambda表达式
        map.forEach((key, value) -> {
            System.out.println(key + "  " + value);
        });
    }
}

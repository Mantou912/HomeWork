package HomeWork.UPDATE._0801Pack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MainTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("CN", "�й�");
        map.put("USA", "����");
        map.put("EU", "ŷ��");

        Set<String> set = map.keySet();

        System.out.println("����������__________________");
        //����������
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = map.get(key);
            System.out.println(key + "  " + value);
        }

        System.out.println("��ǿfor__________________");
        //��ǿfor
        for (String key : set) {
            String value = map.get(key);
            System.out.println(key + "  " + value);
        }

        System.out.println("Entry����__________________");
        //Entry����
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }

        System.out.println("Lambda���ʽ__________________");
        //Lambda���ʽ
        map.forEach((key, value) -> {
            System.out.println(key + "  " + value);
        });
    }
}

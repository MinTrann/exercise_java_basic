
// * Viết chương trình tìm tất cả các số chia hết cho 7 nhưng không phải bội số của 5, nằm trong đoạn 10 - 200. Các số thu được sẽ được in thành chuổi một dòng, cách nhua bằng dáu phẩy.
import java.util.List;
import java.util.StringJoiner;
import java.util.ArrayList;

public class Bai10 {
    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 10; i <= 200; i++) {
            if (i % 7 == 0 && (i % 5 != 0)) {
                list.add(i);
            }
        }
        // * Hiển thị list ra màn hình */
        showList(list);
    }

    public static void showList(List<Integer> list) {
        if (list != null && !list.isEmpty()) {
            StringJoiner joiner = new StringJoiner(", ");
            for (Integer num : list) {
                joiner.add(num.toString());
            }
            System.out.println(joiner);
        }
    }
}

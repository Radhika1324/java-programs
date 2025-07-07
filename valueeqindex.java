
//valueequalindex
import java.util.*;

class valueequalindex {
    public List<Integer> valueEqualToIndex(List<Integer> nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == i + 1) {
                list.add(nums.get(i));
            }

        }
        return list;
    }
}
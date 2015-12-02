package Week03.Monday.MoreGeneric;

/**
 * Created by inspired on 02.12.15.
 */
public class GenericPalindrome {
    public static <T1> boolean isPalindrome(T1 item){
        String itemStr = item.toString();
        StringBuilder itemComparable = new StringBuilder().append(itemStr);
        return itemComparable == itemComparable.reverse();
    }
}

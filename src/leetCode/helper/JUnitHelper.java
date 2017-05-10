package leetCode.helper;

public class JUnitHelper {

	public static boolean checkLinkLists(ListNode expected, ListNode actual) {
		if(expected == null && actual == null) {
			return true;
		}
		if(expected == null && actual != null) {
			return false;
		}
		if(expected != null && actual == null) {
			return false;
		}
		if(expected.val == actual.val) {
			return checkLinkLists(expected.next, actual.next);
		}
		return false;
	}

}

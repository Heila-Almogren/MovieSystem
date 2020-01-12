public class IntEqualCond implements Cond<Integer> {
	private Integer compare;
	public IntEqualCond(Integer str) {
		this.compare = str;
	}
	@Override
	public boolean test(Integer s) {
		return compare.equals(s);
                
	}
}

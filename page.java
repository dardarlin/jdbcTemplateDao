public class Page<T> {
	
	private List<T> data;//分页数据
	private long count;//总记录数
	private int preSize =10;//分页大小
	private int offset = 0;//偏移量
	private int currNum = 0;//当前页
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	public int getPreSize() {
		return preSize;
	}
	public void setPreSize(int preSize) {
		this.preSize = preSize;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public int getCurrNum() {
		return currNum;
	}
	public void setCurrNum(int currNum) {
		this.currNum = currNum;
	}
	
}

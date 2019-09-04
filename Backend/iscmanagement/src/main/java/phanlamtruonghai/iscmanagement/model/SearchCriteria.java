package phanlamtruonghai.iscmanagement.model;

public class SearchCriteria {
	private String key;
	private SearchOperation operation;
	private Object value;
	private boolean orPredicate;

	public SearchCriteria(String key, SearchOperation operation, Object value) {
		super();
		this.key = key;
		this.operation = operation;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public void setOperation(SearchOperation operation) {
		this.operation = operation;
	}

	public SearchOperation getOperation() {
		return this.operation;
	}

	public boolean isOrPredicate() {
		return orPredicate;
	}

	public void setOrPredicate(boolean orPredicate) {
		this.orPredicate = orPredicate;
	}
}

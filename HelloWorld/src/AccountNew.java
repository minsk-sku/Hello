
public class AccountNew {
	private String id;
	private String name;
	private int course;

	public AccountNew(String id, String name, int course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

}

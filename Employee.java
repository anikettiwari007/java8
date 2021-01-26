
public class Employee {

	private Long id;
    private String name;
    private String dob;
    private String doj;
    private String dom;

    public Employee() {
    }

    public Employee(String name, String dob, String doj, String dom) {
        this.name = name;
        this.dob = dob;
        this.doj = doj;
        this.dom = dom;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return this.dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDoj() {
        return this.doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }

    public String getDom() {
        return this.dom;
    }

    public void setDom(String dom) {
        this.dom = dom;
    }
    
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dob=" + dob + ", doj=" + doj + ", dom=" + dom + "]";
	}
}

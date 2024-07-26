package edu.cpcc.labs.model;

public class Greeting {

	private Long id;
	private String message;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Greeting(Long id, String message) {
		super();
		this.id = id;
		this.message = message;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.getId());
		builder.append(":");

		builder.append(this.getMessage());

		builder.append(",");

		builder.append("Testing with Git Hub and Travis CI !!");
		return builder.toString();

	}

}

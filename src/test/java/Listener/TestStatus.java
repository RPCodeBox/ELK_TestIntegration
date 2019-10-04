package Listener;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TestStatus {
	@JsonProperty("testName")
	private String testName;

	@JsonProperty("testModule")
	private String testModule;

	@JsonProperty("testScript")
	private String testScript;

	@JsonProperty("description")
	private String description;

	@JsonProperty("status")
	private String status;

	@JsonProperty("executionTime")
	private String executionTime;
	
	
	public void setTestName(String testName) {
		this.testName = testName;
	}

	public void setTestModule(String testModule) {
		this.testModule = testModule;
	}

	public void setTestScript(String testScript) {
		this.testScript = testScript;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public void setExecutionDate(String executionTime) {
		this.executionTime = executionTime;
	}

}
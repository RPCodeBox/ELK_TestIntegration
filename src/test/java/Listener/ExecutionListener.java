package Listener;

import java.time.LocalDateTime;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.Unirest;

public class ExecutionListener implements ITestListener {
	ObjectMapper OM = new ObjectMapper();
	String CONTENT_TYPE = "Content-Type";
	String CONTENT_TYPE_VALUE = "application/json";
	String ELASTICSEARCH_URL = "http://localhost:9200/app/suite";
	private TestStatus testStatus;

	public void onTestStart(ITestResult iTestResult) {
		this.testStatus = new TestStatus();
	}

	public void onTestSuccess(ITestResult iTestResult) {
		this.sendStatus(iTestResult, "PASS");
	}

	public void onTestFailure(ITestResult iTestResult) {
		this.sendStatus(iTestResult, "FAIL");
	}

	public void onTestSkipped(ITestResult iTestResult) {
		this.sendStatus(iTestResult, "SKIPPED");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
		// skip
	}

	public void onStart(ITestContext iTestContext) {
		// skip
	}

	public void onFinish(ITestContext iTestContext) {
		// skip
	}

	private void sendStatus(ITestResult iTestResult, String status) {
		this.testStatus.setTestName("Test2");
		this.testStatus.setTestModule(iTestResult.getTestClass().getName());
		this.testStatus.setTestScript(iTestResult.getMethod().getMethodName());
		this.testStatus.setDescription(iTestResult.getMethod().getDescription());
		this.testStatus.setStatus(status);
		this.testStatus.setExecutionDate(LocalDateTime.now().toString());
		sendReport(this.testStatus);
	}

	private void sendReport(TestStatus testStatus2) {
		try {
			Unirest.post(ELASTICSEARCH_URL).header(CONTENT_TYPE, CONTENT_TYPE_VALUE)
					.body(OM.writeValueAsString(testStatus)).asJson();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

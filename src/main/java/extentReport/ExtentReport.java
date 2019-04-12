package extentReport;
import java.lang.reflect.Method;

import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport{
	ITestResult result;
	public ExtentHtmlReporter extentHtmlReporter;
	
	public ExtentTest extentTest;
	
	public ExtentReports extentReports;//3 classes from extent lib//extent reports attache report
	public void beforeClass() {

        extentHtmlReporter = new ExtentHtmlReporter("/1.1/extent.html");

        extentReports =new ExtentReports();

        extentReports.attachReporter(extentHtmlReporter);

        extentTest=extentReports.createTest(getClass().getSimpleName());

   
 }



 public void beforeMethod(Method result) {

        extentTest.log(Status.INFO, result.getName()+"Started..");

 }





 public void test1() {

        extentTest.log(Status.INFO, "test 1 started");

        extentTest.log(Status.INFO, "test 1 started");

 }




 public void test2() {

        extentTest.log(Status.INFO, "test 2 started");

        extentTest.log(Status.INFO, "test 2 started");

 }





 public void afterMethod(ITestResult result) {

        logReport(result);

       

 }



 public void logReport(ITestResult result) {

       

        if(result.getStatus()==result.FAILURE) {

               extentTest.log(Status.ERROR, result.getName()+"Failed");

               extentTest.log(Status.ERROR,result.getThrowable());

        }

       

        else if (result.getStatus()==result.SKIP) {

               extentTest.log(Status.SKIP, result.getName()+"Skipped");

               extentTest.log(Status.SKIP,result.getThrowable());

        }

       

        else if (result.getStatus()==result.SUCCESS) {

               extentTest.log(Status.INFO, result.getName()+"Success");

        }

       

       

 }




 public void Afterclass() {

       

        extentReports.flush();

 }

	

}

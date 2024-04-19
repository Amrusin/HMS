
package mYfirstProject;

import java.io.IOException;

public class CloseBrowserWithOutLaunching {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Runtime r=Runtime.getRuntime();
		Process proc = r.exec("taskill /im chrome.exe /f /t");

	}

}

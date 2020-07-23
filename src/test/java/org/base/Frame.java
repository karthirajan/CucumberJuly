package org.base;


import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({Frame2.class,Frame3.class})
public class Frame {
      public static void main(String[] args) {
	  Result r = JUnitCore.runClasses(Frame2.class,Frame3.class);
	  System.out.println(r.getFailureCount());
	  System.out.println(r.getIgnoreCount());
	  System.out.println(r.getRunTime());
	  System.out.println(r.getRunCount());
	  System.out.println(r.wasSuccessful());
	  List<Failure> f = r.getFailures();
	   for (Failure x : f) {
		   System.out.println(x.toString());
	   }
}
}


package org.jboss.tools.fuse.qe.reddeer.tests.suite;

import org.jboss.reddeer.junit.runner.RedDeerSuite;
import org.jboss.tools.fuse.qe.reddeer.tests.CamelEditorTest;
import org.jboss.tools.fuse.qe.reddeer.tests.ComponentTest;
import org.jboss.tools.fuse.qe.reddeer.tests.DataTransformationTest;
import org.jboss.tools.fuse.qe.reddeer.tests.DebuggerTest;
import org.jboss.tools.fuse.qe.reddeer.tests.DownloadServerTest;
import org.jboss.tools.fuse.qe.reddeer.tests.FuseProjectTest;
import org.jboss.tools.fuse.qe.reddeer.tests.JMXNavigatorTest;
import org.jboss.tools.fuse.qe.reddeer.tests.LicenseTest;
import org.jboss.tools.fuse.qe.reddeer.tests.NewFuseProjectWizardTest;
import org.jboss.tools.fuse.qe.reddeer.tests.ProjectLocalRunTest;
import org.jboss.tools.fuse.qe.reddeer.tests.RouteManipulationTest;
import org.jboss.tools.fuse.qe.reddeer.tests.SimpleTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.TestSuite;

/**
 * Runs tests that do not need a Fuse server instance on Fuse Tooling
 * 
 * @author tsedmik
 */
@SuiteClasses({
	CamelEditorTest.class,
	ComponentTest.class,
	DataTransformationTest.class,
	DebuggerTest.class,
	DownloadServerTest.class,
	FuseProjectTest.class,
	JMXNavigatorTest.class,
	LicenseTest.class,
	NewFuseProjectWizardTest.class,
	ProjectLocalRunTest.class,
	RouteManipulationTest.class,
	SimpleTest.class })
@RunWith(RedDeerSuite.class)
public class WithoutServerTests extends TestSuite {

}

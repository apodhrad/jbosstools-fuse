package org.jboss.tools.fuse.qe.reddeer.tests.suite;

import org.jboss.reddeer.junit.runner.RedDeerSuite;
import org.jboss.tools.fuse.qe.reddeer.tests.DataTransformationDeploymentTest;
import org.jboss.tools.fuse.qe.reddeer.tests.DeploymentEAPTest;
import org.jboss.tools.fuse.qe.reddeer.tests.DeploymentTest;
import org.jboss.tools.fuse.qe.reddeer.tests.JMXNavigatorServerTest;
import org.jboss.tools.fuse.qe.reddeer.tests.QuickStartsTest;
import org.jboss.tools.fuse.qe.reddeer.tests.ServerJRETest;
import org.jboss.tools.fuse.qe.reddeer.tests.ServerTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.TestSuite;

/**
 * Runs tests that need a Fuse server instance on Fuse Tooling
 * 
 * @author tsedmik
 */
@SuiteClasses({
	DeploymentEAPTest.class,
	DataTransformationDeploymentTest.class,
	DeploymentTest.class,
	JMXNavigatorServerTest.class,
	QuickStartsTest.class,
	ServerTest.class,
	ServerJRETest.class })
@RunWith(RedDeerSuite.class)
public class ServerTests extends TestSuite {

}

package org.jboss.tools.fuse.qe.reddeer.tests.suite;

import org.jboss.reddeer.junit.runner.RedDeerSuite;
import org.jboss.tools.fuse.qe.reddeer.tests.DataTransformationDeploymentTest;
import org.jboss.tools.fuse.qe.reddeer.tests.DeploymentTest;
import org.jboss.tools.fuse.qe.reddeer.tests.JMXNavigatorServerTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.TestSuite;

/**
 * Runs verification tests for a JBoss Fuse runtime.
 * 
 * @author tsedmik
 */
@SuiteClasses({
	DataTransformationDeploymentTest.class,
	DeploymentTest.class,
	JMXNavigatorServerTest.class })
@RunWith(RedDeerSuite.class)
public class RuntimeVerificationTests_Fuse extends TestSuite {

}

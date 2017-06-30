package org.jboss.tools.fuse.qe.reddeer.tests.suite;

import junit.framework.TestSuite;

import org.jboss.reddeer.junit.runner.RedDeerSuite;
import org.jboss.tools.fuse.qe.reddeer.tests.SAPComponentTest;
import org.jboss.tools.fuse.qe.reddeer.tests.SAPConfigurationTest;
import org.jboss.tools.fuse.qe.reddeer.tests.SAPConnectionTest;
import org.jboss.tools.fuse.qe.reddeer.tests.SAPVersionTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Runs smoke tests on SAP Tooling
 * 
 * @author tsedmik
 */
@SuiteClasses({ SAPComponentTest.class, SAPConfigurationTest.class, SAPConnectionTest.class, SAPVersionTest.class })
@RunWith(RedDeerSuite.class)
public class SAPTests extends TestSuite {

}
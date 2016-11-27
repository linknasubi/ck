package com.github.mauricioaniche.ck.metric;

import org.junit.Assert;
import org.junit.Test;

import com.github.mauricioaniche.ck.CK;
import com.github.mauricioaniche.ck.CKNumber;
import com.github.mauricioaniche.ck.CKReport;

public class LCOMTest extends BaseTest {

	@Test
	public void should_count_lcom() {
		
		CKReport report = new CK().calculate(fixturesDir());

		CKNumber a = report.getByClassName("lcom.TripStatusBean");
		Assert.assertEquals(1415, a.getLcom());

		CKNumber b = report.getByClassName("lcom.SimpleGetterAndSetter");
		Assert.assertEquals(0, b.getLcom());

		CKNumber c = report.getByClassName("lcom.SimpleGetterAndSetter2");
		Assert.assertEquals(2, c.getLcom());

		CKNumber d = report.getByClassName("lcom.TermsOfServiceController");
		Assert.assertEquals(0, d.getLcom());

	}
	
}

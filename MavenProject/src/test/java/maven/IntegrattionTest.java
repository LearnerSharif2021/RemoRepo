package maven;

import org.junit.Test;

import pages.HomePage;
import pages.MenPage;

public class IntegrattionTest extends BaseTest{
	
	HomePage hp;
	MenPage mp;
	@Test
	public void test1() {
		hp=new HomePage(dr);
		hp.verifyHomePageLogo();
		mp=hp.clickMenMenu();// new MenPage();
		
	}
}

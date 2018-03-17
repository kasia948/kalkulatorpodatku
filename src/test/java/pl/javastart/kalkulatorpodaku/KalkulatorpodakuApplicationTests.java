package pl.javastart.kalkulatorpodaku;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.hamcrest.CoreMatchers.is;


public class KalkulatorpodakuApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void shouldReturnTaxforIncome0(){
		//given
		TaxCalculator calculator= new TaxCalculator();
		//when
		double input=calculator.calculateTax(0);
		//then
		Assert.assertThat(input, is(0D));
	}

	@Test
	public void shouldReturnTaxforIncome34000(){
		//given
		TaxCalculator calculator= new TaxCalculator();
		//when
		double input=calculator.calculateTax(34000);
		//then
		Assert.assertThat(input, is(5564D));
	}


	@Test
	public void shouldReturnTaxforIncome85528(){
		//given
		TaxCalculator calculator= new TaxCalculator();
		//when
		double input=calculator.calculateTax(85528);
		//then
		Assert.assertThat(input, is(14839D));
	}

	@Test
	public void shouldReturnTaxforIncome120000(){
		//given
		TaxCalculator calculator= new TaxCalculator();
		//when
		double input=calculator.calculateTax(120000);
		//then
		Assert.assertThat(input, is(25870D));
	}

}

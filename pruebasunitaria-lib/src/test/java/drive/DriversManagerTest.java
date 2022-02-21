package drive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DriversManagerTest {
	
	private DriversManager dm1 = new DriversManager();
	
	
	@Test
	void isaddPassenger() {
		Passenger pasajero1 = new Passenger("Jonathan", "01");
		dm1.addPassenger(pasajero1);
		assertEquals(pasajero1,dm1.getPassenger(pasajero1.getId()));
	}

	@Test
	void isaddDriver() {
		Driver driver1 = new Driver("Omar","02",1.53);
		dm1.addDriver(driver1);
		assertEquals(driver1,dm1.getDriver(driver1.getId()));
	}
}

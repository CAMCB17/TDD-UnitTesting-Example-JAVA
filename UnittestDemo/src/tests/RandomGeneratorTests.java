package tests;

import main.RandomGenerator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class RandomGeneratorTests {

	@Test
	void generateNumberWithinRange() {
		
		RandomGenerator randomGenerator = new RandomGenerator();
		
		int min = 0;
		int max = 100;
		
		int randomInt = randomGenerator.generateRandomInt();
		
		boolean isWithinRange = randomInt <= max && randomInt > min? true:false;
		
		Assert.assertTrue(isWithinRange);
		
	}
	
	@Test
	void GeneratesEvenNumber() {
		//Arrange
		
		//Act
		
		//Assert
	}
	
	@Test
	void GreaterThanNine() {
		//Arrange
		
		//Act
		
		//Assert
	}
	
	@Test
	void EndIn2() {
		//Arrange
		
		//Act
		
		//Assert
	}
	
	
	@Test
	void LessThan100() {
		//Arrange
		
		//Act
		
		//Assert
	}
	
	
	@Test
	void SumDigitsEqualToSix() {
		//Arrange
		
		//Act
		
		//Assert
	}
}

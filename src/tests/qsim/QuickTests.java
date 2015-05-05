package tests.qsim;

import org.junit.Test;

import similarity.qsim.EuclideanSimilarity;
import algorithm.qsim.QSim;

public class QuickTests {
	@Test
	public void SmallSerialTest() {
		new QSim(0.8f, new EuclideanSimilarity(), "test-data/iris-config.xml",
				"test-data/iris-edited.txt", "test-results.txt").execute();
	}

	@Test
	public void SmallParallelTest() {
		new QSim(0.8f, new EuclideanSimilarity(), "test-data/iris-config.xml",
				"test-data/iris-edited.txt", "test-results.txt").execute();

	}

	@Test
	public void MultipleQValuesTest() {
		for (float q = 0.1f; q <= 1f; q += 0.1f) {
			new QSim(q, new EuclideanSimilarity(), "test-data/iris-config.xml",
					"test-data/iris-edited.txt", "test-results.txt").execute();
		}
	}
}
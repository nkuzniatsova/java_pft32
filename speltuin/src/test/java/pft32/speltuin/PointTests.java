package pft32.speltuin;

import Lesson1.PointWithMethod;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Natallia on 6-9-2016.
 */
public class PointTests {
@Test
public void testArea() {
  PointWithMethod p1 = new PointWithMethod(1,5);
  PointWithMethod p2 = new PointWithMethod(1,3);
  /* assert p1.distance(p2) == 2; */
  Assert.assertEquals(p1.distance(p2), 2.0);

  }
}

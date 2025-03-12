package arpit.spring_project.dependency_injection;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PopulationCount {

  // @Autowired
  // private Person p; // injecting a person object in PopulationCount class

  private final Person p2;
  private final ArrayList<String> names;

  @Autowired
  // @Autowired(required = false) // if the bean is not found, it will not throw
  // any error
  PopulationCount(Person p2, @Qualifier("getParentData") ArrayList<String> names) { // constructor injection
    this.p2 = p2;
    this.names = names;
  }

  public void display() {
    System.out.println(p2);
    System.out.println(names);
    p2.fun();
  }

}

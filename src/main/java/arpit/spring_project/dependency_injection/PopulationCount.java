package arpit.spring_project.dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;

public class PopulationCount {

  // @Autowired
  // private Person p; // injecting a person object in PopulationCount class

  private final Person p2;

  @Autowired
  PopulationCount(Person p2) {   // constructor injection
    this.p2 = p2;
  }


  public void display() {
    System.out.println(p2);
    p2.fun();
  }

}

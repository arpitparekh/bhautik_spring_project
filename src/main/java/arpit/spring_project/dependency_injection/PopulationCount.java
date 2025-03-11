package arpit.spring_project.dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;

public class PopulationCount {

  @Autowired
  private Person p;

  public void display() {
    System.out.println(p);
    p.fun();
  }

}

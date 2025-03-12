package arpit.spring_project.bean_inheritance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyLogic {

  String data;

  @Autowired
  MyLogic(@Qualifier("getChildString") String data) {
    this.data = data;
  }

  public void display() {
    System.out.println(data);
  }

}

package org.example.pattern.factory;


import java.util.Objects;
import org.example.pattern.factory.config.ConfigFactoryBean;

/**
 * @author thanhdn15
 */
public class Main {

  void main(){
    var logistics = ConfigFactoryBean.configuration("sea");
    if(Objects.isNull(logistics)){
      System.out.printf("Not init");
      return;
    }
    logistics.planDelivery();
  }
}

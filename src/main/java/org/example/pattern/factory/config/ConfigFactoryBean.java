package org.example.pattern.factory.config;

import org.example.pattern.factory.concretecreator.RoadLogistics;
import org.example.pattern.factory.concretecreator.SeaLogistics;
import org.example.pattern.factory.creator.Logistics;

/**
 * @author thanhdn15
 */
public class ConfigFactoryBean {

  public static Logistics configuration(String transactionType) {
    if ("road".equalsIgnoreCase(transactionType)) {
      return new RoadLogistics();
    } else if ("sea".equalsIgnoreCase(transactionType)) {
      return new SeaLogistics();
    }
    return null;
  }
}
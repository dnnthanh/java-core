package org.example.pattern.factory.concretecreator;

import org.example.pattern.factory.concreteproduct.Truck;
import org.example.pattern.factory.creator.Logistics;
import org.example.pattern.factory.product.Transport;

/**
 * @author thanhdn15
 */
public class RoadLogistics extends Logistics {

  @Override
  public Transport create() {
    return new Truck();
  }
}

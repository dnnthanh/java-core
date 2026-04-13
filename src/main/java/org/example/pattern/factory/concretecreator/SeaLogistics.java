package org.example.pattern.factory.concretecreator;

import org.example.pattern.factory.concreteproduct.Ship;
import org.example.pattern.factory.creator.Logistics;
import org.example.pattern.factory.product.Transport;

/**
 * @author thanhdn15
 */
public class SeaLogistics extends Logistics {

  @Override
  public Transport create() {
    return new Ship();
  }
}

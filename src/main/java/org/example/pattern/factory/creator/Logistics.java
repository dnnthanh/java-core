package org.example.pattern.factory.creator;

import org.example.pattern.factory.product.Transport;

/**
 * @author thanhdn15
 */
public abstract class Logistics {

  /**
   * Phương thức này chứa logic nghiệp vụ cốt lõi, không thay đổi.
   */
  public void planDelivery() {
    System.out.println("Init transport");
    Transport transport = create();
    transport.deliver();
    System.out.printf("""
            Class transport: %s  & package: %s
            %n""",
        transport.getClass().getSimpleName(), transport.getClass().getPackageName());
  }

  /**
   * The Factory Method - được khai báo là abstract
   */
  public abstract Transport create();
}

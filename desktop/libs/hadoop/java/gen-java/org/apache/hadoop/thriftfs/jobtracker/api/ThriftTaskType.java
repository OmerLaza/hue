/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.thriftfs.jobtracker.api;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum ThriftTaskType implements TEnum {
  MAP(0),
  REDUCE(1),
  JOB_SETUP(2),
  JOB_CLEANUP(3),
  TASK_CLEANUP(4);

  private final int value;

  private ThriftTaskType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ThriftTaskType findByValue(int value) { 
    switch (value) {
      case 0:
        return MAP;
      case 1:
        return REDUCE;
      case 2:
        return JOB_SETUP;
      case 3:
        return JOB_CLEANUP;
      case 4:
        return TASK_CLEANUP;
      default:
        return null;
    }
  }
}

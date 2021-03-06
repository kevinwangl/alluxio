/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package alluxio.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum LockBlockStatus implements org.apache.thrift.TEnum {
  /**
   * The Alluxio block is acquired.
   */
  ALLUXIO_BLOCK_LOCKED(1),
  /**
   * The block is not in Alluxio but a UFS access token is acquired for this block.
   */
  UFS_TOKEN_ACQUIRED(2),
  /**
   * The block is not in Alluxio and a UFS access token is not acquired.
   */
  UFS_TOKEN_NOT_ACQUIRED(3);

  private final int value;

  private LockBlockStatus(int value) {
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
  public static LockBlockStatus findByValue(int value) { 
    switch (value) {
      case 1:
        return ALLUXIO_BLOCK_LOCKED;
      case 2:
        return UFS_TOKEN_ACQUIRED;
      case 3:
        return UFS_TOKEN_NOT_ACQUIRED;
      default:
        return null;
    }
  }
}

/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.thriftfs.api;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

/**
 * A single stack frame in a stack dump
 */
public class StackTraceElement implements TBase<StackTraceElement, StackTraceElement._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("StackTraceElement");

  private static final TField CLASS_NAME_FIELD_DESC = new TField("className", TType.STRING, (short)1);
  private static final TField FILE_NAME_FIELD_DESC = new TField("fileName", TType.STRING, (short)2);
  private static final TField LINE_NUMBER_FIELD_DESC = new TField("lineNumber", TType.I32, (short)3);
  private static final TField METHOD_NAME_FIELD_DESC = new TField("methodName", TType.STRING, (short)4);
  private static final TField IS_NATIVE_METHOD_FIELD_DESC = new TField("isNativeMethod", TType.BOOL, (short)5);
  private static final TField STRING_REPRESENTATION_FIELD_DESC = new TField("stringRepresentation", TType.STRING, (short)6);

  public String className;
  public String fileName;
  public int lineNumber;
  public String methodName;
  public boolean isNativeMethod;
  public String stringRepresentation;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    CLASS_NAME((short)1, "className"),
    FILE_NAME((short)2, "fileName"),
    LINE_NUMBER((short)3, "lineNumber"),
    METHOD_NAME((short)4, "methodName"),
    IS_NATIVE_METHOD((short)5, "isNativeMethod"),
    STRING_REPRESENTATION((short)6, "stringRepresentation");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CLASS_NAME
          return CLASS_NAME;
        case 2: // FILE_NAME
          return FILE_NAME;
        case 3: // LINE_NUMBER
          return LINE_NUMBER;
        case 4: // METHOD_NAME
          return METHOD_NAME;
        case 5: // IS_NATIVE_METHOD
          return IS_NATIVE_METHOD;
        case 6: // STRING_REPRESENTATION
          return STRING_REPRESENTATION;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __LINENUMBER_ISSET_ID = 0;
  private static final int __ISNATIVEMETHOD_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CLASS_NAME, new FieldMetaData("className", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.FILE_NAME, new FieldMetaData("fileName", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.LINE_NUMBER, new FieldMetaData("lineNumber", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.METHOD_NAME, new FieldMetaData("methodName", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.IS_NATIVE_METHOD, new FieldMetaData("isNativeMethod", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.BOOL)));
    tmpMap.put(_Fields.STRING_REPRESENTATION, new FieldMetaData("stringRepresentation", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(StackTraceElement.class, metaDataMap);
  }

  public StackTraceElement() {
  }

  public StackTraceElement(
    String className,
    String fileName,
    int lineNumber,
    String methodName,
    boolean isNativeMethod,
    String stringRepresentation)
  {
    this();
    this.className = className;
    this.fileName = fileName;
    this.lineNumber = lineNumber;
    setLineNumberIsSet(true);
    this.methodName = methodName;
    this.isNativeMethod = isNativeMethod;
    setIsNativeMethodIsSet(true);
    this.stringRepresentation = stringRepresentation;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StackTraceElement(StackTraceElement other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetClassName()) {
      this.className = other.className;
    }
    if (other.isSetFileName()) {
      this.fileName = other.fileName;
    }
    this.lineNumber = other.lineNumber;
    if (other.isSetMethodName()) {
      this.methodName = other.methodName;
    }
    this.isNativeMethod = other.isNativeMethod;
    if (other.isSetStringRepresentation()) {
      this.stringRepresentation = other.stringRepresentation;
    }
  }

  public StackTraceElement deepCopy() {
    return new StackTraceElement(this);
  }

  @Override
  public void clear() {
    this.className = null;
    this.fileName = null;
    setLineNumberIsSet(false);
    this.lineNumber = 0;
    this.methodName = null;
    setIsNativeMethodIsSet(false);
    this.isNativeMethod = false;
    this.stringRepresentation = null;
  }

  public String getClassName() {
    return this.className;
  }

  public StackTraceElement setClassName(String className) {
    this.className = className;
    return this;
  }

  public void unsetClassName() {
    this.className = null;
  }

  /** Returns true if field className is set (has been asigned a value) and false otherwise */
  public boolean isSetClassName() {
    return this.className != null;
  }

  public void setClassNameIsSet(boolean value) {
    if (!value) {
      this.className = null;
    }
  }

  public String getFileName() {
    return this.fileName;
  }

  public StackTraceElement setFileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  public void unsetFileName() {
    this.fileName = null;
  }

  /** Returns true if field fileName is set (has been asigned a value) and false otherwise */
  public boolean isSetFileName() {
    return this.fileName != null;
  }

  public void setFileNameIsSet(boolean value) {
    if (!value) {
      this.fileName = null;
    }
  }

  public int getLineNumber() {
    return this.lineNumber;
  }

  public StackTraceElement setLineNumber(int lineNumber) {
    this.lineNumber = lineNumber;
    setLineNumberIsSet(true);
    return this;
  }

  public void unsetLineNumber() {
    __isset_bit_vector.clear(__LINENUMBER_ISSET_ID);
  }

  /** Returns true if field lineNumber is set (has been asigned a value) and false otherwise */
  public boolean isSetLineNumber() {
    return __isset_bit_vector.get(__LINENUMBER_ISSET_ID);
  }

  public void setLineNumberIsSet(boolean value) {
    __isset_bit_vector.set(__LINENUMBER_ISSET_ID, value);
  }

  public String getMethodName() {
    return this.methodName;
  }

  public StackTraceElement setMethodName(String methodName) {
    this.methodName = methodName;
    return this;
  }

  public void unsetMethodName() {
    this.methodName = null;
  }

  /** Returns true if field methodName is set (has been asigned a value) and false otherwise */
  public boolean isSetMethodName() {
    return this.methodName != null;
  }

  public void setMethodNameIsSet(boolean value) {
    if (!value) {
      this.methodName = null;
    }
  }

  public boolean isIsNativeMethod() {
    return this.isNativeMethod;
  }

  public StackTraceElement setIsNativeMethod(boolean isNativeMethod) {
    this.isNativeMethod = isNativeMethod;
    setIsNativeMethodIsSet(true);
    return this;
  }

  public void unsetIsNativeMethod() {
    __isset_bit_vector.clear(__ISNATIVEMETHOD_ISSET_ID);
  }

  /** Returns true if field isNativeMethod is set (has been asigned a value) and false otherwise */
  public boolean isSetIsNativeMethod() {
    return __isset_bit_vector.get(__ISNATIVEMETHOD_ISSET_ID);
  }

  public void setIsNativeMethodIsSet(boolean value) {
    __isset_bit_vector.set(__ISNATIVEMETHOD_ISSET_ID, value);
  }

  public String getStringRepresentation() {
    return this.stringRepresentation;
  }

  public StackTraceElement setStringRepresentation(String stringRepresentation) {
    this.stringRepresentation = stringRepresentation;
    return this;
  }

  public void unsetStringRepresentation() {
    this.stringRepresentation = null;
  }

  /** Returns true if field stringRepresentation is set (has been asigned a value) and false otherwise */
  public boolean isSetStringRepresentation() {
    return this.stringRepresentation != null;
  }

  public void setStringRepresentationIsSet(boolean value) {
    if (!value) {
      this.stringRepresentation = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CLASS_NAME:
      if (value == null) {
        unsetClassName();
      } else {
        setClassName((String)value);
      }
      break;

    case FILE_NAME:
      if (value == null) {
        unsetFileName();
      } else {
        setFileName((String)value);
      }
      break;

    case LINE_NUMBER:
      if (value == null) {
        unsetLineNumber();
      } else {
        setLineNumber((Integer)value);
      }
      break;

    case METHOD_NAME:
      if (value == null) {
        unsetMethodName();
      } else {
        setMethodName((String)value);
      }
      break;

    case IS_NATIVE_METHOD:
      if (value == null) {
        unsetIsNativeMethod();
      } else {
        setIsNativeMethod((Boolean)value);
      }
      break;

    case STRING_REPRESENTATION:
      if (value == null) {
        unsetStringRepresentation();
      } else {
        setStringRepresentation((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CLASS_NAME:
      return getClassName();

    case FILE_NAME:
      return getFileName();

    case LINE_NUMBER:
      return new Integer(getLineNumber());

    case METHOD_NAME:
      return getMethodName();

    case IS_NATIVE_METHOD:
      return new Boolean(isIsNativeMethod());

    case STRING_REPRESENTATION:
      return getStringRepresentation();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CLASS_NAME:
      return isSetClassName();
    case FILE_NAME:
      return isSetFileName();
    case LINE_NUMBER:
      return isSetLineNumber();
    case METHOD_NAME:
      return isSetMethodName();
    case IS_NATIVE_METHOD:
      return isSetIsNativeMethod();
    case STRING_REPRESENTATION:
      return isSetStringRepresentation();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof StackTraceElement)
      return this.equals((StackTraceElement)that);
    return false;
  }

  public boolean equals(StackTraceElement that) {
    if (that == null)
      return false;

    boolean this_present_className = true && this.isSetClassName();
    boolean that_present_className = true && that.isSetClassName();
    if (this_present_className || that_present_className) {
      if (!(this_present_className && that_present_className))
        return false;
      if (!this.className.equals(that.className))
        return false;
    }

    boolean this_present_fileName = true && this.isSetFileName();
    boolean that_present_fileName = true && that.isSetFileName();
    if (this_present_fileName || that_present_fileName) {
      if (!(this_present_fileName && that_present_fileName))
        return false;
      if (!this.fileName.equals(that.fileName))
        return false;
    }

    boolean this_present_lineNumber = true;
    boolean that_present_lineNumber = true;
    if (this_present_lineNumber || that_present_lineNumber) {
      if (!(this_present_lineNumber && that_present_lineNumber))
        return false;
      if (this.lineNumber != that.lineNumber)
        return false;
    }

    boolean this_present_methodName = true && this.isSetMethodName();
    boolean that_present_methodName = true && that.isSetMethodName();
    if (this_present_methodName || that_present_methodName) {
      if (!(this_present_methodName && that_present_methodName))
        return false;
      if (!this.methodName.equals(that.methodName))
        return false;
    }

    boolean this_present_isNativeMethod = true;
    boolean that_present_isNativeMethod = true;
    if (this_present_isNativeMethod || that_present_isNativeMethod) {
      if (!(this_present_isNativeMethod && that_present_isNativeMethod))
        return false;
      if (this.isNativeMethod != that.isNativeMethod)
        return false;
    }

    boolean this_present_stringRepresentation = true && this.isSetStringRepresentation();
    boolean that_present_stringRepresentation = true && that.isSetStringRepresentation();
    if (this_present_stringRepresentation || that_present_stringRepresentation) {
      if (!(this_present_stringRepresentation && that_present_stringRepresentation))
        return false;
      if (!this.stringRepresentation.equals(that.stringRepresentation))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(StackTraceElement other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    StackTraceElement typedOther = (StackTraceElement)other;

    lastComparison = Boolean.valueOf(isSetClassName()).compareTo(typedOther.isSetClassName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClassName()) {
      lastComparison = TBaseHelper.compareTo(this.className, typedOther.className);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFileName()).compareTo(typedOther.isSetFileName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFileName()) {
      lastComparison = TBaseHelper.compareTo(this.fileName, typedOther.fileName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLineNumber()).compareTo(typedOther.isSetLineNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLineNumber()) {
      lastComparison = TBaseHelper.compareTo(this.lineNumber, typedOther.lineNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMethodName()).compareTo(typedOther.isSetMethodName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMethodName()) {
      lastComparison = TBaseHelper.compareTo(this.methodName, typedOther.methodName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIsNativeMethod()).compareTo(typedOther.isSetIsNativeMethod());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsNativeMethod()) {
      lastComparison = TBaseHelper.compareTo(this.isNativeMethod, typedOther.isNativeMethod);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStringRepresentation()).compareTo(typedOther.isSetStringRepresentation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStringRepresentation()) {
      lastComparison = TBaseHelper.compareTo(this.stringRepresentation, typedOther.stringRepresentation);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // CLASS_NAME
          if (field.type == TType.STRING) {
            this.className = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // FILE_NAME
          if (field.type == TType.STRING) {
            this.fileName = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // LINE_NUMBER
          if (field.type == TType.I32) {
            this.lineNumber = iprot.readI32();
            setLineNumberIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // METHOD_NAME
          if (field.type == TType.STRING) {
            this.methodName = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // IS_NATIVE_METHOD
          if (field.type == TType.BOOL) {
            this.isNativeMethod = iprot.readBool();
            setIsNativeMethodIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // STRING_REPRESENTATION
          if (field.type == TType.STRING) {
            this.stringRepresentation = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.className != null) {
      oprot.writeFieldBegin(CLASS_NAME_FIELD_DESC);
      oprot.writeString(this.className);
      oprot.writeFieldEnd();
    }
    if (this.fileName != null) {
      oprot.writeFieldBegin(FILE_NAME_FIELD_DESC);
      oprot.writeString(this.fileName);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(LINE_NUMBER_FIELD_DESC);
    oprot.writeI32(this.lineNumber);
    oprot.writeFieldEnd();
    if (this.methodName != null) {
      oprot.writeFieldBegin(METHOD_NAME_FIELD_DESC);
      oprot.writeString(this.methodName);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(IS_NATIVE_METHOD_FIELD_DESC);
    oprot.writeBool(this.isNativeMethod);
    oprot.writeFieldEnd();
    if (this.stringRepresentation != null) {
      oprot.writeFieldBegin(STRING_REPRESENTATION_FIELD_DESC);
      oprot.writeString(this.stringRepresentation);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("StackTraceElement(");
    boolean first = true;

    sb.append("className:");
    if (this.className == null) {
      sb.append("null");
    } else {
      sb.append(this.className);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("fileName:");
    if (this.fileName == null) {
      sb.append("null");
    } else {
      sb.append(this.fileName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("lineNumber:");
    sb.append(this.lineNumber);
    first = false;
    if (!first) sb.append(", ");
    sb.append("methodName:");
    if (this.methodName == null) {
      sb.append("null");
    } else {
      sb.append(this.methodName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("isNativeMethod:");
    sb.append(this.isNativeMethod);
    first = false;
    if (!first) sb.append(", ");
    sb.append("stringRepresentation:");
    if (this.stringRepresentation == null) {
      sb.append("null");
    } else {
      sb.append(this.stringRepresentation);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}


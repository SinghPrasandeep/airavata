    /*
     * Licensed to the Apache Software Foundation (ASF) under one or more
     * contributor license agreements.  See the NOTICE file distributed with
     * this work for additional information regarding copyright ownership.
     * The ASF licenses this file to You under the Apache License, Version 2.0
     * (the "License"); you may not use this file except in compliance with
     * the License.  You may obtain a copy of the License at
     *
     *     http://www.apache.org/licenses/LICENSE-2.0
     *
     * Unless required by applicable law or agreed to in writing, software
     * distributed under the License is distributed on an "AS IS" BASIS,
     * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * See the License for the specific language governing permissions and
     * limitations under the License.
     */
/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.model.appcatalog;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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

@SuppressWarnings("all") public class GlobusJobSubmission implements org.apache.thrift.TBase<GlobusJobSubmission, GlobusJobSubmission._Fields>, java.io.Serializable, Cloneable, Comparable<GlobusJobSubmission> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GlobusJobSubmission");

  private static final org.apache.thrift.protocol.TField JOB_SUBMISSION_DATA_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("jobSubmissionDataID", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SECURITY_PROTOCOL_FIELD_DESC = new org.apache.thrift.protocol.TField("securityProtocol", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField RESOURCE_JOB_MANAGER_FIELD_DESC = new org.apache.thrift.protocol.TField("resourceJobManager", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField GLOBUS_GATE_KEEPER_END_POINT_FIELD_DESC = new org.apache.thrift.protocol.TField("globusGateKeeperEndPoint", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GlobusJobSubmissionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GlobusJobSubmissionTupleSchemeFactory());
  }

  private String jobSubmissionDataID; // required
  private SecurityProtocol securityProtocol; // required
  private ResourceJobManager resourceJobManager; // required
  private List<String> globusGateKeeperEndPoint; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  @SuppressWarnings("all") public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    JOB_SUBMISSION_DATA_ID((short)1, "jobSubmissionDataID"),
    /**
     * 
     * @see SecurityProtocol
     */
    SECURITY_PROTOCOL((short)2, "securityProtocol"),
    /**
     * 
     * @see ResourceJobManager
     */
    RESOURCE_JOB_MANAGER((short)3, "resourceJobManager"),
    GLOBUS_GATE_KEEPER_END_POINT((short)4, "globusGateKeeperEndPoint");

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
        case 1: // JOB_SUBMISSION_DATA_ID
          return JOB_SUBMISSION_DATA_ID;
        case 2: // SECURITY_PROTOCOL
          return SECURITY_PROTOCOL;
        case 3: // RESOURCE_JOB_MANAGER
          return RESOURCE_JOB_MANAGER;
        case 4: // GLOBUS_GATE_KEEPER_END_POINT
          return GLOBUS_GATE_KEEPER_END_POINT;
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
  private _Fields optionals[] = {_Fields.GLOBUS_GATE_KEEPER_END_POINT};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.JOB_SUBMISSION_DATA_ID, new org.apache.thrift.meta_data.FieldMetaData("jobSubmissionDataID", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SECURITY_PROTOCOL, new org.apache.thrift.meta_data.FieldMetaData("securityProtocol", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, SecurityProtocol.class)));
    tmpMap.put(_Fields.RESOURCE_JOB_MANAGER, new org.apache.thrift.meta_data.FieldMetaData("resourceJobManager", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ResourceJobManager.class)));
    tmpMap.put(_Fields.GLOBUS_GATE_KEEPER_END_POINT, new org.apache.thrift.meta_data.FieldMetaData("globusGateKeeperEndPoint", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GlobusJobSubmission.class, metaDataMap);
  }

  public GlobusJobSubmission() {
    this.jobSubmissionDataID = "DO_NOT_SET_AT_CLIENTS";

  }

  public GlobusJobSubmission(
    String jobSubmissionDataID,
    SecurityProtocol securityProtocol,
    ResourceJobManager resourceJobManager)
  {
    this();
    this.jobSubmissionDataID = jobSubmissionDataID;
    this.securityProtocol = securityProtocol;
    this.resourceJobManager = resourceJobManager;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GlobusJobSubmission(GlobusJobSubmission other) {
    if (other.isSetJobSubmissionDataID()) {
      this.jobSubmissionDataID = other.jobSubmissionDataID;
    }
    if (other.isSetSecurityProtocol()) {
      this.securityProtocol = other.securityProtocol;
    }
    if (other.isSetResourceJobManager()) {
      this.resourceJobManager = other.resourceJobManager;
    }
    if (other.isSetGlobusGateKeeperEndPoint()) {
      List<String> __this__globusGateKeeperEndPoint = new ArrayList<String>(other.globusGateKeeperEndPoint);
      this.globusGateKeeperEndPoint = __this__globusGateKeeperEndPoint;
    }
  }

  public GlobusJobSubmission deepCopy() {
    return new GlobusJobSubmission(this);
  }

  @Override
  public void clear() {
    this.jobSubmissionDataID = "DO_NOT_SET_AT_CLIENTS";

    this.securityProtocol = null;
    this.resourceJobManager = null;
    this.globusGateKeeperEndPoint = null;
  }

  public String getJobSubmissionDataID() {
    return this.jobSubmissionDataID;
  }

  public void setJobSubmissionDataID(String jobSubmissionDataID) {
    this.jobSubmissionDataID = jobSubmissionDataID;
  }

  public void unsetJobSubmissionDataID() {
    this.jobSubmissionDataID = null;
  }

  /** Returns true if field jobSubmissionDataID is set (has been assigned a value) and false otherwise */
  public boolean isSetJobSubmissionDataID() {
    return this.jobSubmissionDataID != null;
  }

  public void setJobSubmissionDataIDIsSet(boolean value) {
    if (!value) {
      this.jobSubmissionDataID = null;
    }
  }

  /**
   * 
   * @see SecurityProtocol
   */
  public SecurityProtocol getSecurityProtocol() {
    return this.securityProtocol;
  }

  /**
   * 
   * @see SecurityProtocol
   */
  public void setSecurityProtocol(SecurityProtocol securityProtocol) {
    this.securityProtocol = securityProtocol;
  }

  public void unsetSecurityProtocol() {
    this.securityProtocol = null;
  }

  /** Returns true if field securityProtocol is set (has been assigned a value) and false otherwise */
  public boolean isSetSecurityProtocol() {
    return this.securityProtocol != null;
  }

  public void setSecurityProtocolIsSet(boolean value) {
    if (!value) {
      this.securityProtocol = null;
    }
  }

  /**
   * 
   * @see ResourceJobManager
   */
  public ResourceJobManager getResourceJobManager() {
    return this.resourceJobManager;
  }

  /**
   * 
   * @see ResourceJobManager
   */
  public void setResourceJobManager(ResourceJobManager resourceJobManager) {
    this.resourceJobManager = resourceJobManager;
  }

  public void unsetResourceJobManager() {
    this.resourceJobManager = null;
  }

  /** Returns true if field resourceJobManager is set (has been assigned a value) and false otherwise */
  public boolean isSetResourceJobManager() {
    return this.resourceJobManager != null;
  }

  public void setResourceJobManagerIsSet(boolean value) {
    if (!value) {
      this.resourceJobManager = null;
    }
  }

  public int getGlobusGateKeeperEndPointSize() {
    return (this.globusGateKeeperEndPoint == null) ? 0 : this.globusGateKeeperEndPoint.size();
  }

  public java.util.Iterator<String> getGlobusGateKeeperEndPointIterator() {
    return (this.globusGateKeeperEndPoint == null) ? null : this.globusGateKeeperEndPoint.iterator();
  }

  public void addToGlobusGateKeeperEndPoint(String elem) {
    if (this.globusGateKeeperEndPoint == null) {
      this.globusGateKeeperEndPoint = new ArrayList<String>();
    }
    this.globusGateKeeperEndPoint.add(elem);
  }

  public List<String> getGlobusGateKeeperEndPoint() {
    return this.globusGateKeeperEndPoint;
  }

  public void setGlobusGateKeeperEndPoint(List<String> globusGateKeeperEndPoint) {
    this.globusGateKeeperEndPoint = globusGateKeeperEndPoint;
  }

  public void unsetGlobusGateKeeperEndPoint() {
    this.globusGateKeeperEndPoint = null;
  }

  /** Returns true if field globusGateKeeperEndPoint is set (has been assigned a value) and false otherwise */
  public boolean isSetGlobusGateKeeperEndPoint() {
    return this.globusGateKeeperEndPoint != null;
  }

  public void setGlobusGateKeeperEndPointIsSet(boolean value) {
    if (!value) {
      this.globusGateKeeperEndPoint = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case JOB_SUBMISSION_DATA_ID:
      if (value == null) {
        unsetJobSubmissionDataID();
      } else {
        setJobSubmissionDataID((String)value);
      }
      break;

    case SECURITY_PROTOCOL:
      if (value == null) {
        unsetSecurityProtocol();
      } else {
        setSecurityProtocol((SecurityProtocol)value);
      }
      break;

    case RESOURCE_JOB_MANAGER:
      if (value == null) {
        unsetResourceJobManager();
      } else {
        setResourceJobManager((ResourceJobManager)value);
      }
      break;

    case GLOBUS_GATE_KEEPER_END_POINT:
      if (value == null) {
        unsetGlobusGateKeeperEndPoint();
      } else {
        setGlobusGateKeeperEndPoint((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case JOB_SUBMISSION_DATA_ID:
      return getJobSubmissionDataID();

    case SECURITY_PROTOCOL:
      return getSecurityProtocol();

    case RESOURCE_JOB_MANAGER:
      return getResourceJobManager();

    case GLOBUS_GATE_KEEPER_END_POINT:
      return getGlobusGateKeeperEndPoint();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case JOB_SUBMISSION_DATA_ID:
      return isSetJobSubmissionDataID();
    case SECURITY_PROTOCOL:
      return isSetSecurityProtocol();
    case RESOURCE_JOB_MANAGER:
      return isSetResourceJobManager();
    case GLOBUS_GATE_KEEPER_END_POINT:
      return isSetGlobusGateKeeperEndPoint();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GlobusJobSubmission)
      return this.equals((GlobusJobSubmission)that);
    return false;
  }

  public boolean equals(GlobusJobSubmission that) {
    if (that == null)
      return false;

    boolean this_present_jobSubmissionDataID = true && this.isSetJobSubmissionDataID();
    boolean that_present_jobSubmissionDataID = true && that.isSetJobSubmissionDataID();
    if (this_present_jobSubmissionDataID || that_present_jobSubmissionDataID) {
      if (!(this_present_jobSubmissionDataID && that_present_jobSubmissionDataID))
        return false;
      if (!this.jobSubmissionDataID.equals(that.jobSubmissionDataID))
        return false;
    }

    boolean this_present_securityProtocol = true && this.isSetSecurityProtocol();
    boolean that_present_securityProtocol = true && that.isSetSecurityProtocol();
    if (this_present_securityProtocol || that_present_securityProtocol) {
      if (!(this_present_securityProtocol && that_present_securityProtocol))
        return false;
      if (!this.securityProtocol.equals(that.securityProtocol))
        return false;
    }

    boolean this_present_resourceJobManager = true && this.isSetResourceJobManager();
    boolean that_present_resourceJobManager = true && that.isSetResourceJobManager();
    if (this_present_resourceJobManager || that_present_resourceJobManager) {
      if (!(this_present_resourceJobManager && that_present_resourceJobManager))
        return false;
      if (!this.resourceJobManager.equals(that.resourceJobManager))
        return false;
    }

    boolean this_present_globusGateKeeperEndPoint = true && this.isSetGlobusGateKeeperEndPoint();
    boolean that_present_globusGateKeeperEndPoint = true && that.isSetGlobusGateKeeperEndPoint();
    if (this_present_globusGateKeeperEndPoint || that_present_globusGateKeeperEndPoint) {
      if (!(this_present_globusGateKeeperEndPoint && that_present_globusGateKeeperEndPoint))
        return false;
      if (!this.globusGateKeeperEndPoint.equals(that.globusGateKeeperEndPoint))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(GlobusJobSubmission other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetJobSubmissionDataID()).compareTo(other.isSetJobSubmissionDataID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobSubmissionDataID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobSubmissionDataID, other.jobSubmissionDataID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSecurityProtocol()).compareTo(other.isSetSecurityProtocol());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSecurityProtocol()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.securityProtocol, other.securityProtocol);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetResourceJobManager()).compareTo(other.isSetResourceJobManager());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResourceJobManager()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resourceJobManager, other.resourceJobManager);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGlobusGateKeeperEndPoint()).compareTo(other.isSetGlobusGateKeeperEndPoint());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGlobusGateKeeperEndPoint()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.globusGateKeeperEndPoint, other.globusGateKeeperEndPoint);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("GlobusJobSubmission(");
    boolean first = true;

    sb.append("jobSubmissionDataID:");
    if (this.jobSubmissionDataID == null) {
      sb.append("null");
    } else {
      sb.append(this.jobSubmissionDataID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("securityProtocol:");
    if (this.securityProtocol == null) {
      sb.append("null");
    } else {
      sb.append(this.securityProtocol);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("resourceJobManager:");
    if (this.resourceJobManager == null) {
      sb.append("null");
    } else {
      sb.append(this.resourceJobManager);
    }
    first = false;
    if (isSetGlobusGateKeeperEndPoint()) {
      if (!first) sb.append(", ");
      sb.append("globusGateKeeperEndPoint:");
      if (this.globusGateKeeperEndPoint == null) {
        sb.append("null");
      } else {
        sb.append(this.globusGateKeeperEndPoint);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetJobSubmissionDataID()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'jobSubmissionDataID' is unset! Struct:" + toString());
    }

    if (!isSetSecurityProtocol()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'securityProtocol' is unset! Struct:" + toString());
    }

    if (!isSetResourceJobManager()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'resourceJobManager' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GlobusJobSubmissionStandardSchemeFactory implements SchemeFactory {
    public GlobusJobSubmissionStandardScheme getScheme() {
      return new GlobusJobSubmissionStandardScheme();
    }
  }

  private static class GlobusJobSubmissionStandardScheme extends StandardScheme<GlobusJobSubmission> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GlobusJobSubmission struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // JOB_SUBMISSION_DATA_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.jobSubmissionDataID = iprot.readString();
              struct.setJobSubmissionDataIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SECURITY_PROTOCOL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.securityProtocol = SecurityProtocol.findByValue(iprot.readI32());
              struct.setSecurityProtocolIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RESOURCE_JOB_MANAGER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.resourceJobManager = ResourceJobManager.findByValue(iprot.readI32());
              struct.setResourceJobManagerIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // GLOBUS_GATE_KEEPER_END_POINT
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.globusGateKeeperEndPoint = new ArrayList<String>(_list8.size);
                for (int _i9 = 0; _i9 < _list8.size; ++_i9)
                {
                  String _elem10;
                  _elem10 = iprot.readString();
                  struct.globusGateKeeperEndPoint.add(_elem10);
                }
                iprot.readListEnd();
              }
              struct.setGlobusGateKeeperEndPointIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, GlobusJobSubmission struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.jobSubmissionDataID != null) {
        oprot.writeFieldBegin(JOB_SUBMISSION_DATA_ID_FIELD_DESC);
        oprot.writeString(struct.jobSubmissionDataID);
        oprot.writeFieldEnd();
      }
      if (struct.securityProtocol != null) {
        oprot.writeFieldBegin(SECURITY_PROTOCOL_FIELD_DESC);
        oprot.writeI32(struct.securityProtocol.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.resourceJobManager != null) {
        oprot.writeFieldBegin(RESOURCE_JOB_MANAGER_FIELD_DESC);
        oprot.writeI32(struct.resourceJobManager.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.globusGateKeeperEndPoint != null) {
        if (struct.isSetGlobusGateKeeperEndPoint()) {
          oprot.writeFieldBegin(GLOBUS_GATE_KEEPER_END_POINT_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.globusGateKeeperEndPoint.size()));
            for (String _iter11 : struct.globusGateKeeperEndPoint)
            {
              oprot.writeString(_iter11);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GlobusJobSubmissionTupleSchemeFactory implements SchemeFactory {
    public GlobusJobSubmissionTupleScheme getScheme() {
      return new GlobusJobSubmissionTupleScheme();
    }
  }

  private static class GlobusJobSubmissionTupleScheme extends TupleScheme<GlobusJobSubmission> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GlobusJobSubmission struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.jobSubmissionDataID);
      oprot.writeI32(struct.securityProtocol.getValue());
      oprot.writeI32(struct.resourceJobManager.getValue());
      BitSet optionals = new BitSet();
      if (struct.isSetGlobusGateKeeperEndPoint()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetGlobusGateKeeperEndPoint()) {
        {
          oprot.writeI32(struct.globusGateKeeperEndPoint.size());
          for (String _iter12 : struct.globusGateKeeperEndPoint)
          {
            oprot.writeString(_iter12);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GlobusJobSubmission struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.jobSubmissionDataID = iprot.readString();
      struct.setJobSubmissionDataIDIsSet(true);
      struct.securityProtocol = SecurityProtocol.findByValue(iprot.readI32());
      struct.setSecurityProtocolIsSet(true);
      struct.resourceJobManager = ResourceJobManager.findByValue(iprot.readI32());
      struct.setResourceJobManagerIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.globusGateKeeperEndPoint = new ArrayList<String>(_list13.size);
          for (int _i14 = 0; _i14 < _list13.size; ++_i14)
          {
            String _elem15;
            _elem15 = iprot.readString();
            struct.globusGateKeeperEndPoint.add(_elem15);
          }
        }
        struct.setGlobusGateKeeperEndPointIsSet(true);
      }
    }
  }

}


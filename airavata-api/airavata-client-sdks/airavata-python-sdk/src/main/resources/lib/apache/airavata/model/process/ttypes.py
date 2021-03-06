#
# Autogenerated by Thrift Compiler (0.9.3)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#
#  options string: py
#

from thrift.Thrift import TType, TMessageType, TException, TApplicationException
import apache.airavata.model.commons.ttypes
import apache.airavata.model.application.io.ttypes
import apache.airavata.model.status.ttypes
import apache.airavata.model.task.ttypes
import apache.airavata.model.scheduling.ttypes


from thrift.transport import TTransport
from thrift.protocol import TBinaryProtocol, TProtocol
try:
  from thrift.protocol import fastbinary
except:
  fastbinary = None



class ProcessModel:
  """
  ProcessModel: A structure holding the process details. The infromation is derived based on user provided
           configuration data or system inferred information from scheduling and QoS parameters.

  processDetail:
    A friendly description of the process, usally used to communicate information to users.



  Attributes:
   - processId
   - experimentId
   - creationTime
   - lastUpdateTime
   - processStatuses
   - processDetail
   - applicationInterfaceId
   - applicationDeploymentId
   - computeResourceId
   - processInputs
   - processOutputs
   - processResourceSchedule
   - tasks
   - taskDag
   - processErrors
   - gatewayExecutionId
   - enableEmailNotification
   - emailAddresses
   - storageResourceId
   - userDn
   - generateCert
   - experimentDataDir
   - userName
   - useUserCRPref
  """

  thrift_spec = (
    None, # 0
    (1, TType.STRING, 'processId', None, "DO_NOT_SET_AT_CLIENTS", ), # 1
    (2, TType.STRING, 'experimentId', None, None, ), # 2
    (3, TType.I64, 'creationTime', None, None, ), # 3
    (4, TType.I64, 'lastUpdateTime', None, None, ), # 4
    (5, TType.LIST, 'processStatuses', (TType.STRUCT,(apache.airavata.model.status.ttypes.ProcessStatus, apache.airavata.model.status.ttypes.ProcessStatus.thrift_spec)), None, ), # 5
    (6, TType.STRING, 'processDetail', None, None, ), # 6
    (7, TType.STRING, 'applicationInterfaceId', None, None, ), # 7
    (8, TType.STRING, 'applicationDeploymentId', None, None, ), # 8
    (9, TType.STRING, 'computeResourceId', None, None, ), # 9
    (10, TType.LIST, 'processInputs', (TType.STRUCT,(apache.airavata.model.application.io.ttypes.InputDataObjectType, apache.airavata.model.application.io.ttypes.InputDataObjectType.thrift_spec)), None, ), # 10
    (11, TType.LIST, 'processOutputs', (TType.STRUCT,(apache.airavata.model.application.io.ttypes.OutputDataObjectType, apache.airavata.model.application.io.ttypes.OutputDataObjectType.thrift_spec)), None, ), # 11
    (12, TType.STRUCT, 'processResourceSchedule', (apache.airavata.model.scheduling.ttypes.ComputationalResourceSchedulingModel, apache.airavata.model.scheduling.ttypes.ComputationalResourceSchedulingModel.thrift_spec), None, ), # 12
    (13, TType.LIST, 'tasks', (TType.STRUCT,(apache.airavata.model.task.ttypes.TaskModel, apache.airavata.model.task.ttypes.TaskModel.thrift_spec)), None, ), # 13
    (14, TType.STRING, 'taskDag', None, None, ), # 14
    (15, TType.LIST, 'processErrors', (TType.STRUCT,(apache.airavata.model.commons.ttypes.ErrorModel, apache.airavata.model.commons.ttypes.ErrorModel.thrift_spec)), None, ), # 15
    (16, TType.STRING, 'gatewayExecutionId', None, None, ), # 16
    (17, TType.BOOL, 'enableEmailNotification', None, None, ), # 17
    (18, TType.LIST, 'emailAddresses', (TType.STRING,None), None, ), # 18
    (19, TType.STRING, 'storageResourceId', None, None, ), # 19
    (20, TType.STRING, 'userDn', None, None, ), # 20
    (21, TType.BOOL, 'generateCert', None, False, ), # 21
    (22, TType.STRING, 'experimentDataDir', None, None, ), # 22
    (23, TType.STRING, 'userName', None, None, ), # 23
    (24, TType.BOOL, 'useUserCRPref', None, None, ), # 24
  )

  def __init__(self, processId=thrift_spec[1][4], experimentId=None, creationTime=None, lastUpdateTime=None, processStatuses=None, processDetail=None, applicationInterfaceId=None, applicationDeploymentId=None, computeResourceId=None, processInputs=None, processOutputs=None, processResourceSchedule=None, tasks=None, taskDag=None, processErrors=None, gatewayExecutionId=None, enableEmailNotification=None, emailAddresses=None, storageResourceId=None, userDn=None, generateCert=thrift_spec[21][4], experimentDataDir=None, userName=None, useUserCRPref=None,):
    self.processId = processId
    self.experimentId = experimentId
    self.creationTime = creationTime
    self.lastUpdateTime = lastUpdateTime
    self.processStatuses = processStatuses
    self.processDetail = processDetail
    self.applicationInterfaceId = applicationInterfaceId
    self.applicationDeploymentId = applicationDeploymentId
    self.computeResourceId = computeResourceId
    self.processInputs = processInputs
    self.processOutputs = processOutputs
    self.processResourceSchedule = processResourceSchedule
    self.tasks = tasks
    self.taskDag = taskDag
    self.processErrors = processErrors
    self.gatewayExecutionId = gatewayExecutionId
    self.enableEmailNotification = enableEmailNotification
    self.emailAddresses = emailAddresses
    self.storageResourceId = storageResourceId
    self.userDn = userDn
    self.generateCert = generateCert
    self.experimentDataDir = experimentDataDir
    self.userName = userName
    self.useUserCRPref = useUserCRPref

  def read(self, iprot):
    if iprot.__class__ == TBinaryProtocol.TBinaryProtocolAccelerated and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None and fastbinary is not None:
      fastbinary.decode_binary(self, iprot.trans, (self.__class__, self.thrift_spec))
      return
    iprot.readStructBegin()
    while True:
      (fname, ftype, fid) = iprot.readFieldBegin()
      if ftype == TType.STOP:
        break
      if fid == 1:
        if ftype == TType.STRING:
          self.processId = iprot.readString()
        else:
          iprot.skip(ftype)
      elif fid == 2:
        if ftype == TType.STRING:
          self.experimentId = iprot.readString()
        else:
          iprot.skip(ftype)
      elif fid == 3:
        if ftype == TType.I64:
          self.creationTime = iprot.readI64()
        else:
          iprot.skip(ftype)
      elif fid == 4:
        if ftype == TType.I64:
          self.lastUpdateTime = iprot.readI64()
        else:
          iprot.skip(ftype)
      elif fid == 5:
        if ftype == TType.LIST:
          self.processStatuses = []
          (_etype3, _size0) = iprot.readListBegin()
          for _i4 in xrange(_size0):
            _elem5 = apache.airavata.model.status.ttypes.ProcessStatus()
            _elem5.read(iprot)
            self.processStatuses.append(_elem5)
          iprot.readListEnd()
        else:
          iprot.skip(ftype)
      elif fid == 6:
        if ftype == TType.STRING:
          self.processDetail = iprot.readString()
        else:
          iprot.skip(ftype)
      elif fid == 7:
        if ftype == TType.STRING:
          self.applicationInterfaceId = iprot.readString()
        else:
          iprot.skip(ftype)
      elif fid == 8:
        if ftype == TType.STRING:
          self.applicationDeploymentId = iprot.readString()
        else:
          iprot.skip(ftype)
      elif fid == 9:
        if ftype == TType.STRING:
          self.computeResourceId = iprot.readString()
        else:
          iprot.skip(ftype)
      elif fid == 10:
        if ftype == TType.LIST:
          self.processInputs = []
          (_etype9, _size6) = iprot.readListBegin()
          for _i10 in xrange(_size6):
            _elem11 = apache.airavata.model.application.io.ttypes.InputDataObjectType()
            _elem11.read(iprot)
            self.processInputs.append(_elem11)
          iprot.readListEnd()
        else:
          iprot.skip(ftype)
      elif fid == 11:
        if ftype == TType.LIST:
          self.processOutputs = []
          (_etype15, _size12) = iprot.readListBegin()
          for _i16 in xrange(_size12):
            _elem17 = apache.airavata.model.application.io.ttypes.OutputDataObjectType()
            _elem17.read(iprot)
            self.processOutputs.append(_elem17)
          iprot.readListEnd()
        else:
          iprot.skip(ftype)
      elif fid == 12:
        if ftype == TType.STRUCT:
          self.processResourceSchedule = apache.airavata.model.scheduling.ttypes.ComputationalResourceSchedulingModel()
          self.processResourceSchedule.read(iprot)
        else:
          iprot.skip(ftype)
      elif fid == 13:
        if ftype == TType.LIST:
          self.tasks = []
          (_etype21, _size18) = iprot.readListBegin()
          for _i22 in xrange(_size18):
            _elem23 = apache.airavata.model.task.ttypes.TaskModel()
            _elem23.read(iprot)
            self.tasks.append(_elem23)
          iprot.readListEnd()
        else:
          iprot.skip(ftype)
      elif fid == 14:
        if ftype == TType.STRING:
          self.taskDag = iprot.readString()
        else:
          iprot.skip(ftype)
      elif fid == 15:
        if ftype == TType.LIST:
          self.processErrors = []
          (_etype27, _size24) = iprot.readListBegin()
          for _i28 in xrange(_size24):
            _elem29 = apache.airavata.model.commons.ttypes.ErrorModel()
            _elem29.read(iprot)
            self.processErrors.append(_elem29)
          iprot.readListEnd()
        else:
          iprot.skip(ftype)
      elif fid == 16:
        if ftype == TType.STRING:
          self.gatewayExecutionId = iprot.readString()
        else:
          iprot.skip(ftype)
      elif fid == 17:
        if ftype == TType.BOOL:
          self.enableEmailNotification = iprot.readBool()
        else:
          iprot.skip(ftype)
      elif fid == 18:
        if ftype == TType.LIST:
          self.emailAddresses = []
          (_etype33, _size30) = iprot.readListBegin()
          for _i34 in xrange(_size30):
            _elem35 = iprot.readString()
            self.emailAddresses.append(_elem35)
          iprot.readListEnd()
        else:
          iprot.skip(ftype)
      elif fid == 19:
        if ftype == TType.STRING:
          self.storageResourceId = iprot.readString()
        else:
          iprot.skip(ftype)
      elif fid == 20:
        if ftype == TType.STRING:
          self.userDn = iprot.readString()
        else:
          iprot.skip(ftype)
      elif fid == 21:
        if ftype == TType.BOOL:
          self.generateCert = iprot.readBool()
        else:
          iprot.skip(ftype)
      elif fid == 22:
        if ftype == TType.STRING:
          self.experimentDataDir = iprot.readString()
        else:
          iprot.skip(ftype)
      elif fid == 23:
        if ftype == TType.STRING:
          self.userName = iprot.readString()
        else:
          iprot.skip(ftype)
      elif fid == 24:
        if ftype == TType.BOOL:
          self.useUserCRPref = iprot.readBool()
        else:
          iprot.skip(ftype)
      else:
        iprot.skip(ftype)
      iprot.readFieldEnd()
    iprot.readStructEnd()

  def write(self, oprot):
    if oprot.__class__ == TBinaryProtocol.TBinaryProtocolAccelerated and self.thrift_spec is not None and fastbinary is not None:
      oprot.trans.write(fastbinary.encode_binary(self, (self.__class__, self.thrift_spec)))
      return
    oprot.writeStructBegin('ProcessModel')
    if self.processId is not None:
      oprot.writeFieldBegin('processId', TType.STRING, 1)
      oprot.writeString(self.processId)
      oprot.writeFieldEnd()
    if self.experimentId is not None:
      oprot.writeFieldBegin('experimentId', TType.STRING, 2)
      oprot.writeString(self.experimentId)
      oprot.writeFieldEnd()
    if self.creationTime is not None:
      oprot.writeFieldBegin('creationTime', TType.I64, 3)
      oprot.writeI64(self.creationTime)
      oprot.writeFieldEnd()
    if self.lastUpdateTime is not None:
      oprot.writeFieldBegin('lastUpdateTime', TType.I64, 4)
      oprot.writeI64(self.lastUpdateTime)
      oprot.writeFieldEnd()
    if self.processStatuses is not None:
      oprot.writeFieldBegin('processStatuses', TType.LIST, 5)
      oprot.writeListBegin(TType.STRUCT, len(self.processStatuses))
      for iter36 in self.processStatuses:
        iter36.write(oprot)
      oprot.writeListEnd()
      oprot.writeFieldEnd()
    if self.processDetail is not None:
      oprot.writeFieldBegin('processDetail', TType.STRING, 6)
      oprot.writeString(self.processDetail)
      oprot.writeFieldEnd()
    if self.applicationInterfaceId is not None:
      oprot.writeFieldBegin('applicationInterfaceId', TType.STRING, 7)
      oprot.writeString(self.applicationInterfaceId)
      oprot.writeFieldEnd()
    if self.applicationDeploymentId is not None:
      oprot.writeFieldBegin('applicationDeploymentId', TType.STRING, 8)
      oprot.writeString(self.applicationDeploymentId)
      oprot.writeFieldEnd()
    if self.computeResourceId is not None:
      oprot.writeFieldBegin('computeResourceId', TType.STRING, 9)
      oprot.writeString(self.computeResourceId)
      oprot.writeFieldEnd()
    if self.processInputs is not None:
      oprot.writeFieldBegin('processInputs', TType.LIST, 10)
      oprot.writeListBegin(TType.STRUCT, len(self.processInputs))
      for iter37 in self.processInputs:
        iter37.write(oprot)
      oprot.writeListEnd()
      oprot.writeFieldEnd()
    if self.processOutputs is not None:
      oprot.writeFieldBegin('processOutputs', TType.LIST, 11)
      oprot.writeListBegin(TType.STRUCT, len(self.processOutputs))
      for iter38 in self.processOutputs:
        iter38.write(oprot)
      oprot.writeListEnd()
      oprot.writeFieldEnd()
    if self.processResourceSchedule is not None:
      oprot.writeFieldBegin('processResourceSchedule', TType.STRUCT, 12)
      self.processResourceSchedule.write(oprot)
      oprot.writeFieldEnd()
    if self.tasks is not None:
      oprot.writeFieldBegin('tasks', TType.LIST, 13)
      oprot.writeListBegin(TType.STRUCT, len(self.tasks))
      for iter39 in self.tasks:
        iter39.write(oprot)
      oprot.writeListEnd()
      oprot.writeFieldEnd()
    if self.taskDag is not None:
      oprot.writeFieldBegin('taskDag', TType.STRING, 14)
      oprot.writeString(self.taskDag)
      oprot.writeFieldEnd()
    if self.processErrors is not None:
      oprot.writeFieldBegin('processErrors', TType.LIST, 15)
      oprot.writeListBegin(TType.STRUCT, len(self.processErrors))
      for iter40 in self.processErrors:
        iter40.write(oprot)
      oprot.writeListEnd()
      oprot.writeFieldEnd()
    if self.gatewayExecutionId is not None:
      oprot.writeFieldBegin('gatewayExecutionId', TType.STRING, 16)
      oprot.writeString(self.gatewayExecutionId)
      oprot.writeFieldEnd()
    if self.enableEmailNotification is not None:
      oprot.writeFieldBegin('enableEmailNotification', TType.BOOL, 17)
      oprot.writeBool(self.enableEmailNotification)
      oprot.writeFieldEnd()
    if self.emailAddresses is not None:
      oprot.writeFieldBegin('emailAddresses', TType.LIST, 18)
      oprot.writeListBegin(TType.STRING, len(self.emailAddresses))
      for iter41 in self.emailAddresses:
        oprot.writeString(iter41)
      oprot.writeListEnd()
      oprot.writeFieldEnd()
    if self.storageResourceId is not None:
      oprot.writeFieldBegin('storageResourceId', TType.STRING, 19)
      oprot.writeString(self.storageResourceId)
      oprot.writeFieldEnd()
    if self.userDn is not None:
      oprot.writeFieldBegin('userDn', TType.STRING, 20)
      oprot.writeString(self.userDn)
      oprot.writeFieldEnd()
    if self.generateCert is not None:
      oprot.writeFieldBegin('generateCert', TType.BOOL, 21)
      oprot.writeBool(self.generateCert)
      oprot.writeFieldEnd()
    if self.experimentDataDir is not None:
      oprot.writeFieldBegin('experimentDataDir', TType.STRING, 22)
      oprot.writeString(self.experimentDataDir)
      oprot.writeFieldEnd()
    if self.userName is not None:
      oprot.writeFieldBegin('userName', TType.STRING, 23)
      oprot.writeString(self.userName)
      oprot.writeFieldEnd()
    if self.useUserCRPref is not None:
      oprot.writeFieldBegin('useUserCRPref', TType.BOOL, 24)
      oprot.writeBool(self.useUserCRPref)
      oprot.writeFieldEnd()
    oprot.writeFieldStop()
    oprot.writeStructEnd()

  def validate(self):
    if self.processId is None:
      raise TProtocol.TProtocolException(message='Required field processId is unset!')
    if self.experimentId is None:
      raise TProtocol.TProtocolException(message='Required field experimentId is unset!')
    return


  def __hash__(self):
    value = 17
    value = (value * 31) ^ hash(self.processId)
    value = (value * 31) ^ hash(self.experimentId)
    value = (value * 31) ^ hash(self.creationTime)
    value = (value * 31) ^ hash(self.lastUpdateTime)
    value = (value * 31) ^ hash(self.processStatuses)
    value = (value * 31) ^ hash(self.processDetail)
    value = (value * 31) ^ hash(self.applicationInterfaceId)
    value = (value * 31) ^ hash(self.applicationDeploymentId)
    value = (value * 31) ^ hash(self.computeResourceId)
    value = (value * 31) ^ hash(self.processInputs)
    value = (value * 31) ^ hash(self.processOutputs)
    value = (value * 31) ^ hash(self.processResourceSchedule)
    value = (value * 31) ^ hash(self.tasks)
    value = (value * 31) ^ hash(self.taskDag)
    value = (value * 31) ^ hash(self.processErrors)
    value = (value * 31) ^ hash(self.gatewayExecutionId)
    value = (value * 31) ^ hash(self.enableEmailNotification)
    value = (value * 31) ^ hash(self.emailAddresses)
    value = (value * 31) ^ hash(self.storageResourceId)
    value = (value * 31) ^ hash(self.userDn)
    value = (value * 31) ^ hash(self.generateCert)
    value = (value * 31) ^ hash(self.experimentDataDir)
    value = (value * 31) ^ hash(self.userName)
    value = (value * 31) ^ hash(self.useUserCRPref)
    return value

  def __repr__(self):
    L = ['%s=%r' % (key, value)
      for key, value in self.__dict__.iteritems()]
    return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

  def __eq__(self, other):
    return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

  def __ne__(self, other):
    return not (self == other)

/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* deviceCreateRequest DeviceCreateRequest Device representation
* returns DeviceResponse
* */
const devicesCreate_instance = ({ deviceCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        deviceCreateRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
*
* filterLeft_Square_BracketnameRight_Square_Bracket List filter by attribute 'name' (optional)
* filterLeft_Square_BracketplatformRight_Square_Bracket List filter by attribute 'platform' (optional)
* filterLeft_Square_BracketstatusRight_Square_Bracket List filter by attribute 'status' (optional)
* filterLeft_Square_BracketudidRight_Square_Bracket List filter by attribute 'udid' (optional)
* filterLeft_Square_BracketidRight_Square_Bracket List filter by id(s) (optional)
* sort List comma-separated list of sort expressions; resources will be sorted as specified (optional)
* fieldsLeft_Square_BracketdevicesRight_Square_Bracket List the fields to include for returned resources of type devices (optional)
* limit Integer maximum resources per page (optional)
* returns DevicesResponse
* */
const devicesGet_collection = ({ filterLeft_Square_BracketnameRight_Square_Bracket, filterLeft_Square_BracketplatformRight_Square_Bracket, filterLeft_Square_BracketstatusRight_Square_Bracket, filterLeft_Square_BracketudidRight_Square_Bracket, filterLeft_Square_BracketidRight_Square_Bracket, sort, fieldsLeft_Square_BracketdevicesRight_Square_Bracket, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        filterLeft_Square_BracketnameRight_Square_Bracket,
        filterLeft_Square_BracketplatformRight_Square_Bracket,
        filterLeft_Square_BracketstatusRight_Square_Bracket,
        filterLeft_Square_BracketudidRight_Square_Bracket,
        filterLeft_Square_BracketidRight_Square_Bracket,
        sort,
        fieldsLeft_Square_BracketdevicesRight_Square_Bracket,
        limit,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
*
* id String the id of the requested resource
* fieldsLeft_Square_BracketdevicesRight_Square_Bracket List the fields to include for returned resources of type devices (optional)
* returns DeviceResponse
* */
const devicesGet_instance = ({ id, fieldsLeft_Square_BracketdevicesRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketdevicesRight_Square_Bracket,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
*
* id String the id of the requested resource
* deviceUpdateRequest DeviceUpdateRequest Device representation
* returns DeviceResponse
* */
const devicesUpdate_instance = ({ id, deviceUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        deviceUpdateRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  devicesCreate_instance,
  devicesGet_collection,
  devicesGet_instance,
  devicesUpdate_instance,
};

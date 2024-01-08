/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* appPreOrderCreateRequest AppPreOrderCreateRequest AppPreOrder representation
* returns AppPreOrderResponse
* */
const appPreOrdersCreate_instance = ({ appPreOrderCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        appPreOrderCreateRequest,
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
* no response value expected for this operation
* */
const appPreOrdersDelete_instance = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
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
* fieldsLeft_Square_BracketappPreOrdersRight_Square_Bracket List the fields to include for returned resources of type appPreOrders (optional)
* include List comma-separated list of relationships to include (optional)
* returns AppPreOrderResponse
* */
const appPreOrdersGet_instance = ({ id, fieldsLeft_Square_BracketappPreOrdersRight_Square_Bracket, include }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketappPreOrdersRight_Square_Bracket,
        include,
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
* appPreOrderUpdateRequest AppPreOrderUpdateRequest AppPreOrder representation
* returns AppPreOrderResponse
* */
const appPreOrdersUpdate_instance = ({ id, appPreOrderUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        appPreOrderUpdateRequest,
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
  appPreOrdersCreate_instance,
  appPreOrdersDelete_instance,
  appPreOrdersGet_instance,
  appPreOrdersUpdate_instance,
};

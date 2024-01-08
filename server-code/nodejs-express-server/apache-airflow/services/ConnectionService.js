/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Delete a connection
*
* connectionUnderscoreid String The connection ID.
* no response value expected for this operation
* */
const delete_connection = ({ connectionUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        connectionUnderscoreid,
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
* Get a connection
*
* connectionUnderscoreid String The connection ID.
* returns Connection
* */
const get_connection = ({ connectionUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        connectionUnderscoreid,
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
* List connections
*
* limit Integer The numbers of items to return. (optional)
* offset Integer The number of items to skip before starting to collect the result set. (optional)
* orderUnderscoreby String The name of the field to order the results by. Prefix a field name with `-` to reverse the sort order.  *New in version 2.1.0*  (optional)
* returns ConnectionCollection
* */
const get_connections = ({ limit, offset, orderUnderscoreby }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        offset,
        orderUnderscoreby,
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
* Update a connection
*
* connectionUnderscoreid String The connection ID.
* connection Connection 
* updateUnderscoremask List The fields to update on the resource. If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional)
* returns Connection
* */
const patch_connection = ({ connectionUnderscoreid, connection, updateUnderscoremask }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        connectionUnderscoreid,
        connection,
        updateUnderscoremask,
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
* Create a connection
*
* connection Connection 
* returns Connection
* */
const post_connection = ({ connection }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        connection,
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
* Test a connection
* Test a connection.  *New in version 2.2.0* 
*
* connection Connection 
* returns ConnectionTest
* */
const test_connection = ({ connection }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        connection,
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
  delete_connection,
  get_connection,
  get_connections,
  patch_connection,
  post_connection,
  test_connection,
};

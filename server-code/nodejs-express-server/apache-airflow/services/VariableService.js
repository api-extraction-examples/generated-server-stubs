/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Delete a variable
*
* variableUnderscorekey String The variable Key.
* no response value expected for this operation
* */
const delete_variable = ({ variableUnderscorekey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        variableUnderscorekey,
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
* Get a variable
* Get a variable by key.
*
* variableUnderscorekey String The variable Key.
* returns Variable
* */
const get_variable = ({ variableUnderscorekey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        variableUnderscorekey,
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
* List variables
* The collection does not contain data. To get data, you must get a single entity.
*
* limit Integer The numbers of items to return. (optional)
* offset Integer The number of items to skip before starting to collect the result set. (optional)
* orderUnderscoreby String The name of the field to order the results by. Prefix a field name with `-` to reverse the sort order.  *New in version 2.1.0*  (optional)
* returns VariableCollection
* */
const get_variables = ({ limit, offset, orderUnderscoreby }) => new Promise(
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
* Update a variable
* Update a variable by key.
*
* variableUnderscorekey String The variable Key.
* variable Variable 
* updateUnderscoremask List The fields to update on the resource. If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional)
* returns Variable
* */
const patch_variable = ({ variableUnderscorekey, variable, updateUnderscoremask }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        variableUnderscorekey,
        variable,
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
* Create a variable
*
* variable Variable 
* returns Variable
* */
const post_variables = ({ variable }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        variable,
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
  delete_variable,
  get_variable,
  get_variables,
  patch_variable,
  post_variables,
};

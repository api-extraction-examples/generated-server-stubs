/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get an import error
*
* importUnderscoreerrorUnderscoreid Integer The import error ID.
* returns ImportError
* */
const get_import_error = ({ importUnderscoreerrorUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        importUnderscoreerrorUnderscoreid,
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
* List import errors
*
* limit Integer The numbers of items to return. (optional)
* offset Integer The number of items to skip before starting to collect the result set. (optional)
* orderUnderscoreby String The name of the field to order the results by. Prefix a field name with `-` to reverse the sort order.  *New in version 2.1.0*  (optional)
* returns ImportErrorCollection
* */
const get_import_errors = ({ limit, offset, orderUnderscoreby }) => new Promise(
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

module.exports = {
  get_import_error,
  get_import_errors,
};

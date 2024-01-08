/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get status
* Returns a status. The status must be associated with an active workflow to be returned.  If a name is used on more than one status, only the status found first is returned. Therefore, identifying the status by its ID may be preferable.  This operation can be accessed anonymously.  [Permissions](#permissions) required: None.
*
* idOrName String The ID or name of the status.
* returns StatusDetails
* */
const getStatus = ({ idOrName }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        idOrName,
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
* Get all statuses
* Returns a list of all statuses associated with active workflows.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
*
* returns List
* */
const getStatuses = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
  getStatus,
  getStatuses,
};

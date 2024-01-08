/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* List available groups.
* List available groups.
*
* returns Object
* */
const groupGET = () => new Promise(
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
/**
* Delete a group.
* Delete a group.
*
* no response value expected for this operation
* */
const groupGroupTitleDELETE = () => new Promise(
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
/**
* Read group data.
* Read group data.
*
* groupUnderscoretitle String Group title
* returns _group__group_title__get_200_response
* */
const groupGroupTitleGET = ({ groupUnderscoretitle }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        groupUnderscoretitle,
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
* Modify group data.
* Modify group data.
*
* cmd String Command to be executed. It takes one of these available values: * `add_user`: add a user to a group. `userid` query parameter must be also used. * `remove_user`: remove a user from a group. `userid` query parameter must be also used. * `set_email`: set email adress of group. `email` query parameter must be also used.  (optional)
* userid String User login. Used with `cmd=add_user` or `cmd=remove_user`. (optional)
* email String Group email. Used with `cmd=set_email`. (optional)
* no response value expected for this operation
* */
const groupGroupTitlePOST = ({ cmd, userid, email }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        cmd,
        userid,
        email,
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
* Write group data.
* Write group data.
*
* body Object Group definition.  XML Schema used for body validation: [group.rng](../schema/group.rng) 
* no response value expected for this operation
* */
const groupGroupTitlePUT = ({ body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        body,
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
  groupGET,
  groupGroupTitleDELETE,
  groupGroupTitleGET,
  groupGroupTitlePOST,
  groupGroupTitlePUT,
};

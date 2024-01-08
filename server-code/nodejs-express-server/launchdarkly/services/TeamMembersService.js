/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Delete a team member by ID.
*
* memberId String The member ID.
* no response value expected for this operation
* */
const deleteMember = ({ memberId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        memberId,
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
* Get the current team member associated with the token
*
* returns Member
* */
const getMe = () => new Promise(
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
* Get a single team member by ID.
*
* memberId String The member ID.
* returns Member
* */
const getMember = ({ memberId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        memberId,
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
* Returns a list of all members in the account.
*
* limit BigDecimal The number of objects to return. Defaults to -1, which returns everything. (optional)
* offset BigDecimal Where to start in the list. This is for use with pagination. For example, an offset of 10 would skip the first 10 items and then return the next limit items. (optional)
* filter String A comma-separated list of filters. Each filter is of the form field:value. (optional)
* sort String A comma-separated list of fields to sort by. A field prefixed by a - will be sorted in descending order. (optional)
* returns Members
* */
const getMembers = ({ limit, offset, filter, sort }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        offset,
        filter,
        sort,
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
* Modify a team member by ID.
*
* memberId String The member ID.
* patchDelta List Requires a JSON Patch representation of the desired changes to the project. 'http://jsonpatch.com/'
* returns Member
* */
const patchMember = ({ memberId, patchDelta }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        memberId,
        patchDelta,
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
* Invite new members.
*
* membersBody List New members to invite.
* returns Members
* */
const postMembers = ({ membersBody }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        membersBody,
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
  deleteMember,
  getMe,
  getMember,
  getMembers,
  patchMember,
  postMembers,
};

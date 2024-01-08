/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get a user task list
* Returns the full record for a user task list.
*
* userUnderscoretaskUnderscorelistUnderscoregid String Globally unique identifier for the user task list.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns getUserTaskList_200_response
* */
const getUserTaskList = ({ userUnderscoretaskUnderscorelistUnderscoregid, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userUnderscoretaskUnderscorelistUnderscoregid,
        optUnderscorepretty,
        optUnderscorefields,
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
* Get a user's task list
* Returns the full record for a user's task list.
*
* userUnderscoregid String A string identifying a user. This can either be the string \"me\", an email, or the gid of a user.
* workspace String The workspace in which to get the user task list.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns getUserTaskList_200_response
* */
const getUserTaskListForUser = ({ userUnderscoregid, workspace, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userUnderscoregid,
        workspace,
        optUnderscorepretty,
        optUnderscorefields,
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
  getUserTaskList,
  getUserTaskListForUser,
};

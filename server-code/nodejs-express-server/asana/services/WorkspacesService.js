/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Add a user to a workspace or organization
* Add a user to a workspace or organization. The user can be referenced by their globally unique user ID or their email address. Returns the full user record for the invited user.
*
* workspaceUnderscoregid String Globally unique identifier for the workspace or organization.
* addUserForWorkspaceRequest AddUserForWorkspaceRequest The user to add to the workspace.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns addUserForWorkspace_200_response
* */
const addUserForWorkspace = ({ workspaceUnderscoregid, addUserForWorkspaceRequest, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        workspaceUnderscoregid,
        addUserForWorkspaceRequest,
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
* Get a workspace
* Returns the full workspace record for a single workspace.
*
* workspaceUnderscoregid String Globally unique identifier for the workspace or organization.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns getWorkspace_200_response
* */
const getWorkspace = ({ workspaceUnderscoregid, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        workspaceUnderscoregid,
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
* Get multiple workspaces
* Returns the compact records for all workspaces visible to the authorized user.
*
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* limit Integer Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
* offset String Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. 'Note: You can only pass in an offset that was returned to you via a previously paginated request.' (optional)
* returns getWorkspaces_200_response
* */
const getWorkspaces = ({ optUnderscorepretty, optUnderscorefields, limit, offset }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        optUnderscorepretty,
        optUnderscorefields,
        limit,
        offset,
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
* Remove a user from a workspace or organization
* Remove a user from a workspace or organization. The user making this call must be an admin in the workspace. The user can be referenced by their globally unique user ID or their email address. Returns an empty data record.
*
* workspaceUnderscoregid String Globally unique identifier for the workspace or organization.
* removeUserForWorkspaceRequest RemoveUserForWorkspaceRequest The user to remove from the workspace.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns deleteAttachment_200_response
* */
const removeUserForWorkspace = ({ workspaceUnderscoregid, removeUserForWorkspaceRequest, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        workspaceUnderscoregid,
        removeUserForWorkspaceRequest,
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
* Update a workspace
* A specific, existing workspace can be updated by making a PUT request on the URL for that workspace. Only the fields provided in the data block will be updated; any unspecified fields will remain unchanged. Currently the only field that can be modified for a workspace is its name. Returns the complete, updated workspace record.
*
* workspaceUnderscoregid String Globally unique identifier for the workspace or organization.
* updateWorkspaceRequest UpdateWorkspaceRequest The workspace object with all updated properties.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns getWorkspace_200_response
* */
const updateWorkspace = ({ workspaceUnderscoregid, updateWorkspaceRequest, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        workspaceUnderscoregid,
        updateWorkspaceRequest,
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
  addUserForWorkspace,
  getWorkspace,
  getWorkspaces,
  removeUserForWorkspace,
  updateWorkspace,
};

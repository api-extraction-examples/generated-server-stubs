/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Delete comment property
* Deletes a comment property.  **[Permissions](#permissions) required:** either of:   *  *Edit All Comments* [project permission](https://confluence.atlassian.com/x/yodKLg) to delete a property from any comment.  *  *Edit Own Comments* [project permission](https://confluence.atlassian.com/x/yodKLg) to delete a property from a comment created by the user.  Also, when the visibility of a comment is restricted to a role or group the user must be a member of that role or group.
*
* commentId String The ID of the comment.
* propertyKey String The key of the property.
* no response value expected for this operation
* */
const deleteCommentProperty = ({ commentId, propertyKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        commentId,
        propertyKey,
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
* Get comment property
* Returns the value of a comment property.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the comment has visibility restrictions, belongs to the group or has the role visibility is restricted to.
*
* commentId String The ID of the comment.
* propertyKey String The key of the property.
* returns EntityProperty
* */
const getCommentProperty = ({ commentId, propertyKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        commentId,
        propertyKey,
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
* Get comment property keys
* Returns the keys of all the properties of a comment.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the comment has visibility restrictions, belongs to the group or has the role visibility is restricted to.
*
* commentId String The ID of the comment.
* returns PropertyKeys
* */
const getCommentPropertyKeys = ({ commentId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        commentId,
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
* Set comment property
* Creates or updates the value of a property for a comment. Use this resource to store custom data against a comment.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  **[Permissions](#permissions) required:** either of:   *  *Edit All Comments* [project permission](https://confluence.atlassian.com/x/yodKLg) to create or update the value of a property on any comment.  *  *Edit Own Comments* [project permission](https://confluence.atlassian.com/x/yodKLg) to create or update the value of a property on a comment created by the user.  Also, when the visibility of a comment is restricted to a role or group the user must be a member of that role or group.
*
* commentId String The ID of the comment.
* propertyKey String The key of the property. The maximum length is 255 characters.
* body oas_any_type_not_mapped 
* returns oas_any_type_not_mapped
* */
const setCommentProperty = ({ commentId, propertyKey, body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        commentId,
        propertyKey,
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
  deleteCommentProperty,
  getCommentProperty,
  getCommentPropertyKeys,
  setCommentProperty,
};

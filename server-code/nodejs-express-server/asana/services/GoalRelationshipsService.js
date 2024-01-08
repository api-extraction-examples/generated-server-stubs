/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Add a supporting goal relationship
* Creates a goal relationship by adding a supporting resource to a given goal.  Returns the newly created goal relationship record.
*
* goalUnderscoregid String Globally unique identifier for the goal.
* addSupportingRelationshipRequest AddSupportingRelationshipRequest The supporting resource to be added to the goal
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns getGoalRelationship_200_response
* */
const addSupportingRelationship = ({ goalUnderscoregid, addSupportingRelationshipRequest, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        goalUnderscoregid,
        addSupportingRelationshipRequest,
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
* Get a goal relationship
* Returns the complete updated goal relationship record for a single goal relationship.
*
* goalUnderscorerelationshipUnderscoregid String Globally unique identifier for the goal relationship.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns getGoalRelationship_200_response
* */
const getGoalRelationship = ({ goalUnderscorerelationshipUnderscoregid, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        goalUnderscorerelationshipUnderscoregid,
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
* Get goal relationships
* Returns compact goal relationship records.
*
* supportedUnderscoregoal String Globally unique identifier for the supported goal in the goal relationship.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* resourceUnderscoresubtype String If provided, filter to goal relationships with a given resource_subtype. (optional)
* returns getGoalRelationships_200_response
* */
const getGoalRelationships = ({ supportedUnderscoregoal, optUnderscorepretty, optUnderscorefields, resourceUnderscoresubtype }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        supportedUnderscoregoal,
        optUnderscorepretty,
        optUnderscorefields,
        resourceUnderscoresubtype,
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
* Removes a supporting goal relationship
* Removes a goal relationship for a given parent goal.
*
* goalUnderscoregid String Globally unique identifier for the goal.
* removeSupportingRelationshipRequest RemoveSupportingRelationshipRequest The supporting resource to be removed from the goal
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns deleteAttachment_200_response
* */
const removeSupportingRelationship = ({ goalUnderscoregid, removeSupportingRelationshipRequest, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        goalUnderscoregid,
        removeSupportingRelationshipRequest,
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
* Update a goal relationship
* An existing goal relationship can be updated by making a PUT request on the URL for that goal relationship. Only the fields provided in the `data` block will be updated; any unspecified fields will remain unchanged.  Returns the complete updated goal relationship record.
*
* goalUnderscorerelationshipUnderscoregid String Globally unique identifier for the goal relationship.
* updateGoalRelationshipRequest UpdateGoalRelationshipRequest The updated fields for the goal relationship.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns getGoalRelationship_200_response
* */
const updateGoalRelationship = ({ goalUnderscorerelationshipUnderscoregid, updateGoalRelationshipRequest, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        goalUnderscorerelationshipUnderscoregid,
        updateGoalRelationshipRequest,
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
  addSupportingRelationship,
  getGoalRelationship,
  getGoalRelationships,
  removeSupportingRelationship,
  updateGoalRelationship,
};

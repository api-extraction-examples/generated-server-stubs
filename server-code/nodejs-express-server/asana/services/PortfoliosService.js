/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Add a custom field to a portfolio
* Custom fields are associated with portfolios by way of custom field settings.  This method creates a setting for the portfolio.
*
* portfolioUnderscoregid String Globally unique identifier for the portfolio.
* addCustomFieldSettingForPortfolioRequest AddCustomFieldSettingForPortfolioRequest Information about the custom field setting.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* returns addCustomFieldSettingForPortfolio_200_response
* */
const addCustomFieldSettingForPortfolio = ({ portfolioUnderscoregid, addCustomFieldSettingForPortfolioRequest, optUnderscorepretty }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        portfolioUnderscoregid,
        addCustomFieldSettingForPortfolioRequest,
        optUnderscorepretty,
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
* Add a portfolio item
* Add an item to a portfolio. Returns an empty data block.
*
* portfolioUnderscoregid String Globally unique identifier for the portfolio.
* addItemForPortfolioRequest AddItemForPortfolioRequest Information about the item being inserted.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns deleteAttachment_200_response
* */
const addItemForPortfolio = ({ portfolioUnderscoregid, addItemForPortfolioRequest, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        portfolioUnderscoregid,
        addItemForPortfolioRequest,
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
* Add users to a portfolio
* Adds the specified list of users as members of the portfolio. Returns the updated portfolio record.
*
* portfolioUnderscoregid String Globally unique identifier for the portfolio.
* addMembersForPortfolioRequest AddMembersForPortfolioRequest Information about the members being added.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns createPortfolio_201_response
* */
const addMembersForPortfolio = ({ portfolioUnderscoregid, addMembersForPortfolioRequest, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        portfolioUnderscoregid,
        addMembersForPortfolioRequest,
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
* Create a portfolio
* Creates a new portfolio in the given workspace with the supplied name.  Note that portfolios created in the Asana UI may have some state (like the “Priority” custom field) which is automatically added to the portfolio when it is created. Portfolios created via our API will *not* be created with the same initial state to allow integrations to create their own starting state on a portfolio.
*
* createPortfolioRequest CreatePortfolioRequest The portfolio to create.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns createPortfolio_201_response
* */
const createPortfolio = ({ createPortfolioRequest, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        createPortfolioRequest,
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
* Delete a portfolio
* An existing portfolio can be deleted by making a DELETE request on the URL for that portfolio.  Returns an empty data record.
*
* portfolioUnderscoregid String Globally unique identifier for the portfolio.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns deleteAttachment_200_response
* */
const deletePortfolio = ({ portfolioUnderscoregid, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        portfolioUnderscoregid,
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
* Get portfolio items
* Get a list of the items in compact form in a portfolio.
*
* portfolioUnderscoregid String Globally unique identifier for the portfolio.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* limit Integer Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
* offset String Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. 'Note: You can only pass in an offset that was returned to you via a previously paginated request.' (optional)
* returns getItemsForPortfolio_200_response
* */
const getItemsForPortfolio = ({ portfolioUnderscoregid, optUnderscorepretty, optUnderscorefields, limit, offset }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        portfolioUnderscoregid,
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
* Get a portfolio
* Returns the complete portfolio record for a single portfolio.
*
* portfolioUnderscoregid String Globally unique identifier for the portfolio.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns createPortfolio_201_response
* */
const getPortfolio = ({ portfolioUnderscoregid, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        portfolioUnderscoregid,
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
* Get multiple portfolios
* Returns a list of the portfolios in compact representation that are owned by the current API user.
*
* workspace String The workspace or organization to filter portfolios on.
* owner String The user who owns the portfolio. Currently, API users can only get a list of portfolios that they themselves own.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* limit Integer Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
* offset String Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. 'Note: You can only pass in an offset that was returned to you via a previously paginated request.' (optional)
* returns getPortfolios_200_response
* */
const getPortfolios = ({ workspace, owner, optUnderscorepretty, optUnderscorefields, limit, offset }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        workspace,
        owner,
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
* Remove a custom field from a portfolio
* Removes a custom field setting from a portfolio.
*
* portfolioUnderscoregid String Globally unique identifier for the portfolio.
* removeCustomFieldSettingForPortfolioRequest RemoveCustomFieldSettingForPortfolioRequest Information about the custom field setting being removed.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* returns deleteAttachment_200_response
* */
const removeCustomFieldSettingForPortfolio = ({ portfolioUnderscoregid, removeCustomFieldSettingForPortfolioRequest, optUnderscorepretty }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        portfolioUnderscoregid,
        removeCustomFieldSettingForPortfolioRequest,
        optUnderscorepretty,
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
* Remove a portfolio item
* Remove an item from a portfolio. Returns an empty data block.
*
* portfolioUnderscoregid String Globally unique identifier for the portfolio.
* removeItemForPortfolioRequest RemoveItemForPortfolioRequest Information about the item being removed.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns deleteAttachment_200_response
* */
const removeItemForPortfolio = ({ portfolioUnderscoregid, removeItemForPortfolioRequest, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        portfolioUnderscoregid,
        removeItemForPortfolioRequest,
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
* Remove users from a portfolio
* Removes the specified list of users from members of the portfolio. Returns the updated portfolio record.
*
* portfolioUnderscoregid String Globally unique identifier for the portfolio.
* removeMembersForPortfolioRequest RemoveMembersForPortfolioRequest Information about the members being removed.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns createPortfolio_201_response
* */
const removeMembersForPortfolio = ({ portfolioUnderscoregid, removeMembersForPortfolioRequest, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        portfolioUnderscoregid,
        removeMembersForPortfolioRequest,
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
* Update a portfolio
* An existing portfolio can be updated by making a PUT request on the URL for that portfolio. Only the fields provided in the `data` block will be updated; any unspecified fields will remain unchanged.  Returns the complete updated portfolio record.
*
* portfolioUnderscoregid String Globally unique identifier for the portfolio.
* createPortfolioRequest CreatePortfolioRequest The updated fields for the portfolio.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns createPortfolio_201_response
* */
const updatePortfolio = ({ portfolioUnderscoregid, createPortfolioRequest, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        portfolioUnderscoregid,
        createPortfolioRequest,
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
  addCustomFieldSettingForPortfolio,
  addItemForPortfolio,
  addMembersForPortfolio,
  createPortfolio,
  deletePortfolio,
  getItemsForPortfolio,
  getPortfolio,
  getPortfolios,
  removeCustomFieldSettingForPortfolio,
  removeItemForPortfolio,
  removeMembersForPortfolio,
  updatePortfolio,
};

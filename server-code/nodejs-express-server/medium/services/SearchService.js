/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Search Articles
* Returns the list of `articles_ids` for the given search query results. (Max Length = 1000) 
*
* query String Search query
* returns _search_articles_query__query__get_200_response
* */
const searchArticlesqueryqueryGET = ({ query }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        query,
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
* Search Lists
* Returns an array of `list_ids` for the given search query results. (Max Length = 1000) 
*
* query String Search query
* returns _search_lists_query__query__get_200_response
* */
const searchListsqueryqueryGET = ({ query }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        query,
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
* Search Publications
* Returns the list of `publication_ids` for the given search query results. (Max Length = 1000) 
*
* query String Search query
* returns _search_publications_query__query__get_200_response
* */
const searchPublicationsqueryqueryGET = ({ query }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        query,
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
* Search Tags
* Returns a list of `tags` for the given search query results. (Max Length = 1000) 
*
* query String Search query
* returns _search_tags_query__query__get_200_response
* */
const searchTagsqueryqueryGET = ({ query }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        query,
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
* Search Users
* Returns a list of `user_ids` for the given search query results. (Max Length = 1000) 
*
* query String Search query
* returns _search_users_query__query__get_200_response
* */
const searchUsersqueryqueryGET = ({ query }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        query,
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
  searchArticlesqueryqueryGET,
  searchListsqueryqueryGET,
  searchPublicationsqueryqueryGET,
  searchTagsqueryqueryGET,
  searchUsersqueryqueryGET,
};

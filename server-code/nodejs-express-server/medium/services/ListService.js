/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get List Articles
* Returns an array of `articles_ids` present in the given Medium List. 
*
* listUnderscoreid String It's a unique hash id assigned to every Medium List.
* returns _list__list_id__articles_get_200_response
* */
const listListIdArticlesGET = ({ listUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        listUnderscoreid,
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
* Get List Info
* Returns the list-related information such as *id, name, author, description,  thumbnail image url, creation datetime, last article inserted datetime,  number of articles in the list, claps, voters, and comments/responses*. 
*
* listUnderscoreid String It's a unique hash id assigned to every Medium List.
* returns _list__list_id__get_200_response
* */
const listListIdGET = ({ listUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        listUnderscoreid,
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
* Get List Responses
* Returns an array of `response_ids` of the comments (same as `article_ids`) on the given Medium List. 
*
* listUnderscoreid String It's a unique hash id assigned to every Medium List.
* returns _list__list_id__responses_get_200_response
* */
const listListIdResponsesGET = ({ listUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        listUnderscoreid,
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
  listListIdArticlesGET,
  listListIdGET,
  listListIdResponsesGET,
};

/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get Article's Content
* Returns the content of an article/story, for the corresponding `article_id` 
*
* articleUnderscoreid String It's a unique hash id assigned to every Medium Article.
* returns _article__article_id__content_get_200_response
* */
const articleArticleIdContentGET = ({ articleUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        articleUnderscoreid,
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
* Get Article Fans
* Returns a list of `user_ids` of the people who clapped on the article (a.k.a `voters`). 
*
* articleUnderscoreid String It's a unique hash id assigned to every Medium Article.
* returns _article__article_id__fans_get_200_response
* */
const articleArticleIdFansGET = ({ articleUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        articleUnderscoreid,
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
* Get Article Info
* Returns the article related information such as *Title, Subtitle, Tags,  Topics* (assigned by Medium), *Publication, Published date and time,  Clap Count, Voter Count, Word Count, Reading Time, Language, etc…* 
*
* articleUnderscoreid String It's a unique hash id assigned to every Medium Article.
* returns _article__article_id__get_200_response
* */
const articleArticleIdGET = ({ articleUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        articleUnderscoreid,
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
* Get Article's Markdown
* Returns the markdown of an article/story from Medium, for the corresponding `article_id` 
*
* articleUnderscoreid String It's a unique hash id assigned to every Medium Article.
* returns _article__article_id__markdown_get_200_response
* */
const articleArticleIdMarkdownGET = ({ articleUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        articleUnderscoreid,
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
* Get Related Articles
* Returns a list of `article_ids` of the related posts. (Length = 5)  **Note:** If the given article is self-published, related posts will belong to the same author,  else related posts will belong to the publication in which the article is published. 
*
* articleUnderscoreid String It's a unique hash id assigned to every Medium Article.
* returns _article__article_id__related_get_200_response
* */
const articleArticleIdRelatedGET = ({ articleUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        articleUnderscoreid,
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
* Get Article Responses
* Returns a list of responses (`response_ids`, same as `article_ids`) for a given article (`article_id`) Note: To see the content of the response, use the \"Get Article's Content\" endpoint 
*
* articleUnderscoreid String It's a unique hash id assigned to every Medium Article.
* returns _article__article_id__responses_get_200_response
* */
const articleArticleIdResponsesGET = ({ articleUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        articleUnderscoreid,
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
  articleArticleIdContentGET,
  articleArticleIdFansGET,
  articleArticleIdGET,
  articleArticleIdMarkdownGET,
  articleArticleIdRelatedGET,
  articleArticleIdResponsesGET,
};

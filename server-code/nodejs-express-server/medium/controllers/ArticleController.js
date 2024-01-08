/**
 * The ArticleController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ArticleService');
const articleArticleIdContentGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.articleArticleIdContentGET);
};

const articleArticleIdFansGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.articleArticleIdFansGET);
};

const articleArticleIdGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.articleArticleIdGET);
};

const articleArticleIdMarkdownGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.articleArticleIdMarkdownGET);
};

const articleArticleIdRelatedGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.articleArticleIdRelatedGET);
};

const articleArticleIdResponsesGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.articleArticleIdResponsesGET);
};


module.exports = {
  articleArticleIdContentGET,
  articleArticleIdFansGET,
  articleArticleIdGET,
  articleArticleIdMarkdownGET,
  articleArticleIdRelatedGET,
  articleArticleIdResponsesGET,
};

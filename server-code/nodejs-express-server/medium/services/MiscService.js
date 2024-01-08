/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get Latest Posts
* Returns a list of latest posts (`article_ids`) for a topic/niche (as classified by the Medium platform). Example of a topic/niche can be: * blockchain * relationships * mental-health, etc …  These are known as `topic_slugs`. At any given moment, this endpoint will return a list of 25 articles (`article_ids`). 
*
* topicUnderscoreslug String It's a unique string, usually hyphen-separated, representing a topic/niche, as classified by Medium.
* returns _latestposts__topic_slug__get_200_response
* */
const latestpostsTopicSlugGET = ({ topicUnderscoreslug }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        topicUnderscoreslug,
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
* Get Related Tags
* Returns a list of `related_tags` for the given `tag`. 
*
* tag String It's a unique string, usually hyphen-separated, representing a class of content.
* returns _related_tags__tag__get_200_response
* */
const related_tagsTagGET = ({ tag }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        tag,
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
* Get Top Writers
* Returns a list of top writers (`user_ids`) within a particular topic/niche (`topic_slug`).  e.g.  - blockchain - relationships - artificial-intelligence, etc ...  **Note:** You can use optional `count` query parameter to limit the number of results.  The maximum number of top writers within a topic/niche will be 250. 
*
* topicUnderscoreslug String It's a unique string, usually hyphen-separated, representing a topic/niche, as classified by Medium.
* count Integer Limits the number of `article_ids` in the result. (optional)
* returns _top_writer__topic_slug__get_200_response
* */
const top_writerTopicSlugGET = ({ topicUnderscoreslug, count }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        topicUnderscoreslug,
        count,
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
* Get Topfeeds
* Returns a list of `article_ids` (length: 25) for the given `tag` and `mode`. 
*
* tag String It's a unique string, usually hyphen-separated, representing a class of content.
* mode String Mode:    - `hot` : For getting trending articles   - `new` : For getting latest articles   - `top_year` : For getting best articles of the year   - `top_month` : For getting best articles of the month   - `top_week` : For getting best articles of the week   - `top_all_time`: For getting best article of all time 
* after Integer To get the subsequent top feeds. (`after` &lt; 250) (optional)
* count Integer To limit the number of top feeds. (`count` &lt; 25) (optional)
* returns _topfeeds__tag___mode__get_200_response
* */
const topfeedsTagModeGET = ({ tag, mode, after, count }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        tag,
        mode,
        after,
        count,
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
  latestpostsTopicSlugGET,
  related_tagsTagGET,
  top_writerTopicSlugGET,
  topfeedsTagModeGET,
};

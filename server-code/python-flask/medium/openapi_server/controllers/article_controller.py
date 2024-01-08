import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.article_article_id_content_get200_response import ArticleArticleIdContentGet200Response  # noqa: E501
from openapi_server.models.article_article_id_fans_get200_response import ArticleArticleIdFansGet200Response  # noqa: E501
from openapi_server.models.article_article_id_get200_response import ArticleArticleIdGet200Response  # noqa: E501
from openapi_server.models.article_article_id_markdown_get200_response import ArticleArticleIdMarkdownGet200Response  # noqa: E501
from openapi_server.models.article_article_id_related_get200_response import ArticleArticleIdRelatedGet200Response  # noqa: E501
from openapi_server.models.article_article_id_responses_get200_response import ArticleArticleIdResponsesGet200Response  # noqa: E501
from openapi_server import util


def article_article_id_content_get(article_id):  # noqa: E501
    """Get Article&#39;s Content

    Returns the content of an article/story, for the corresponding &#x60;article_id&#x60;  # noqa: E501

    :param article_id: It&#39;s a unique hash id assigned to every Medium Article.
    :type article_id: str

    :rtype: Union[ArticleArticleIdContentGet200Response, Tuple[ArticleArticleIdContentGet200Response, int], Tuple[ArticleArticleIdContentGet200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def article_article_id_fans_get(article_id):  # noqa: E501
    """Get Article Fans

    Returns a list of &#x60;user_ids&#x60; of the people who clapped on the article (a.k.a &#x60;voters&#x60;).  # noqa: E501

    :param article_id: It&#39;s a unique hash id assigned to every Medium Article.
    :type article_id: str

    :rtype: Union[ArticleArticleIdFansGet200Response, Tuple[ArticleArticleIdFansGet200Response, int], Tuple[ArticleArticleIdFansGet200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def article_article_id_get(article_id):  # noqa: E501
    """Get Article Info

    Returns the article related information such as *Title, Subtitle, Tags,  Topics* (assigned by Medium), *Publication, Published date and time,  Clap Count, Voter Count, Word Count, Reading Time, Language, etc…*  # noqa: E501

    :param article_id: It&#39;s a unique hash id assigned to every Medium Article.
    :type article_id: str

    :rtype: Union[ArticleArticleIdGet200Response, Tuple[ArticleArticleIdGet200Response, int], Tuple[ArticleArticleIdGet200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def article_article_id_markdown_get(article_id):  # noqa: E501
    """Get Article&#39;s Markdown

    Returns the markdown of an article/story from Medium, for the corresponding &#x60;article_id&#x60;  # noqa: E501

    :param article_id: It&#39;s a unique hash id assigned to every Medium Article.
    :type article_id: str

    :rtype: Union[ArticleArticleIdMarkdownGet200Response, Tuple[ArticleArticleIdMarkdownGet200Response, int], Tuple[ArticleArticleIdMarkdownGet200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def article_article_id_related_get(article_id):  # noqa: E501
    """Get Related Articles

    Returns a list of &#x60;article_ids&#x60; of the related posts. (Length &#x3D; 5)  **Note:** If the given article is self-published, related posts will belong to the same author,  else related posts will belong to the publication in which the article is published.  # noqa: E501

    :param article_id: It&#39;s a unique hash id assigned to every Medium Article.
    :type article_id: str

    :rtype: Union[ArticleArticleIdRelatedGet200Response, Tuple[ArticleArticleIdRelatedGet200Response, int], Tuple[ArticleArticleIdRelatedGet200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def article_article_id_responses_get(article_id):  # noqa: E501
    """Get Article Responses

    Returns a list of responses (&#x60;response_ids&#x60;, same as &#x60;article_ids&#x60;) for a given article (&#x60;article_id&#x60;) Note: To see the content of the response, use the \&quot;Get Article&#39;s Content\&quot; endpoint  # noqa: E501

    :param article_id: It&#39;s a unique hash id assigned to every Medium Article.
    :type article_id: str

    :rtype: Union[ArticleArticleIdResponsesGet200Response, Tuple[ArticleArticleIdResponsesGet200Response, int], Tuple[ArticleArticleIdResponsesGet200Response, int, Dict[str, str]]
    """
    return 'do some magic!'

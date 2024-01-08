import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.search_articles_query_query_get200_response import SearchArticlesQueryQueryGet200Response  # noqa: E501
from openapi_server.models.search_lists_query_query_get200_response import SearchListsQueryQueryGet200Response  # noqa: E501
from openapi_server.models.search_publications_query_query_get200_response import SearchPublicationsQueryQueryGet200Response  # noqa: E501
from openapi_server.models.search_tags_query_query_get200_response import SearchTagsQueryQueryGet200Response  # noqa: E501
from openapi_server.models.search_users_query_query_get200_response import SearchUsersQueryQueryGet200Response  # noqa: E501
from openapi_server import util


def search_articlesqueryquery_get(query):  # noqa: E501
    """Search Articles

    Returns the list of &#x60;articles_ids&#x60; for the given search query results. (Max Length &#x3D; 1000)  # noqa: E501

    :param query: Search query
    :type query: str

    :rtype: Union[SearchArticlesQueryQueryGet200Response, Tuple[SearchArticlesQueryQueryGet200Response, int], Tuple[SearchArticlesQueryQueryGet200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_listsqueryquery_get(query):  # noqa: E501
    """Search Lists

    Returns an array of &#x60;list_ids&#x60; for the given search query results. (Max Length &#x3D; 1000)  # noqa: E501

    :param query: Search query
    :type query: str

    :rtype: Union[SearchListsQueryQueryGet200Response, Tuple[SearchListsQueryQueryGet200Response, int], Tuple[SearchListsQueryQueryGet200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_publicationsqueryquery_get(query):  # noqa: E501
    """Search Publications

    Returns the list of &#x60;publication_ids&#x60; for the given search query results. (Max Length &#x3D; 1000)  # noqa: E501

    :param query: Search query
    :type query: str

    :rtype: Union[SearchPublicationsQueryQueryGet200Response, Tuple[SearchPublicationsQueryQueryGet200Response, int], Tuple[SearchPublicationsQueryQueryGet200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_tagsqueryquery_get(query):  # noqa: E501
    """Search Tags

    Returns a list of &#x60;tags&#x60; for the given search query results. (Max Length &#x3D; 1000)  # noqa: E501

    :param query: Search query
    :type query: str

    :rtype: Union[SearchTagsQueryQueryGet200Response, Tuple[SearchTagsQueryQueryGet200Response, int], Tuple[SearchTagsQueryQueryGet200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_usersqueryquery_get(query):  # noqa: E501
    """Search Users

    Returns a list of &#x60;user_ids&#x60; for the given search query results. (Max Length &#x3D; 1000)  # noqa: E501

    :param query: Search query
    :type query: str

    :rtype: Union[SearchUsersQueryQueryGet200Response, Tuple[SearchUsersQueryQueryGet200Response, int], Tuple[SearchUsersQueryQueryGet200Response, int, Dict[str, str]]
    """
    return 'do some magic!'

import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.list_list_id_articles_get200_response import ListListIdArticlesGet200Response  # noqa: E501
from openapi_server.models.list_list_id_get200_response import ListListIdGet200Response  # noqa: E501
from openapi_server.models.list_list_id_responses_get200_response import ListListIdResponsesGet200Response  # noqa: E501
from openapi_server import util


def list_list_id_articles_get(list_id):  # noqa: E501
    """Get List Articles

    Returns an array of &#x60;articles_ids&#x60; present in the given Medium List.  # noqa: E501

    :param list_id: It&#39;s a unique hash id assigned to every Medium List.
    :type list_id: str

    :rtype: Union[ListListIdArticlesGet200Response, Tuple[ListListIdArticlesGet200Response, int], Tuple[ListListIdArticlesGet200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def list_list_id_get(list_id):  # noqa: E501
    """Get List Info

    Returns the list-related information such as *id, name, author, description,  thumbnail image url, creation datetime, last article inserted datetime,  number of articles in the list, claps, voters, and comments/responses*.  # noqa: E501

    :param list_id: It&#39;s a unique hash id assigned to every Medium List.
    :type list_id: str

    :rtype: Union[ListListIdGet200Response, Tuple[ListListIdGet200Response, int], Tuple[ListListIdGet200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def list_list_id_responses_get(list_id):  # noqa: E501
    """Get List Responses

    Returns an array of &#x60;response_ids&#x60; of the comments (same as &#x60;article_ids&#x60;) on the given Medium List.  # noqa: E501

    :param list_id: It&#39;s a unique hash id assigned to every Medium List.
    :type list_id: str

    :rtype: Union[ListListIdResponsesGet200Response, Tuple[ListListIdResponsesGet200Response, int], Tuple[ListListIdResponsesGet200Response, int, Dict[str, str]]
    """
    return 'do some magic!'

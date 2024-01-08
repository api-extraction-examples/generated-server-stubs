import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.snippet import Snippet  # noqa: E501
from openapi_server import util


def create_site_snippet(site_id, snippet):  # noqa: E501
    """create_site_snippet

     # noqa: E501

    :param site_id: 
    :type site_id: str
    :param snippet: 
    :type snippet: dict | bytes

    :rtype: Union[Snippet, Tuple[Snippet, int], Tuple[Snippet, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        snippet = Snippet.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_site_snippet(site_id, snippet_id):  # noqa: E501
    """delete_site_snippet

     # noqa: E501

    :param site_id: 
    :type site_id: str
    :param snippet_id: 
    :type snippet_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_site_snippet(site_id, snippet_id):  # noqa: E501
    """get_site_snippet

     # noqa: E501

    :param site_id: 
    :type site_id: str
    :param snippet_id: 
    :type snippet_id: str

    :rtype: Union[Snippet, Tuple[Snippet, int], Tuple[Snippet, int, Dict[str, str]]
    """
    return 'do some magic!'


def list_site_snippets(site_id):  # noqa: E501
    """list_site_snippets

     # noqa: E501

    :param site_id: 
    :type site_id: str

    :rtype: Union[List[Snippet], Tuple[List[Snippet], int], Tuple[List[Snippet], int, Dict[str, str]]
    """
    return 'do some magic!'


def update_site_snippet(site_id, snippet_id, snippet):  # noqa: E501
    """update_site_snippet

     # noqa: E501

    :param site_id: 
    :type site_id: str
    :param snippet_id: 
    :type snippet_id: str
    :param snippet: 
    :type snippet: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        snippet = Snippet.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'

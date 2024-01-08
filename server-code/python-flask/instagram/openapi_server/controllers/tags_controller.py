import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.tag_info_response import TagInfoResponse  # noqa: E501
from openapi_server.models.tag_media_list_response import TagMediaListResponse  # noqa: E501
from openapi_server.models.tag_search_response import TagSearchResponse  # noqa: E501
from openapi_server import util


def tags_search_get(q):  # noqa: E501
    """Search for tags by name.

    Search for tags by name. # noqa: E501

    :param q: A valid tag name without a leading \\#. (eg. snowy, nofilter)
    :type q: str

    :rtype: Union[TagSearchResponse, Tuple[TagSearchResponse, int], Tuple[TagSearchResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def tags_tag_name_get(tag_name):  # noqa: E501
    """Get information about a tag object.

    Get information about a tag object. # noqa: E501

    :param tag_name: The tag name.
    :type tag_name: str

    :rtype: Union[TagInfoResponse, Tuple[TagInfoResponse, int], Tuple[TagInfoResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def tags_tag_name_media_recent_get(tag_name, count=None, min_tag_id=None, max_tag_id=None):  # noqa: E501
    """Get a list of recently tagged media.

    Get a list of recently tagged media. Use the &#x60;max_tag_id&#x60; and &#x60;min_tag_id&#x60; parameters in the pagination response to paginate through these objects.  # noqa: E501

    :param tag_name: The tag name.
    :type tag_name: str
    :param count: Count of tagged media to return.
    :type count: int
    :param min_tag_id: Return media before this &#x60;min_tag_id&#x60;.
    :type min_tag_id: str
    :param max_tag_id: Return media after this &#x60;max_tag_id&#x60;.
    :type max_tag_id: str

    :rtype: Union[TagMediaListResponse, Tuple[TagMediaListResponse, int], Tuple[TagMediaListResponse, int, Dict[str, str]]
    """
    return 'do some magic!'

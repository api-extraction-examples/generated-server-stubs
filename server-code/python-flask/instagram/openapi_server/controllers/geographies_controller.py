import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.media_list_response import MediaListResponse  # noqa: E501
from openapi_server import util


def geographies_geo_id_media_recent_get(geo_id, count=None, min_id=None):  # noqa: E501
    """Get recent media from a custom geo-id.

    Get recent media from a geography subscription that you created.  **Note:** You can only access Geographies that were explicitly created by your OAuth client. Check the Geography Subscriptions section of the [real-time updates page](https://instagram.com/developer/realtime/). When you create a subscription to some geography that you define, you will be returned a unique &#x60;geo-id&#x60; that can be used in this query. To backfill photos from the location covered by this geography, use the [media search endpoint](https://instagram.com/developer/endpoints/media/).  **Warning:** [Deprecated](http://instagram.com/developer/changelog/) for Apps created **on or after** Nov 17, 2015  # noqa: E501

    :param geo_id: The geography ID.
    :type geo_id: str
    :param count: Max number of media to return.
    :type count: int
    :param min_id: Return media before this &#x60;min_id&#x60;.
    :type min_id: str

    :rtype: Union[MediaListResponse, Tuple[MediaListResponse, int], Tuple[MediaListResponse, int, Dict[str, str]]
    """
    return 'do some magic!'

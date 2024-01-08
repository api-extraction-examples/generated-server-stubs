import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.location_info_response import LocationInfoResponse  # noqa: E501
from openapi_server.models.location_search_response import LocationSearchResponse  # noqa: E501
from openapi_server.models.media_list_response import MediaListResponse  # noqa: E501
from openapi_server import util


def locations_location_id_get(location_id):  # noqa: E501
    """Get information about a location.

    Get information about a location. # noqa: E501

    :param location_id: The location ID.
    :type location_id: str

    :rtype: Union[LocationInfoResponse, Tuple[LocationInfoResponse, int], Tuple[LocationInfoResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def locations_location_id_media_recent_get(location_id, min_timestamp=None, max_timestamp=None, min_id=None, max_id=None):  # noqa: E501
    """Get a list of recent media objects from a given location.

    Get a list of recent media objects from a given location. # noqa: E501

    :param location_id: The location ID.
    :type location_id: str
    :param min_timestamp: Return media after this UNIX timestamp.
    :type min_timestamp: int
    :param max_timestamp: Return media before this UNIX timestamp.
    :type max_timestamp: int
    :param min_id: Return media before this &#x60;min_id&#x60;.
    :type min_id: str
    :param max_id: Return media after this &#x60;max_id&#x60;.
    :type max_id: str

    :rtype: Union[MediaListResponse, Tuple[MediaListResponse, int], Tuple[MediaListResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def locations_search_get(distance=None, facebook_places_id=None, foursquare_id=None, lat=None, lng=None, foursquare_v2_id=None):  # noqa: E501
    """Search for a location by geographic coordinate.

    Search for a location by geographic coordinate. # noqa: E501

    :param distance: Default is 1000m (distance&#x3D;1000), max distance is 5000.
    :type distance: int
    :param facebook_places_id: Returns a location mapped off of a Facebook places id. If used, a Foursquare id and &#x60;lat&#x60;, &#x60;lng&#x60; are not required.
    :type facebook_places_id: str
    :param foursquare_id: Returns a location mapped off of a foursquare v1 api location id. If used, you are not required to use &#x60;lat&#x60; and &#x60;lng&#x60;. Note that this method is deprecated; you should use the new foursquare IDs with V2 of their API. 
    :type foursquare_id: str
    :param lat: Latitude of the center search coordinate. If used, &#x60;lng&#x60; is required.
    :type lat: float
    :param lng: Longitude of the center search coordinate. If used, &#x60;lat&#x60; is required.
    :type lng: float
    :param foursquare_v2_id: Returns a location mapped off of a foursquare v2 api location id. If used, you are not required to use &#x60;lat&#x60; and &#x60;lng&#x60;. 
    :type foursquare_v2_id: str

    :rtype: Union[LocationSearchResponse, Tuple[LocationSearchResponse, int], Tuple[LocationSearchResponse, int, Dict[str, str]]
    """
    return 'do some magic!'

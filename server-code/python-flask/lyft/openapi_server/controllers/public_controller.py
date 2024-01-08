import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.api_error import ApiError  # noqa: E501
from openapi_server.models.cost_estimate_response import CostEstimateResponse  # noqa: E501
from openapi_server.models.eta_estimate_response import EtaEstimateResponse  # noqa: E501
from openapi_server.models.nearby_drivers_response import NearbyDriversResponse  # noqa: E501
from openapi_server.models.ride_types_response import RideTypesResponse  # noqa: E501
from openapi_server import util


def get_cost(start_lat, start_lng, ride_type=None, end_lat=None, end_lng=None):  # noqa: E501
    """Cost estimates

    Estimate the cost of taking a Lyft between two points.  # noqa: E501

    :param start_lat: Latitude of the starting location
    :type start_lat: float
    :param start_lng: Longitude of the starting location
    :type start_lng: float
    :param ride_type: ID of a ride type
    :type ride_type: str
    :param end_lat: Latitude of the ending location
    :type end_lat: float
    :param end_lng: Longitude of the ending location
    :type end_lng: float

    :rtype: Union[CostEstimateResponse, Tuple[CostEstimateResponse, int], Tuple[CostEstimateResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_drivers(lat, lng):  # noqa: E501
    """Available drivers nearby

    The drivers endpoint returns a list of nearby drivers&#39; lat and lng at a given location.  # noqa: E501

    :param lat: Latitude of a location
    :type lat: float
    :param lng: Longitude of a location
    :type lng: float

    :rtype: Union[NearbyDriversResponse, Tuple[NearbyDriversResponse, int], Tuple[NearbyDriversResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_eta(lat, lng, destination_lat=None, destination_lng=None, ride_type=None):  # noqa: E501
    """Pickup ETAs

    The ETA endpoint lets you know how quickly a Lyft driver can come get you  # noqa: E501

    :param lat: Latitude of a location
    :type lat: float
    :param lng: Longitude of a location
    :type lng: float
    :param destination_lat: Latitude of destination location
    :type destination_lat: float
    :param destination_lng: Longitude of destination location
    :type destination_lng: float
    :param ride_type: ID of a ride type
    :type ride_type: str

    :rtype: Union[EtaEstimateResponse, Tuple[EtaEstimateResponse, int], Tuple[EtaEstimateResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_ride_types(lat, lng, ride_type=None):  # noqa: E501
    """Types of rides

    The ride types endpoint returns information about what kinds of Lyft rides you can request at a given location.  # noqa: E501

    :param lat: Latitude of a location
    :type lat: float
    :param lng: Longitude of a location
    :type lng: float
    :param ride_type: ID of a ride type
    :type ride_type: str

    :rtype: Union[RideTypesResponse, Tuple[RideTypesResponse, int], Tuple[RideTypesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'

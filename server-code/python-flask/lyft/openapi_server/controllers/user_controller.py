import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.api_error import ApiError  # noqa: E501
from openapi_server.models.cancellation_cost_error import CancellationCostError  # noqa: E501
from openapi_server.models.cancellation_request import CancellationRequest  # noqa: E501
from openapi_server.models.location import Location  # noqa: E501
from openapi_server.models.profile import Profile  # noqa: E501
from openapi_server.models.rating_request import RatingRequest  # noqa: E501
from openapi_server.models.ride import Ride  # noqa: E501
from openapi_server.models.ride_detail import RideDetail  # noqa: E501
from openapi_server.models.ride_receipt import RideReceipt  # noqa: E501
from openapi_server.models.ride_request import RideRequest  # noqa: E501
from openapi_server.models.ride_request_error import RideRequestError  # noqa: E501
from openapi_server.models.rides_response import RidesResponse  # noqa: E501
from openapi_server import util


def cancel_ride(id, request=None):  # noqa: E501
    """Cancel a ongoing requested ride

    Cancel a ongoing ride which was requested earlier by providing the ride id.  # noqa: E501

    :param id: The ID of the ride
    :type id: str
    :param request: 
    :type request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        request = CancellationRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_profile():  # noqa: E501
    """The user&#39;s general info

    The v1 of this endpoint returns the user&#39;s ID, v2 will return more general info about the user. We require authentication for this endpoint, so we extract the user ID from the access token.  # noqa: E501


    :rtype: Union[Profile, Tuple[Profile, int], Tuple[Profile, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_ride(id):  # noqa: E501
    """Get the ride detail of a given ride ID

    Get the status of a ride along with information about the driver, vehicle and price of a given ride ID  # noqa: E501

    :param id: The ID of the ride
    :type id: str

    :rtype: Union[RideDetail, Tuple[RideDetail, int], Tuple[RideDetail, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_ride_receipt(id):  # noqa: E501
    """Get the receipt of the rides.

    Get the receipt information of a processed ride by providing the ride id. Receipts will only be available to view once the payment has been processed. In the case of canceled ride, cancellation penalty is included if applicable.  # noqa: E501

    :param id: The ID of the ride
    :type id: str

    :rtype: Union[RideReceipt, Tuple[RideReceipt, int], Tuple[RideReceipt, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_rides(start_time, end_time=None, limit=None):  # noqa: E501
    """List rides

    Get a list of past &amp; current rides for this passenger.  # noqa: E501

    :param start_time: Restrict to rides starting after this point in time. The earliest supported date is 2015-01-01T00:00:00+00:00 
    :type start_time: str
    :param end_time: Restrict to rides starting before this point in time. The earliest supported date is 2015-01-01T00:00:00+00:00 
    :type end_time: str
    :param limit: The maximum number of rides to return. The default limit is 10 if not specified. The maximum allowed value is 50, an integer greater that 50 will return at most 50 results. 
    :type limit: int

    :rtype: Union[RidesResponse, Tuple[RidesResponse, int], Tuple[RidesResponse, int, Dict[str, str]]
    """
    start_time = util.deserialize_datetime(start_time)
    end_time = util.deserialize_datetime(end_time)
    return 'do some magic!'


def new_ride(request):  # noqa: E501
    """Request a Lyft

    Request a Lyft come pick you up at the given location.  # noqa: E501

    :param request: Ride request information
    :type request: dict | bytes

    :rtype: Union[RideRequest, Tuple[RideRequest, int], Tuple[RideRequest, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        request = Ride.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def set_ride_destination(id, request):  # noqa: E501
    """Update the destination of the ride

    Add or update the ride&#39;s destination. Note that the ride must still be active (not droppedOff or canceled), and that destinations on Lyft Line rides can not be changed.  # noqa: E501

    :param id: The ID of the ride
    :type id: str
    :param request: The coordinates and optional address of the destination
    :type request: dict | bytes

    :rtype: Union[Location, Tuple[Location, int], Tuple[Location, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        request = Location.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def set_ride_rating(id, request):  # noqa: E501
    """Add the passenger&#39;s rating, feedback, and tip

    Add the passenger&#39;s 1 to 5 star rating of the ride, optional written feedback, and optional tip amount in minor units and currency. The ride must already be dropped off, and ratings must be given within 24 hours of drop off. For purposes of display, 5 is considered the default rating. When this endpoint is successfully called, payment processing will begin.  # noqa: E501

    :param id: The ID of the ride
    :type id: str
    :param request: The rating and optional feedback
    :type request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        request = RatingRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'

import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.api_error import ApiError  # noqa: E501
from openapi_server.models.sandbox_driver_availability import SandboxDriverAvailability  # noqa: E501
from openapi_server.models.sandbox_primetime import SandboxPrimetime  # noqa: E501
from openapi_server.models.sandbox_ride_status import SandboxRideStatus  # noqa: E501
from openapi_server.models.sandbox_ride_type import SandboxRideType  # noqa: E501
from openapi_server.models.sandbox_ride_update import SandboxRideUpdate  # noqa: E501
from openapi_server import util


def set_prime_time(request):  # noqa: E501
    """Preset Prime Time percentage

    Preset a Prime Time percentage in the region surrounding the specified location. This Prime Time percentage will be applied when requesting cost, or when requesting a ride in sandbox mode.  # noqa: E501

    :param request: Prime Time to be preset in the region surrounding the lat, lng
    :type request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        request = SandboxPrimetime.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def set_ride_status(id, request):  # noqa: E501
    """Propagate ride through ride status

    Propagate a sandbox-ride through various ride status  # noqa: E501

    :param id: The ID of the ride
    :type id: str
    :param request: status to propagate the ride into
    :type request: dict | bytes

    :rtype: Union[SandboxRideUpdate, Tuple[SandboxRideUpdate, int], Tuple[SandboxRideUpdate, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        request = SandboxRideStatus.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def set_ride_type_availability(ride_type, request):  # noqa: E501
    """Driver availability for processing ride request

    Set driver availability for the provided ride_type in the city/region surrounding the specified location  # noqa: E501

    :param ride_type: 
    :type ride_type: str
    :param request: Driver availability to be preset in the region surrounding the lat, lng
    :type request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        request = SandboxDriverAvailability.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def set_ride_types(request):  # noqa: E501
    """Preset types of rides for sandbox

    The sandbox-ridetypes endpoint allows you to preset the ridetypes in the region surrounding the specified latitude and longitude to allow testing different scenarios  # noqa: E501

    :param request: Ridetypes to be preset in the region surrounding the lat, lng
    :type request: dict | bytes

    :rtype: Union[SandboxRideType, Tuple[SandboxRideType, int], Tuple[SandboxRideType, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        request = SandboxRideType.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'

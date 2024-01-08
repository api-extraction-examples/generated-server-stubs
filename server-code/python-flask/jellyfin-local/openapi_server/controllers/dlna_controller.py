import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.device_profile import DeviceProfile  # noqa: E501
from openapi_server.models.device_profile_info import DeviceProfileInfo  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server import util


def create_profile(device_profile=None):  # noqa: E501
    """Creates a profile.

     # noqa: E501

    :param device_profile: Device profile.
    :type device_profile: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        device_profile = DeviceProfile.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_profile(profile_id):  # noqa: E501
    """Deletes a profile.

     # noqa: E501

    :param profile_id: Profile id.
    :type profile_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_default_profile():  # noqa: E501
    """Gets the default profile.

     # noqa: E501


    :rtype: Union[DeviceProfile, Tuple[DeviceProfile, int], Tuple[DeviceProfile, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_profile(profile_id):  # noqa: E501
    """Gets a single profile.

     # noqa: E501

    :param profile_id: Profile Id.
    :type profile_id: str

    :rtype: Union[DeviceProfile, Tuple[DeviceProfile, int], Tuple[DeviceProfile, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_profile_infos():  # noqa: E501
    """Get profile infos.

     # noqa: E501


    :rtype: Union[List[DeviceProfileInfo], Tuple[List[DeviceProfileInfo], int], Tuple[List[DeviceProfileInfo], int, Dict[str, str]]
    """
    return 'do some magic!'


def update_profile(profile_id, device_profile=None):  # noqa: E501
    """Updates a profile.

     # noqa: E501

    :param profile_id: Profile id.
    :type profile_id: str
    :param device_profile: Device profile.
    :type device_profile: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        device_profile = DeviceProfile.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'

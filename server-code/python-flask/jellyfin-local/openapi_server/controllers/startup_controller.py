import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.startup_configuration_dto import StartupConfigurationDto  # noqa: E501
from openapi_server.models.startup_remote_access_dto import StartupRemoteAccessDto  # noqa: E501
from openapi_server.models.startup_user_dto import StartupUserDto  # noqa: E501
from openapi_server import util


def complete_wizard():  # noqa: E501
    """Completes the startup wizard.

     # noqa: E501


    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_first_user():  # noqa: E501
    """Gets the first user.

     # noqa: E501


    :rtype: Union[StartupUserDto, Tuple[StartupUserDto, int], Tuple[StartupUserDto, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_first_user2():  # noqa: E501
    """Gets the first user.

     # noqa: E501


    :rtype: Union[StartupUserDto, Tuple[StartupUserDto, int], Tuple[StartupUserDto, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_startup_configuration():  # noqa: E501
    """Gets the initial startup wizard configuration.

     # noqa: E501


    :rtype: Union[StartupConfigurationDto, Tuple[StartupConfigurationDto, int], Tuple[StartupConfigurationDto, int, Dict[str, str]]
    """
    return 'do some magic!'


def set_remote_access(startup_remote_access_dto):  # noqa: E501
    """Sets remote access and UPnP.

     # noqa: E501

    :param startup_remote_access_dto: The startup remote access dto.
    :type startup_remote_access_dto: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        startup_remote_access_dto = StartupRemoteAccessDto.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_initial_configuration(startup_configuration_dto):  # noqa: E501
    """Sets the initial startup wizard configuration.

     # noqa: E501

    :param startup_configuration_dto: The updated startup configuration.
    :type startup_configuration_dto: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        startup_configuration_dto = StartupConfigurationDto.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_startup_user(startup_user_dto=None):  # noqa: E501
    """Sets the user name and password.

     # noqa: E501

    :param startup_user_dto: The DTO containing username and password.
    :type startup_user_dto: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        startup_user_dto = StartupUserDto.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'

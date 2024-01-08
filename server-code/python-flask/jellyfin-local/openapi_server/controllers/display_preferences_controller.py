import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.display_preferences_dto import DisplayPreferencesDto  # noqa: E501
from openapi_server import util


def get_display_preferences(display_preferences_id, user_id, client):  # noqa: E501
    """Get Display Preferences.

     # noqa: E501

    :param display_preferences_id: Display preferences id.
    :type display_preferences_id: str
    :param user_id: User id.
    :type user_id: str
    :type user_id: str
    :param client: Client.
    :type client: str

    :rtype: Union[DisplayPreferencesDto, Tuple[DisplayPreferencesDto, int], Tuple[DisplayPreferencesDto, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_display_preferences(display_preferences_id, user_id, client, display_preferences_dto):  # noqa: E501
    """Update Display Preferences.

     # noqa: E501

    :param display_preferences_id: Display preferences id.
    :type display_preferences_id: str
    :param user_id: User Id.
    :type user_id: str
    :type user_id: str
    :param client: Client.
    :type client: str
    :param display_preferences_dto: New Display Preferences object.
    :type display_preferences_dto: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        display_preferences_dto = DisplayPreferencesDto.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
